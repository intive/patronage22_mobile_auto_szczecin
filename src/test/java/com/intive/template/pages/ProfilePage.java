package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage extends BasePage {

    @AndroidFindBy(id = "password")
    MobileElement passwordField;

    @AndroidFindBy(id = "button_done")
    MobileElement signInButton;

    @AndroidFindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")
    MobileElement navigationDrawerButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView")
    MobileElement profileButton;

    @AndroidFindBy(xpath = "//android.widget.ImageView[@content-desc=\"More options\"]")
    MobileElement threeDotsMenu;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    MobileElement logoutButton;

    public void inputPassword(String password) {
        passwordField.setValue(password);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickNavigationDrawerButton() {
        navigationDrawerButton.click();
    }

    public void clickProfileButton() {
        profileButton.click();
    }

    public void clickThreeDotsMenu() {
        threeDotsMenu.click();
    }

    public void clickLogoutButton() {
        logoutButton.click();
    }
}
