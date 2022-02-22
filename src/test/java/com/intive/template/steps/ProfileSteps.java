package com.intive.template.steps;

import com.intive.template.pages.HomePage;
import com.intive.template.pages.MainPage;
import com.intive.template.pages.ProfilePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class ProfileSteps {

    ProfilePage profilePage = new ProfilePage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();

    @Given("User is logged in")
    public void login() {
        homePage.writeEmail();
        homePage.writePassword();
    }

    @Then("Menu more options is opened")
    public void openMoreOptions() {
        mainPage.openMoreOptions();
    }

    @Then("Login screen is presented")
    public void loginScreenIsPresented() {
        profilePage.clickLogoutButton();
        Assert.assertTrue("Did not log out correctly", homePage.isApplicationOpen());
    }
}
