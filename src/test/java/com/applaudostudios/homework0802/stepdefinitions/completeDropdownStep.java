package com.applaudostudios.homework0802.stepdefinitions;

import com.applaudostudios.homework0802.Base;
import demoqa.DemoQAFormsPage;
import io.cucumber.java.en.When;

public class completeDropdownStep {
    Base base;
    DemoQAFormsPage demoQAFormsPage;

    public completeDropdownStep(Base base) {
        this.base = base;
        this.demoQAFormsPage = new DemoQAFormsPage(base.getDriver());
    }

    @When("user select an option from the dropdown menu")
    public void userSelectAnOptionFromTheDropdownMenu() throws InterruptedException {
        System.out.println("\n ********** Executing Step 9 **********");
        demoQAFormsPage.selectDropdownOptions();
        base.waitTime();
    }
}
