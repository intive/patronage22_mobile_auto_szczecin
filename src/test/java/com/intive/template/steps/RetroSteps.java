package com.intive.template.steps;

import com.intive.template.pages.RetroPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RetroSteps {
    RetroPage retroPage = new RetroPage();

    @Then("{string} retro board id is visible")
    public void retroBoardIdIsVisible(String retroId) {
        Assert.assertEquals(retroId, retroPage.getRetroScreenTitle());
    }

    @And("Arrow back button is visible")
    public void isVisibleArrowBackButton() {
        Assert.assertTrue("Arrow button should be visible", retroPage.arrowBackButtonIsVisible());
    }
}
