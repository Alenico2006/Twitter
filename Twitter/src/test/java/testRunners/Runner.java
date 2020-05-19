package testRunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.JUnitCore;


import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features", 
		plugin = {"pretty", "json:target/report.json", "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"},
		glue="stepDefinitions",
		//snippets = CucumberOptions.SnippetType.CAMELCASE,
		tags = "@Post")
//@CucumberOptions(features="src/test/resources/features",tags = "@case2")
	public class Runner
	{
	

	}