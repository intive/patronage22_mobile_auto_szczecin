package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.ArrayList;
import java.util.List;

public class RetroPage extends BasePage {

    @AndroidFindBy(id = "retroScreenTitle")
    MobileElement retroScreenTitle;

    @AndroidFindBy(accessibility = "Navigate up")
    MobileElement arrowBackButton;

    @AndroidFindBy(id = "constraint_layout_board")
    List<MobileElement> retroButtons;

    public String getRetroScreenTitle() {
        return retroScreenTitle.getText();
    }

    public boolean arrowBackButtonIsVisible() {
        return arrowBackButton.isDisplayed();
    }

    List<String> idRetroButtons = new ArrayList<>();;

    public List<String> openRetroBoard() {
        for(int i = 0; i < retroButtons.size(); i++) {
            retroButtons.get(i).click();
            idRetroButtons.add(retroScreenTitle.getText());
            arrowBackButton.isDisplayed();
            arrowBackButton.click();
        }
        return idRetroButtons;
    }
}
