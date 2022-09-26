package com.applaudostudios.homework0802.stepdefinitions;

import com.applaudostudios.homework0802.Base;
import demoqa.DemoQAFormsPage;
import demoqa.DemoQAPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class findPracticeFormStep {

    Base base;
    DemoQAFormsPage demoQAFormsPage;
    private SoftAssert softAssert;


    public findPracticeFormStep(Base base) {
        this.base = base;
        this.demoQAFormsPage = new DemoQAFormsPage(base.getDriver());
    }

    @When("user click on practice form button")
    public void userClickOnPracticeFormButton() throws InterruptedException {
        System.out.println("\n ********** Executing Step 3 **********");
        demoQAFormsPage.clickOnPracticeFormButton();
        base.waitTime();
    }

    @Then("is redirected and the URL of the new page is compared against the old page URL")
    public void isRedirectedAndTheURLOfTheNewPageIsComparedAgainstTheOldPageURL() throws InterruptedException {
        String expectedURL="https://demoqa.com/automation-practice-form";
        softAssert = new SoftAssert();
        softAssert.assertEquals(expectedURL, base.getDriver(),"Step 3: The URL is not https://demoqa.com/automation-practice-form");
        softAssert.assertAll();
        base.waitTime();
    }
}
