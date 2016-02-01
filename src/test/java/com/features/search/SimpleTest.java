package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.pages.ToolsQaPage;
import com.steps.serenity.ToolsQaSteps;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

@RunWith(SerenityRunner.class)
public class SimpleTest {
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@Steps 
	ToolsQaSteps toolsSteps;
	
	ToolsQaPage toolsPage;
	/*
	@Test
	public void do_some_commands(){
	//	toolsPage.open();
		toolsSteps.accesPage();
	}
*/	
	
	@Test
	public void go_through_navigation_commands(){
	//	toolsPage.open();
		toolsSteps.navigation();
	}
}
