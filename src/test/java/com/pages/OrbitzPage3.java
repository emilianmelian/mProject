package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class OrbitzPage3 extends PageObject {
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
		

	}

	public void accesPage() {
		// TODO Auto-generated method stub
		getDriver().navigate().to("http://www.orbitz.com/");
	}

	public void Dododod() {
		// TODO Auto-generated method stub
		System.out.println("test");
	}

}
