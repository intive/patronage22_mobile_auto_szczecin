package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Instant;


public class HomePage extends BasePage {

    @AndroidFindBy(id = "email")
    MobileElement emailField;

    @AndroidFindBy(id = "button_next")
    MobileElement nextButton;

    @AndroidFindBy(id = "password")
    MobileElement passwordField;

    @AndroidFindBy(id = "button_done")
    MobileElement loginButton;

    @AndroidFindBy(id = "name")
    MobileElement nameField;

    @AndroidFindBy(id = "button_create")
    MobileElement saveButton;

    public boolean isApplicationOpen() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 30);
        wait.until(ExpectedConditions.visibilityOf(emailField));
        return emailField.isDisplayed();
    }

    public String getEmail() {
        return emailField.getText();
    }

    public void writeEmail() {
        emailField.click();
        emailField.sendKeys("patronage.szczecin22@gmail.com");
        WebDriverWait wait = new WebDriverWait(DRIVER, 30);
        wait.until(ExpectedConditions.visibilityOf(nextButton));
        nextButton.click();
    }

    public void writePassword() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 30);
        wait.until(ExpectedConditions.visibilityOf(passwordField));
        passwordField.click();
        passwordField.sendKeys("AndroidPatronage");
        loginButton.click();
    }

    public void writeEmail(String email) {
        emailField.click();
        emailField.sendKeys(email); //"patronage.szczecin22@gmail.com"
        WebDriverWait wait = new WebDriverWait(DRIVER, 30);
        wait.until(ExpectedConditions.visibilityOf(nextButton));
        nextButton.click();
    }

    public void writeName(String name) {
        nameField.sendKeys(name);
    }

    public void writePassword(String password) {
        passwordField.click();
        passwordField.sendKeys(password); //"AndroidPatronage"
    }

    public void clickSignInButton() {
        loginButton.click();
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public String getTimestamp() {
        return String.valueOf(Instant.now().getEpochSecond());
    }

    public String getNewUser() {
        return getTimestamp() + "@djati.com";
    }
}
