package com.steps.serenity;

import com.pages.ToolsQaPage;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ToolsQaSteps extends ScenarioSteps  {

	ToolsQaPage  toolsPage;
	
	@Step
	public void accesPage() {
		toolsPage.browserCommnads();
	}
	
	@Step
	public void navigation() {
		toolsPage.navigateCommnads();
	}
	
}
