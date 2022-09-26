package com.applaudostudios.homework0802.stepdefinitions;

import com.applaudostudios.homework0802.Base;
import demoqa.DemoQAFormsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.List;

public class validateFormDataStep {
    Base base;
    DemoQAFormsPage demoQAFormsPage;
    List<String> formData;
    List<String> popUpTableData;
    private SoftAssert softAssert;


    public validateFormDataStep(Base base) {
        this.base = base;
        this.demoQAFormsPage = new DemoQAFormsPage(base.getDriver());
        this.formData = new ArrayList<String>();
        this.popUpTableData = new ArrayList<String>();
    }
    @Given("the input data obtained from the form")
    public void theInputDataObtainedFromTheForm() throws InterruptedException {
        System.out.println("\n ********** Executing Step 11 **********");
        formData=demoQAFormsPage.obtainFormData();
        System.out.println(formData);
        base.waitTime();
    }

    @And("the input data obtained from the pop up window")
    public void theInputDataObtainedFromThePopUpWindow() throws InterruptedException {
        popUpTableData=demoQAFormsPage.obtainTableData();
        System.out.println(popUpTableData);
        base.waitTime();
    }

    @Then("both information is verify if correct")
    public void bothInformationIsVerifyIfCorrect() throws InterruptedException {
        softAssert = new SoftAssert();
        softAssert.assertEquals(popUpTableData.get(0), formData.get(0)+" "+formData.get(1),"The name is incorrect");
        softAssert.assertEquals(popUpTableData.get(1), formData.get(2),"The email is incorrect");
        softAssert.assertEquals(popUpTableData.get(2),"Male","The gender is incorrect");
        softAssert.assertEquals(popUpTableData.get(3), formData.get(3),"The number is incorrect");
        softAssert.assertEquals(popUpTableData.get(4), "12 September,2022","The date is incorrect");
        softAssert.assertEquals(popUpTableData.get(5), formData.get(5),"The subject is incorrect");
        softAssert.assertEquals(popUpTableData.get(6), "Sports","The hobbie is incorrect");
        softAssert.assertEquals(popUpTableData.get(7),"Selenium_logo.png","The file is incorrect");
        softAssert.assertEquals(popUpTableData.get(8),formData.get(7),"The address is incorrect");
        softAssert.assertEquals(popUpTableData.get(9),formData.get(8)+" "+formData.get(9),"The state and city are incorrect");
        softAssert.assertAll();
        base.waitTime();
    }

    @And("pop up window and browser are closed")
    public void popUpWindowAndBrowserAreClosed() throws InterruptedException {
        demoQAFormsPage.closePopUp();
        demoQAFormsPage.closeBrowser();
        base.waitTime();
    }
}
