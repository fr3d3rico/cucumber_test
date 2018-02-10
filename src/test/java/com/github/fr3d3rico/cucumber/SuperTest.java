package com.github.fr3d3rico.cucumber;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class SuperTest {
	
	public static final String URL_BASE = "https://YOUR_URL.com";
	public static final String WEBDRIVER_PATH = "YOUR PATH TO geckodriver.exe";
	
	public static WebDriver webDriver = null;
	
	@Before
	public void before() throws Exception {
		System.setProperty("webdriver.gecko.driver", SuperTest.WEBDRIVER_PATH);
		webDriver = new FirefoxDriver();
	}
	
	@After
	public void after() {
		webDriver.quit();
	}
	
	@Given("^Access home page$")
	public void when_access_home_page() throws Exception {
		SuperTest.webDriver.get(SuperTest.URL_BASE);
		Assert.assertEquals(SuperTest.webDriver.getTitle(), "TEXT TO ASSERT");
	}
	
}
