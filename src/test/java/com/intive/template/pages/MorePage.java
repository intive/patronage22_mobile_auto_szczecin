package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MorePage extends BasePage {

    @AndroidFindBy(id = "btLicenses")
    MobileElement licensesButton;

    @AndroidFindBy(className = "android.widget.TextView")
    MobileElement licensesHeader;

    public void openLicences() {
        licensesButton.click();
    }

    public boolean licensesHeaderIsVisible() {
        return licensesHeader.isDisplayed();
    }

    public String licenseHeaderTitle(String title) {
        return licensesHeader.getText();
    }
}
