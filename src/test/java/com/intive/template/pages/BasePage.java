package com.intive.template.pages;

import com.intive.template.MobileDriverSetup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public final AppiumDriver<MobileElement> DRIVER;

    protected BasePage() {
        this.DRIVER = MobileDriverSetup.DRIVER;
        PageFactory.initElements(new AppiumFieldDecorator(DRIVER), this);
    }

    public void restartApplication() {
        String packageName = ((AndroidDriver) DRIVER).getCurrentPackage();
        DRIVER.terminateApp(packageName);
        DRIVER.activateApp(packageName);
    }
}
