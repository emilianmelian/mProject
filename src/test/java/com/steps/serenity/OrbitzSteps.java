package com.steps.serenity;

import java.util.ArrayList;
import java.util.List;

import com.pages.OrbitzPage;
import com.pages.OrbitzPage2;
import com.pages.OrbitzPage3;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class OrbitzSteps extends ScenarioSteps {
	OrbitzPage orbitzPage;
	OrbitzPage2 orbitzPage2;
	OrbitzPage3 orbitzPage3;
	@Step
	public List<WebElementFacade> grabMonthsList1() {
		List<WebElementFacade> finalResultList = new ArrayList<WebElementFacade>();
		/// aici va trebuii sa fac un do while ...pana cand mai am buton de next
		/// sa pun in lista final result
		// de asemenea trebuie implementata o metoda de genul isNextPresent

		do {
			List<WebElementFacade> partialList = orbitzPage.grabMonthList();
			finalResultList.addAll(partialList);
			System.out.println("am facut to din  dooooooo");
		} while (orbitzPage.isNextPresent());

		return finalResultList;
	}

	@Step
	public void selectMonth(String month) {
		orbitzPage.accesWebSite();
		orbitzPage.clickCheckin();

		List<WebElementFacade> result = grabMonthsList1();
		System.out.println("aici ai ajuns");
		orbitzPage.findMonth(result, month);
	}

	@Step
	public void selectMonth2(String month, int day) {
		// orbitzPage2.checkDate(1);
		orbitzPage2.checkIN();
		orbitzPage2.findMonth(month, day);
		waitABit(5000);
	}

	@Step
	public void accesPage2() {
		orbitzPage2.accesPage();
	}

	@Step
	public void selectMonth3(String month, int day) {
		// TODO Auto-generated method stub
		// orbitzPage2.checkDate(2);
		//orbitzPage2.checkOUT();

		orbitzPage3.findMonth2(month, day);
	}

	public void selectElements() {
		// TODO Auto-generated method stub
		orbitzPage2.selectElements();
		orbitzPage2.Dododod();
	}
}
