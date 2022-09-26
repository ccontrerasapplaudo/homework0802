package com.applaudostudios.homework0802.stepdefinitions;

import com.applaudostudios.homework0802.Base;
import demoqa.DemoQAFormsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class fillInputsStep {

    Base base;
    private DemoQAFormsPage demoQAFormsPage;

    public fillInputsStep(Base base) {
        this.base = base;
        this.demoQAFormsPage = new DemoQAFormsPage(base.getDriver());
    }

    @When("User will write on Name, Email, Mobile, Address")
    public void userWillWriteOnNameEmailMobileAddress() throws InterruptedException {
        System.out.println("\n ********** Executing Step 4 **********");
        demoQAFormsPage.sendFormData();
        base.waitTime();
    }

    @And("subject input")
    public void subjectInput() throws InterruptedException {
        demoQAFormsPage.sendSubject();
        base.waitTime();
    }
}
