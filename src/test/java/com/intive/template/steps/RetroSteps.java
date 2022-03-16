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

    @Then("Retro board is opened")
    public void retroBoardIsOpened() {
        retroPage.openRetroBoard();
    }

    @Then("Board id is visible")
    public void boardIdIsVisible() {
        int index = 1;
        for (String idBoard: retroPage.openRetroBoard()) {
            Assert.assertEquals(idBoard, "Board id: " + index);
            index++;
        }
    }
}
