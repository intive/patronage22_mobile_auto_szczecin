package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage {

    @AndroidFindBy(id="email")
    MobileElement emailField;

    public void isApplicationOpen() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 10);
        wait.until(ExpectedConditions.visibilityOf(emailField));
        emailField.isDisplayed();
    }

    public String getEmail() {
        return emailField.getText();
    }
}
