package com.applaudostudios.homework0802.stepdefinitions;

import com.applaudostudios.homework0802.Base;
import demoqa.DemoQAFormsPage;
import io.cucumber.java.en.When;

public class clickSubmitStep {
    Base base;
    DemoQAFormsPage demoQAFormsPage;

    public clickSubmitStep(Base base) {
        this.base = base;
        this.demoQAFormsPage = new DemoQAFormsPage(base.getDriver());
    }
    @When("user click on Submit button")
    public void userClickOnSubmitButton() throws InterruptedException {
        System.out.println("\n ********** Executing Step 10 **********");
        demoQAFormsPage.clickSubmitButton();
        base.waitTime();
    }
}
