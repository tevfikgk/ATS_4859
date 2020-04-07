package com.ats.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features"
		,glue="com/ats/steps"
		,dryRun=false
		,monochrome=true
		)

public class RunnerClass {

}
