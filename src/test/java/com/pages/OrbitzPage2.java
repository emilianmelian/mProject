package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import tools.OrbitzSiteModel;

public class OrbitzPage2 extends PageObject {
	@FindBy(css = "div.calendarBody table:nth-child(1) tbody tr:not(:first-child)  ")
	private WebElementFacade table1;

	@FindBy(css = "div.calendarBody table:nth-child(1) tbody tr:not(:first-child)  td a ")
	private List<WebElementFacade> dayList1;

	@FindBy(css = "div.calendarBody table:nth-child(2) tbody tr:not(:first-child)  td a ")
	private List<WebElementFacade> dayList2;

	@FindBy(css = "div.calendarBody table:nth-child(1) thead tr th")
	private WebElementFacade thead1;

	@FindBy(css = "div.calendarBody table:nth-child(2) thead tr th")
	private WebElementFacade thead2;

	@FindBy(css = "input[name*='chkin']")
	private WebElementFacade clickCheckin;

	@FindBy(css = "input[name*='chkout']")
	private WebElementFacade clickCheckout;
	
	@FindBy(css="select[name*='hotel.rating']")
	private WebElementFacade startRating;
	
	@FindBy(css="select[name*='adlts']")
	private WebElementFacade adultsNumber;
	
	@FindBy(css="select[name*='chlds']")
	private WebElementFacade childsNumber;
	
	@FindBy(css="input[name*='hotel.keyword.key']")
	private WebElementFacade whereLabel;
	
	@FindBy(css=".submit:nth-child(1) input")
	private WebElementFacade searchButton;
	
	

	public void checkIN() {

		clickCheckin.click();

	}

	public void checkOUT() {

		clickCheckout.click();

	}

	public void findMonth(String month, int day) {
		clickCheckin.click();
		if (thead1.getText().equals(month)) {
			for (WebElementFacade i : dayList1) {
				if (i.getText().contentEquals(Integer.toString(day))) {
					i.click();

					break;
				}
			}
		}
		if (thead2.getText().equals(month)) {
			for (WebElementFacade i : dayList2) {
				if (i.getText().contentEquals(Integer.toString(day))) {
					i.click();
					break;
				}
			}
		} 
		/*
		else {
			getDriver().findElement(By.cssSelector(".arrowNext")).click();
		}
		*/

	}

	public void findMonth2(String month, int day) {
		clickCheckout.click();
		if (thead1.getText().equals(month)) {
			for (WebElementFacade i : dayList1) {
				if (i.getText().contentEquals(Integer.toString(day))) {
					i.click();

					break;
				}
			}
		}
		if (thead2.getText().equals(month)) {
			for (WebElementFacade i : dayList2) {
				if (i.getText().contentEquals(Integer.toString(day))) {
					i.click();

					break;
				}
			}
		} /*
		else {
		getDriver().findElement(By.cssSelector(".arrowNext")).click();
	}
	*/
		
//input[type*='submit']
		//.submit:nth-child(1) input
	}

	public void accesPage() {
		// TODO Auto-generated method stub
		getDriver().navigate().to("http://www.orbitz.com/");
	}

	public void Dododod() {
		// TODO Auto-generated method stub
		whereLabel.sendKeys("Las Vegas Club Hotel & Casino, Las Vegas, NV, United States");
		searchButton.click();
		waitABit(10000);
	}
	
	public void selectElements(){
		Select oSelect = new Select(startRating);
		oSelect.selectByIndex(3);
		
		
		Select adltSelect = new Select(adultsNumber);
		adltSelect.selectByVisibleText("3");
		
		Select chldselect=new Select(childsNumber);
		chldselect.deselectByValue("1");
	}

	public  List<OrbitzSiteModel> grabPriceList(){
		
		List<OrbitzSiteModel> listprice= new ArrayList<OrbitzSiteModel>();
		
		return null;
		
	}
}
