package com.applaudostudios.homework0802.stepdefinitions;

import com.applaudostudios.homework0802.Base;
import demoqa.DemoQAFormsPage;
import io.cucumber.java.en.When;

public class selectHobbieStep {
    Base base;
    DemoQAFormsPage demoQAFormsPage;

    public selectHobbieStep(Base base) {
        this.base = base;
        this.demoQAFormsPage = new DemoQAFormsPage(base.getDriver());
    }

    @When("user select a hobbie")
    public void userSelectAHobbie() throws InterruptedException {
        System.out.println("\n ********** Executing Step 7 **********");
        demoQAFormsPage.selectHobbieOption();
        base.waitTime();
    }
}
