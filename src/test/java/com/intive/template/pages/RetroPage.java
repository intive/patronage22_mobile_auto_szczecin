package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.ArrayList;

public class RetroPage extends BasePage {

    @AndroidFindBy(id = "retroScreenTitle")
    MobileElement retroScreenTitle;

    @AndroidFindBy(accessibility = "Navigate up")
    MobileElement arrowBackButton;

    @AndroidFindBy(id = "constraint_layout_board")
    ArrayList<MobileElement> retroButtons;

    public boolean openRetroBoardsAndCheckElements() {
        for (int index = 0; index < retroButtons.size(); index++) {
            retroButtons.get(index).click();

            if (!retroScreenTitle.isDisplayed()
                    || !retroScreenTitle.getText().equals("Board id: " + (index + 1))
                    || !arrowBackButton.isDisplayed())
                return false;

            arrowBackButton.click();
        }
        return true;
    }
}