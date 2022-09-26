package com.applaudostudios.homework0802.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/com/applaudostudios/homework0802/features"},
        glue = {"com.applaudostudios.homework0802.stepdefinitions","com.applaudostudios.homework0802.hook"},
        plugin = {"pretty", "html:target/cucumber"}
)
public class Runner extends AbstractTestNGCucumberTests {
}