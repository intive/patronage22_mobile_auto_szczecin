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

    @AndroidFindBy(id = "password")
    MobileElement passwordField;

    @AndroidFindBy(id = "button_done")
    MobileElement loginButton;

    public boolean isApplicationOpen() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 30);
        wait.until(ExpectedConditions.visibilityOf(emailField));
        return emailField.isDisplayed();
    }

    public String getEmail() {
        return emailField.getText();
    }

    public void sendEmail(){
        emailField.click();
        emailField.sendKeys("patronage.szczecin22@gmail.com");
        WebDriverWait wait = new WebDriverWait(DRIVER, 30);
        wait.until(ExpectedConditions.visibilityOf(nextButton));
        nextButton.click();
    }

    public void sendPassword() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 30);
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.click();
        passwordField.sendKeys("AndroidPatronage");
        loginButton.click();
    }
}
