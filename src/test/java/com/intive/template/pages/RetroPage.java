package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.ArrayList;

public class RetroPage extends BasePage {

    @AndroidFindBy(accessibility = "Navigate up")
    MobileElement arrowBackButton;

    @AndroidFindBy(id = "constraint_layout_board")
    ArrayList<MobileElement> retroButtons;

    public boolean openRetroBoardsAndCheckElements() {
        for (int index = 0; index < retroButtons.size(); index++) {
            retroButtons.get(index).click();
            arrowBackButton.isDisplayed();
            arrowBackButton.click();
        }
        return true;
    }
}