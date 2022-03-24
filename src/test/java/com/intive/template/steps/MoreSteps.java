package com.intive.template.steps;

import com.intive.template.pages.MorePage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MoreSteps {
    MorePage morePage = new MorePage();

    @Then("Screen with licences is opened")
        public void screenWithLicencesIsOpened() {
            morePage.openLicences();
        Assert.assertTrue("Licenses Header is not visible", morePage.licensesHeaderIsVisible());
    }

    @Then("Title {string} is visible")
        public void titleScreenIsVisible(String title) {
        Assert.assertEquals("Open source licenses", morePage.licenseHeaderTitle(title));
    }
}
