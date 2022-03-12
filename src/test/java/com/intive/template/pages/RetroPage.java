package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RetroPage extends BasePage {

    @AndroidFindBy(id = "retroScreenTitle")
    MobileElement retroScreenTitle;

    @AndroidFindBy(accessibility = "Navigate up")
    MobileElement arrowBackButton;

    public String getRetroScreenTitle() {
        return retroScreenTitle.getText();
    }

    public boolean arrowBackButtonIsVisible() {
        return arrowBackButton.isDisplayed();
    }
}
