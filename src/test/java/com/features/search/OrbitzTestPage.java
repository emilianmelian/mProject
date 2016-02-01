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
public class OrbitzTestPage {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps 
	OrbitzSteps orbitzSteps;
	
	
	@Test
	public void go_through_navigation_commands() {
		orbitzSteps.accesPage2();
		orbitzSteps.selectMonth2("Feb 2016",15);
	
		//orbitzSteps.selectMonth3("Feb 2016",17);
		orbitzSteps.selectElements();
	}
	
}
