package org.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Lenovo\\eclipse-workspace\\"
		+ "CucumberDemo\\Feature Files\\hooksfeaturefile.feature", 
		glue = {"org.stepdefinitions","org.hooks"}, dryRun = false,
		plugin = {"html:C:\\Users\\Lenovo\\eclipse-workspace\\CucumberDemo\\target\\htmlrep.html",
				"json:C:\\Users\\Lenovo\\eclipse-workspace\\CucumberDemo\\target\\jsonrep.json",
				"junit:C:\\Users\\Lenovo\\eclipse-workspace\\CucumberDemo\\target\\xmltep.xml"},
		tags="@Sanity or @Regression")
public class StepRunner {

}
