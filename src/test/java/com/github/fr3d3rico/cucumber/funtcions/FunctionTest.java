package com.github.fr3d3rico.cucumber.funtcions;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.github.fr3d3rico.cucumber.SuperTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FunctionTest {
	
	@When("^Try logon on page with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void try_logon_on_page_with_and(String username, String password) {
		WebElement login = SuperTest.webDriver.findElement(By.id("login"));
		login.sendKeys(username);
		
		WebElement senha = SuperTest.webDriver.findElement(By.id("senha"));
		senha.sendKeys(password);
		
		WebElement button = SuperTest.webDriver.findElement(By.name("entrar"));
		button.click();
	}
	
	@Then("^Logon was successful$")
	public void logon_was_successful() throws Exception {
		Thread.sleep(2000);
		Assert.assertThat(true, CoreMatchers.equalTo(SuperTest.webDriver.getPageSource().contains("TEXT TO ASSERT")));
	}
	
	@When("^Try logon with wrong user \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void try_logon_with_wrong_user_and_password(String username, String password) {
		SuperTest.webDriver.navigate().to(SuperTest.URL_BASE);
		
		WebElement login = SuperTest.webDriver.findElement(By.id("login"));
		login.sendKeys(username);
		
		WebElement senha = SuperTest.webDriver.findElement(By.id("senha"));
		senha.sendKeys(password);
		
		WebElement button = SuperTest.webDriver.findElement(By.name("entrar"));
		button.click();
	}
	
	@Then("^Logon was denied$")
	public void logon_was_denied() throws Exception {
		Thread.sleep(2000);
		Assert.assertThat(true, CoreMatchers.equalTo(SuperTest.webDriver.getPageSource().contains("TEXT TO ASSERT")));
	}

}
