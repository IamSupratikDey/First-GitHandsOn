package com.bdd.runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions
               (
            	features = "Features"	,
            	glue = {"com.bdd.StepDefination"}
            	)
@Test
public class TestRunner extends AbstractTestNGCucumberTests  {

}
