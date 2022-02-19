package com.intive.template.steps;

import com.intive.template.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MainSteps {
    MainPage mainPage = new MainPage();

    @And("Navigation drawer is opened")
    public void navigationDrawerIsOpen(){
        mainPage.openNavigationDrawer();
    }

    @And("Profile screen is opened")
    public void profileScreenIsOpen(){
        mainPage.openProfileScreen();
    }

    @And("Bottom app is visible")
    public void bottomAppIsVisible(){
        Assert.assertTrue("Navigation icon is not visible", mainPage.navigationIconIsVisible());
        Assert.assertTrue("More options icon is not visible", mainPage.moreOptionsIconIsVisible());
    }

    @Then("{string} should be visible")
    public void textProfileScreenIsVisible(String profileScreen){
        String screenName = String.format("The test is failed, text should be \"%s\", but it is \"%s\"",
                profileScreen, mainPage.getProfileScreenText());
        Assert.assertEquals(screenName, mainPage.getProfileScreenText(), profileScreen);
    }
}