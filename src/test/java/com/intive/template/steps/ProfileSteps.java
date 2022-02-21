package com.intive.template.steps;

import com.intive.template.pages.ProfilePage;
import io.cucumber.java.en.Then;

public class ProfileSteps {

    ProfilePage profilePage = new ProfilePage();

    @Then("Input password {string}")
    public void inputPassword(String password) {
        profilePage.inputPassword(password);
    }

    @Then("Click SIGN IN button")
    public void clickSignInButton() {
        profilePage.clickSignInButton();
    }

    @Then("Open navigation drawer")
    public void clickNavigationDrawerButton() {
        profilePage.clickNavigationDrawerButton();
    }

    @Then("Click profile")
    public void clickProfile() {
        profilePage.clickProfileButton();
    }

    @Then("Click three dots button")
    public void clickThreeDotsButton() {
        profilePage.clickThreeDotsMenu();
    }

    @Then("Click Logout")
    public void clickLogout() {
        profilePage.clickLogoutButton();
    }
}
