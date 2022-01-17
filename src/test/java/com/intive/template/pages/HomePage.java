package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage {

    @AndroidFindBy(id = "addToDoItemFAB")
    MobileElement addTodoButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    MobileElement hamburgerMenuButton;

    @AndroidFindBy(id = "userToDoEditText")
    MobileElement editTextField;

    public boolean isApplicationReady() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 35);
        wait.until(ExpectedConditions.visibilityOf(hamburgerMenuButton));
        return hamburgerMenuButton.isDisplayed();
    }

    public void selectTodoButton() {
        addTodoButton.click();
    }

    public boolean isAddTodoScreenIsVisible() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 35);
        wait.until(ExpectedConditions.visibilityOf(editTextField));
        return editTextField.isDisplayed();

    }



}
