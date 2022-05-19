package com.careerhack.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "Features",  // where is out feature file? in the "Features folder"
		glue = "com.careerhack.steps" // glue is where find out automation steps 
		
		)

public class SmokeTestRunner extends AbstractTestNGCucumberTests { 

}
