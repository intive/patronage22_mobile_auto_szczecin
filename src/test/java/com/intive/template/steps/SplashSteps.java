package com.intive.template.steps;

import com.intive.template.pages.SplashPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SplashSteps {

    SplashPage splashPage = new SplashPage();

    @When("The app is restarted")
    public void restartApplication() {
        splashPage.restartApplication();
    }

    @Then("Splash screen is visible")
    public void splashScreenIsVisible() {
        Assert.assertTrue("Splash screen logo is not visible", splashPage.splashScreenIsDisplayed());
    }
}
