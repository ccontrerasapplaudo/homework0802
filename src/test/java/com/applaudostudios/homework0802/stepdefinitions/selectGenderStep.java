package com.applaudostudios.homework0802.stepdefinitions;
import com.applaudostudios.homework0802.Base;
import demoqa.DemoQAFormsPage;
import demoqa.DemoQAPage;
import io.cucumber.java.en.When;

public class selectGenderStep {
    Base base;
    DemoQAFormsPage demoQAFormsPage;

    public selectGenderStep(Base base) {
        this.base = base;
        this.demoQAFormsPage = new DemoQAFormsPage(base.getDriver());
    }

    @When("the user click a gender option to be selected")
    public void theUserClickAGenderOptionToBeSelected() throws InterruptedException {
        System.out.println("\n ********** Executing Step 5 **********");
        demoQAFormsPage.selectGenderOption();
        base.waitTime();
    }
}
