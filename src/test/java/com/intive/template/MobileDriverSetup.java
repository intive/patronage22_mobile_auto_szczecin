package com.intive.template;

import com.intive.template.configuration.ConfigurationManager;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


public class MobileDriverSetup {

    private static final Logger LOGGER = LoggerFactory.getLogger(MobileDriverSetup.class);
    public static AppiumDriver<MobileElement> DRIVER;
    public static final String USERNAME = System.getenv("BROWSERSTACK_USER");
    public static final String AUTOMATE_KEY = System.getenv("BROWSERSTACK_KEY");
    public static final String BROWSERSTACK_URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";


    public static void startDriver(String scenarioName) throws MalformedURLException {

        //This is rather for fun for BrowserStack , will be removed later
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd");
        String date = String.format("Patronage_date:%s", simpleDateFormat.format(new Date()));

        ConfigurationManager configurationManager = new ConfigurationManager();
        Map<String, String> capabilities_mobile = configurationManager.getMobileConfiguration();
        String useBrowserStack = System.getProperty("browserstack");

        if (useBrowserStack != null) {
            capabilities_mobile.put("project", "PatronageSzczecinMobile");
            capabilities_mobile.put("build", date);
            capabilities_mobile.put("name", scenarioName);
            DesiredCapabilities caps = new DesiredCapabilities(capabilities_mobile);
            DRIVER = new AndroidDriver<>(new URL(BROWSERSTACK_URL), caps);
        } else {
            String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
            String applicationLocation = String.format("%s/src/test/resources/application/%s", currentPath, "app-release.apk");
            capabilities_mobile.put("app", applicationLocation);
            DesiredCapabilities caps = new DesiredCapabilities(capabilities_mobile);
            DRIVER = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
        }
    }

    public static void destroyDriver() {
        DRIVER.quit();
    }

    private static void embedScreenshot(Scenario scenario) {
        byte[] screenshot = DRIVER.getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "screenshot");
    }

    private static void saveScreenshotFile(Scenario scenario) throws IOException {
        File srcFile = ((TakesScreenshot) DRIVER).getScreenshotAs(OutputType.FILE);
        String currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        FileUtils.copyFile(srcFile, new File(currentPath + "/screenshots/" + scenario.getName()
                + "-" + new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()) + ".png"));
    }

    private static void reportToBrowserStack(String result) {
        if (System.getProperty("browserstack") != null) {
            JavascriptExecutor jse = DRIVER;
            String bsScript = String.format("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"%s\"}}", result);
            jse.executeScript(bsScript);
        }
    }

    public static void processExecutedScenario(Scenario scenario) throws IOException {
        String status = (scenario.isFailed() ? "FAILED" : "SUCCESS");
        LOGGER.info("======================== SCENARIO FINISHED WITH " + status + " STATUS ===================\n");
        if (scenario.isFailed() && DRIVER != null) {
            reportToBrowserStack("failed");
            embedScreenshot(scenario);
            saveScreenshotFile(scenario);
        } else if (!scenario.isFailed() && DRIVER != null) {
            reportToBrowserStack("passed");
        }

        destroyDriver();
        LOGGER.info("================= CLEANUP AFTER SCENARIO =================\n");
    }
}
