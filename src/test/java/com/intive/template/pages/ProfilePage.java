package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    MobileElement threeDotsMenu;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    MobileElement logoutButton;

    public void clickThreeDotsMenu() {
        threeDotsMenu.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }
}
