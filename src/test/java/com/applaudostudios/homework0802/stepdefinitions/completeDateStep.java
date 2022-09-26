package com.applaudostudios.homework0802.stepdefinitions;

import com.applaudostudios.homework0802.Base;
import demoqa.DemoQAFormsPage;
import io.cucumber.java.en.When;

public class completeDateStep {

    Base base;
    private DemoQAFormsPage demoQAFormsPage;

    public completeDateStep(Base base) {
        this.base = base;
        this.demoQAFormsPage = new DemoQAFormsPage(base.getDriver());
    }

    @When("user select a birthday from the date input")
    public void userSelectABirthdayFromTheDateInput() throws InterruptedException {
        System.out.println("\n ********** Executing Step 6 **********");
        demoQAFormsPage.selectBirthDay();
        base.waitTime();
    }
}
