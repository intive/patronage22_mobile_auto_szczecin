package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SplashPage extends BasePage {

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    MobileElement splashLogo;

    public boolean splashScreenIsDisplayed() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 30);
        wait.pollingEvery(Duration.ofMillis(1));
        wait.until(ExpectedConditions.visibilityOf(splashLogo));
        return splashLogo.isDisplayed();
    }
}
