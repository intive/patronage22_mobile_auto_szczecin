package com.intive.template.steps;

import com.intive.template.pages.ProfilePage;
import io.cucumber.java.en.Then;

public class ProfileSteps {

    ProfilePage profilePage = new ProfilePage();

    @Then("Click three dots button")
    public void clickThreeDotsButton() {
        profilePage.clickThreeDotsMenu();
    }

    @Then("Click Logout")
    public void clickLogout() {
        profilePage.clickLogoutButton();
    }
}
