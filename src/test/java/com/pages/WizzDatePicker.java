package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.jruby.RubyProcess.Sys;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class WizzDatePicker extends PageObject {
	

	@FindBy(css = "[style*='display: block'] .ui-datepicker-year")
	private List<WebElementFacade> yearList;

	@FindBy(css = "[style*='display: block'] .ui-datepicker-month")
	private List<WebElementFacade> monthList;

	@FindBy(css = "[style*='display: block'] .ui-datepicker-calendar tbody tr td a")
	private List<WebElementFacade> dayList;
	
	
	@FindBy(css = "[style*='display: block'] .ui-datepicker-next")
	private WebElementFacade nextButton;
	
	@FindBy(css = "input[id='ControlGroupRibbonAnonNewHomeView_AvailabilitySearchInputRibbonAnonNewHomeView_ReturnDate']")
	private WebElementFacade returnDate;
	
	List<WebElementFacade> globalList = new ArrayList<WebElementFacade>();

	@FindBy(css=".promocode-search-flights-button button")
	private WebElementFacade searchButton3;
	
	public void setDate(String month,int day) {
		// click twice on title to open year view
		
/*
		//select year
		for (WebElementFacade i : yearList)
			if (i.getText().contentEquals(Integer.toString(year))) {
				i.click();
				break;
			}
*/
		/*
		*/
		for (WebElementFacade x:monthList){
			globalList.add(x);
		}
			
		boolean unu=true;
		do{
			
			for (WebElementFacade i : globalList)
				if (i.getText().contentEquals(month)) {
					i.click();
					break;
				}else{
					globalList.add(i);
					nextButton.click();
					
				}
		}while(!unu);
	
		
		
		//select day
		for (WebElementFacade i : dayList)
			if (i.getText().contentEquals(Integer.toString(day))) {
				i.click();
				break;
			}

		
		
		
	}
	
	
	
	public void findMonth(List<WebElementFacade> ListElements,String month){
		
		for (WebElementFacade i : ListElements)
			if (i.getText().contentEquals(month)) {
				i.click();
				break;
			}
			else{
				nextButton.click();
				grabMonthList();
			}
	}
	
	public void findM(String month,int day){
		String luna=month;
		boolean nimic=false;
		
		do{
			List<WebElementFacade> List1 = new ArrayList<WebElementFacade>();
			globalList.add(monthList.get(monthList.size()-1));
			
			
			for(WebElementFacade x:globalList){
				System.out.println(x.getText());
			}
			for (WebElementFacade i : globalList)
				if (i.getText().contentEquals(luna)) {
					nimic=true;
					List1.add(i);
					//i.click();
					globalList.clear();
					break;
				}
				if(List1.isEmpty()){
					nextButton.click();
					waitABit(2000);
				}
			
	
			
		}while(nimic==true);
		
		for (WebElementFacade i : dayList)
			if (i.getText().contentEquals(Integer.toString(day))) {
				i.click();
				
				break;
		 	}
		returnDate.click();
	}
	
	
	public List<WebElementFacade> grabMonthList() {
	//	element((WebElement) monthList).waitUntilVisible();
		
		List<WebElementFacade> resultList = new ArrayList<WebElementFacade>();
		
		List<WebElementFacade> entryList=monthList;
		System.out.println("am pus ceva in lista");
		
		for (WebElementFacade webElement : entryList) {
			System.out.println(webElement);
			
			resultList.add(webElement);
		}
		return resultList;
	}


	public boolean isNextPresent(String month) {
		boolean result = false;
		//element((WebElement) monthList).waitUntilVisible();
		
		System.out.println("am ajusn in next present");
		List<WebElement> nextButtonList = getDriver().findElements(By.cssSelector("a[style*='display: none'] "));
		
		
		System.out.println("");
		/*
		if (nextButtonList.size() > 0) {
			if (nextButtonList.get(0).getTagName().contentEquals("a")) {
				// nextButtonList.get(0).click();
				result = true;
			}
		}*/
	
		if(nextButtonList.isEmpty()){
			System.out.println("mda ies din if");
			nextButton.click();
			result=true;
			
		}
		return result;
		
	}



	public void clickReturnDate() {
		// TODO Auto-generated method stub
		returnDate.click();
	}
	
	public void message(){
		System.out.println("da merge");
	}



	public void findM1(String month, int day) {
	
		
		for (WebElementFacade i : dayList)
			if (i.getText().contentEquals(Integer.toString(day))) {
				i.click();
				break;
		 	}
	//	returnDate.click();
	}



	public void clickSearchButton() {
		// TODO Auto-generated method stub
		waitABit(3000);
		searchButton3.click();;
		
	}
	
	
}
