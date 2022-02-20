package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage{

    @AndroidFindBy(accessibility = "Open navigation drawer")
    MobileElement navigationIcon;

    @AndroidFindBy(accessibility = "More options")
    MobileElement moreOptionsIcon;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout[1]/androidx.recyclerview.widget.RecyclerView/androidx.appcompat.widget.LinearLayoutCompat[3]/android.widget.CheckedTextView")
    MobileElement profileScreenButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")
    MobileElement profileScreen;

    public void openNavigationDrawer(){
        WebDriverWait wait = new WebDriverWait(DRIVER, 30);
        wait.until(ExpectedConditions.visibilityOf(navigationIcon));
        navigationIcon.click();
    }

    public void openProfileScreen(){
        WebDriverWait wait = new WebDriverWait(DRIVER, 30);
        wait.until(ExpectedConditions.visibilityOf(profileScreenButton));
        profileScreenButton.click();
    }

    public boolean navigationIconIsVisible(){
        return navigationIcon.isDisplayed();
    }

    public boolean moreOptionsIconIsVisible(){
        return moreOptionsIcon.isDisplayed();
    }

    public String getProfileScreenText(){
        WebDriverWait wait = new WebDriverWait(DRIVER, 30);
        wait.until(ExpectedConditions.visibilityOf(profileScreen));
        return profileScreen.getText();
    }
}
