package com.github.fr3d3rico.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber-report"}, features = "src/test/resources")
public class ConfigCucumber {
}
