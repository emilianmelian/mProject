package com.steps.serenity;

import java.util.ArrayList;
import java.util.List;

import com.pages.WizzDatePicker;
import com.pages.WizzPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class WizzSteps extends ScenarioSteps  {
	WizzPage page;
	WizzDatePicker datePicker;
	
	@Step
	public void grabCity() {
		page.accesWebSite();
		page.chooseCity();
	}
	
	
	
	@Step
	public List<WebElementFacade> grabMonthsList1(){
			List<WebElementFacade> finalResultList = new ArrayList<WebElementFacade>(); 
			///aici va trebuii sa fac un do while ...pana cand mai am buton de next  sa pun in lista final result
			//de asemenea trebuie implementata o metoda de genul isNextPresent
			
			for(int i=1;i<12;i++){
				
				List<WebElementFacade> partialList = datePicker.grabMonthList();
				finalResultList.addAll(partialList);
				System.out.println("am");
			};
			
			
			return finalResultList;
		}
	
	@Step
	 public void selectMonth1(String month,int day){
		//page.accesWebSite();
		//datePicker.clickCheckin();
		 
		// List<WebElementFacade> result = grabMonthsList1();	
		 System.out.println("aici ai ajuns");
		 datePicker.findM(month,day);
		 waitABit(2000);
	 }
	
	@Step
	 public void selectMonth2(String month,int day){
		//page.accesWebSite();
		//datePicker.clickCheckin();
		// datePicker.clickReturnDate();
		// List<WebElementFacade> result = grabMonthsList1();	
		
		 System.out.println("aici ai ajuns 2");
		 datePicker.findM1(month,day);
	//	 page.clickSearchButton();
		 
		 
		// selectMonth1(month,day);
		 datePicker.clickSearchButton();
		 //datePicker.message();
	 }
	


	@Step
	public void selectMonth(String month,int day) {
		// TODO Auto-generated method stub
		System.out.println("aici ai ajuns");
		datePicker.setDate(month,day);
		// datePicker.findM(month);
	}
	
}
