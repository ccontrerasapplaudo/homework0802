package com.applaudostudios.homework0802.stepdefinitions;

import com.applaudostudios.homework0802.Base;
import demoqa.DemoQAPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class findFormsElementStep {

    Base base;
    DemoQAPage demoQAPage;
    private SoftAssert softAssert;


    public findFormsElementStep(Base base) {
        this.base = base;
        this.demoQAPage = new DemoQAPage(base.getDriver());
    }

    @When("user click on forms button")
    public void userClickOnFormsButton() throws InterruptedException {
        System.out.println("\n ********** Executing Step 2 **********");
        demoQAPage.clickOnFormsButton();
        base.waitTime();
    }

    @Then("the URL of the new page is compared against the old page URL")
    public void theURLOfTheNewPageIsComparedAgainstTheOldPageURL() throws InterruptedException {
        String expectedURL="https://demoqa.com/forms";
        softAssert = new SoftAssert();
        softAssert.assertEquals(expectedURL,base.getDriver().getCurrentUrl(),"Step 2: The URL is not https://demoqa.com/forms");
        softAssert.assertAll();
        base.waitTime();
    }
}
