package com.intive.template.steps;

import com.intive.template.pages.RetroPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RetroSteps {
    RetroPage retroPage = new RetroPage();

    @Then("Retro boards contains arrow back buttons")
    public void retroScreenAndArrowBackButtonsAreVisible() {
        Assert.assertTrue("Arrow back button is not visible",
                retroPage.openRetroBoardsAndCheckElements());
    }
}
