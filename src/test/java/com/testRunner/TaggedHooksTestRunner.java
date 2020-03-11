package com.testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = {"classpath:Features/TaggedHooks.feature"},
		glue = {"classpath:com.stepDefinition"},
		plugin = {"pretty","html:cucumber-html","json:cucumber-json/cucumber.json","junit:cucumber-xml/cucumber.xml"},
		monochrome = true,
		strict = true,
		dryRun = false
		)
public class TaggedHooksTestRunner 
{

}
