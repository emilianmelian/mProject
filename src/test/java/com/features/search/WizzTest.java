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
public class WizzTest {

	
	
	
	@Steps 
	WizzSteps orbitzSteps;
	
	@Test
	public void go_through_navigation_commands() {
		orbitzSteps.grabCity();
	}
	
}
