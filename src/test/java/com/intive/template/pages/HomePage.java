package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage {

    @AndroidFindBy(id = "email")
    MobileElement emailField;

    @AndroidFindBy(id = "button_next")
    MobileElement nextButton;

    public void clickNextButton() {
        nextButton.click();
    }

    public void putMail(String mail) {

        emailField.setValue(mail);
    }

    public boolean isApplicationOpen() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 30);
        wait.until(ExpectedConditions.visibilityOf(emailField));
        return emailField.isDisplayed();
    }

    public String getEmail() {
        return emailField.getText();
    }
}
