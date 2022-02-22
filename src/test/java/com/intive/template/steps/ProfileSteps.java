package com.intive.template.steps;

import com.intive.template.pages.HomePage;
import com.intive.template.pages.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProfileSteps {

    ProfilePage profilePage = new ProfilePage();
    HomePage homePage = new HomePage();

    @Given("User is logged in")
    public void login() {
        homePage.writeEmail();
        homePage.writePassword();
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
