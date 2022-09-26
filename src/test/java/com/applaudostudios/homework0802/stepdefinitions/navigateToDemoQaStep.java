package com.applaudostudios.homework0802.stepdefinitions;

import com.applaudostudios.homework0802.Base;
import demoqa.DemoQAPage;
import io.cucumber.java.en.When;

public class navigateToDemoQaStep {
    Base base;
    DemoQAPage demoQAPage;

    public navigateToDemoQaStep(Base base) {
        this.base = base;
        this.demoQAPage = new DemoQAPage(base.getDriver());
    }

    @When("user navigates to demoqa")
    public void userNavigatesToDemoqa() throws InterruptedException {
        System.out.println("\n ********** Executing Step 1 **********");
        demoQAPage.navigateTo();
        base.waitTime();
    }
}
