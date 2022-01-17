package com.intive.template.steps;

import com.intive.template.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomeSteps {

    HomePage homePage = new HomePage();

    @Given("Application is opened")
    public void applicationIsOpened() {
        Assert.assertTrue("Application did not load", homePage.isApplicationReady());
    }

    @When("I select add todo button")
    public void iSelectAddTodoButton() {
        homePage.selectTodoButton();
    }

    @Then("Todo screen appear")
    public void todoScreenAppear() {
        Assert.assertTrue("Todo screen was not visible", homePage.isAddTodoScreenIsVisible());
    }
}
