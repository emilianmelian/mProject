package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.serenity.OrbitzSteps;
import com.steps.serenity.ToolsQaSteps;
import com.steps.serenity.WizzSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class OrbitzTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps 
	OrbitzSteps orbitzSteps;
	
	@Steps 
	WizzSteps wizzSteps;
	
	/*
	@Test
	public void go_through_navigation_commands(){
	  orbitzSteps.selectMonth("ceva");
	}
	*/
	
	@Test
	public void go_through_navigation_commands() {
	  wizzSteps.grabCity();

	// wizzSteps.selectMonth("February",23);
	  wizzSteps.selectMonth1("February",23);
	  
	  wizzSteps.selectMonth2("February",26);
	}
}
