package com.intive.template.steps;

import com.intive.template.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("Application is opened")
    public void retroBoardIsOpen() {
        Assert.assertTrue("Application is not opened", homePage.isApplicationOpen());
    }

    @Then("{string} text should be visible")
    public void emailIsVisible(String textMessage) {
        String message = String.format("The test is failed, text should be \"%s\", but it is \"%s\"",
                textMessage, homePage.getEmail());
        Assert.assertEquals(message, homePage.getEmail(), textMessage);
    }

    @When("User write email")
    public void emailIsSent() {
        homePage.writeEmail();
    }

    @And("User write password")
    public void passwordIsSent() {
        homePage.writePassword();
    }

    @Given("Main screen is open")
    public void login() {
        homePage.writeEmail();
        homePage.writePassword();
    }

    @Then("Provide login: {string}")
    public void provideLogin(String login) {
        System.out.println(homePage.getNewUser());
        homePage.writeEmail(login);
    }

    @Then("Provide password: {string}")
    public void providePassword(String password) {
        homePage.writePassword(password);
    }

    @And("Provide login for new account")
    public void provideNewLogin() {
        homePage.writeEmail(homePage.getNewUser());
    }

    @And("Provide name for new account")
    public void provideNewName() { homePage.writeName("Durand Jones"); }

    @And("Click on sign in button")
    public void clickSignInButton() { homePage.clickSignInButton(); }

    @And("Click on save button")
    public void clickSaveButton() { homePage.clickSaveButton(); }

    @And("Provide password for new account")
    public void provideNewUserPassword() {
        homePage.writePassword("rideordie");
    }
}
