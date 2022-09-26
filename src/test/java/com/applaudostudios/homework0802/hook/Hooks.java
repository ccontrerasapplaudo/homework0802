package com.applaudostudios.homework0802.hook;

import com.applaudostudios.homework0802.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    Base base;

    public Hooks(Base base){
        this.base = base;
    }

    @Before("@navigateToDemoQa")
    public void beforeMethod(){
        base.setUp();
    }

    @After("@validateFormData")
    public void AfterMethod(){
        base.quitDriver();
    }
}
