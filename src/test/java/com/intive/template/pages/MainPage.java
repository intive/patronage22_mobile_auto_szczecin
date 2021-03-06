package com.intive.template.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    @AndroidFindBy(accessibility = "Open navigation drawer")
    MobileElement navigationIcon;

    @AndroidFindBy(accessibility = "More options")
    MobileElement moreOptionsIcon;

    @AndroidFindBy(id = "profileFragment")
    MobileElement profileScreenButton;

    @AndroidFindBy(id = "boardsFragment")
    MobileElement boardsScreenButton;

    @AndroidFindBy(id = "historyFragment")
    MobileElement historyScreenButton;

    @AndroidFindBy(id = "moreFragment")
    MobileElement moreScreenButton;

    public void openNavigationDrawer() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 45);
        wait.until(ExpectedConditions.visibilityOf(navigationIcon));
        navigationIcon.click();
    }

    public void openProfileScreen() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 45);
        wait.until(ExpectedConditions.visibilityOf(profileScreenButton));
        profileScreenButton.click();
    }

    public void openBoardsScreen() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 45);
        wait.until(ExpectedConditions.visibilityOf(boardsScreenButton));
        boardsScreenButton.click();
    }

    public void openHistoryScreen() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 45);
        wait.until(ExpectedConditions.visibilityOf(historyScreenButton));
        historyScreenButton.click();
    }

    public boolean navigationIconIsVisible() {
        return navigationIcon.isDisplayed();
    }

    public boolean moreOptionsIconIsVisible() {
        return moreOptionsIcon.isDisplayed();
    }

    public boolean checkIfScreenIsVisible(String screen) {
        WebDriverWait wait = new WebDriverWait(DRIVER, 45);
        MobileElement foundElement = DRIVER.findElement(By.xpath(String.format("//android.view.ViewGroup[@content-desc=\"%s\"]", screen)));
        wait.until(ExpectedConditions.visibilityOf(foundElement));
        return foundElement.isDisplayed();
    }

    public void openMoreOptions() {
        moreOptionsIcon.click();
    }

    public void openMoreScreen() {
        WebDriverWait wait = new WebDriverWait(DRIVER, 45);
        wait.until(ExpectedConditions.visibilityOf(moreScreenButton));
        moreScreenButton.click();
    }
}
