package com.intive.template.steps;

import com.intive.template.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class HomeSteps {
    HomePage homePage = new HomePage();

    @Given("Application is open")
    public void retroBoardIsOpen(){
        homePage.isApplicationOpen();
    }

    @Then("{string} text should be visible")
    public void emailIsVisible(String textMessage) {
        Assert.assertEquals(homePage.getEmail(), textMessage);
    }
}
