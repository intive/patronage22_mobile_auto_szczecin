package com.intive.template.steps;

import com.intive.template.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("Application is opened")
    public void retroBoardIsOpen(){
        Assert.assertTrue("Application is not opened", homePage.isApplicationOpen());
    }

    @Then("{string} text should be visible")
    public void emailIsVisible(String textMessage) {
        Assert.assertEquals(homePage.getEmail(), textMessage);
    }
}
