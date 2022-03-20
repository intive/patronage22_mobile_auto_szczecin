package com.intive.template.steps;

import com.intive.template.pages.RetroPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RetroSteps {
    RetroPage retroPage = new RetroPage();

    @Then("Retro boards contains id and arrow back buttons")
    public void boardIdAndArrowBackButtonsAreVisible() {
        Assert.assertTrue("Retro Screen or board id or arrow back buttons is not visible",
                retroPage.openRetroBoardsAndCheckElements());
    }
}
