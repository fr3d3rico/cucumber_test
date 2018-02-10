package com.github.fr3d3rico.cucumber.funtcions;

import java.awt.Robot;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import com.github.fr3d3rico.cucumber.SuperTest;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Function2Test {
	
	@When("^Click on Guia Inicial Publica$")
	public void click_on_Guia_Inicial_Publica() throws Throwable {
		
		Point point = SuperTest.webDriver.findElement(By.xpath("//a[@title='Emitir Guias']")).getLocation();
		Robot robot = new Robot();
		robot.mouseMove(point.x+5,point.y+115);
		Thread.sleep(3000);
		
		SuperTest.webDriver.findElement(By.xpath("//a[@title='Guia Inicial']")).click();
		Thread.sleep(2000);
		
		Assert.assertThat("Message to identify this assert", SuperTest.webDriver.getPageSource(), CoreMatchers.containsString("TEXT TO ASSERT"));
	}

	@And("^Choose Natureza \"([^\"]*)\"$")
	public void choose_Natureza(String arg1) throws Throwable {
		WebElement linkLocalizarNatureza = SuperTest.webDriver.findElement(By.name("imaLocalizarNaturezaSPG"));
		linkLocalizarNatureza.click();
		
		Thread.sleep(2000);
		
		WebElement nomeBusca1 = SuperTest.webDriver.findElement(By.id("nomeBusca1"));
		nomeBusca1.sendKeys("Despejo");
		
		Thread.sleep(2000);
		
		WebElement buttonConsultar = SuperTest.webDriver.findElement(By.id("formLocalizarBotao"));
		buttonConsultar.click();
		
		Thread.sleep(2000);
		
		WebElement inputResultado = SuperTest.webDriver.findElement(By.xpath("//input[@data_id1='38']"));
		inputResultado.click();
		
		Thread.sleep(2000);
	}

	@And("^Input \"([^\"]*)\" in input name$")
	public void input_in_input_name(String arg1) throws Throwable {
		WebElement requerente = SuperTest.webDriver.findElement(By.id("requerente"));
		requerente.sendKeys("Teste Selenium");
	}

	@And("^Click on previa button$")
	public void click_on_previa_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
	@Then("^blabla$")
	public void blabla() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	
}
