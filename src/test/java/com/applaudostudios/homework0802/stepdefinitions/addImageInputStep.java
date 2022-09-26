package com.applaudostudios.homework0802.stepdefinitions;

import com.applaudostudios.homework0802.Base;
import demoqa.DemoQAFormsPage;
import io.cucumber.java.en.When;

public class addImageInputStep {
    Base base;
    DemoQAFormsPage demoQAFormsPage;

    public addImageInputStep(Base base) {
        this.base = base;
        this.demoQAFormsPage = new DemoQAFormsPage(base.getDriver());
    }

    @When("user select an image from files")
    public void userSelectAnImageFromFiles() throws InterruptedException {
        System.out.println("\n ********** Executing Step 8 **********");
        demoQAFormsPage.selectPicture();
        base.waitTime();
    }
}
