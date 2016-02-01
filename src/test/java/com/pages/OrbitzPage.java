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

public class OrbitzPage extends PageObject {

	@FindBy(css="div.calendarBody table:nth-child(1) tbody tr:not(:first-child)  ")
	private WebElementFacade table1;
	
	@FindBy(css = ".calendarBody table thead tr th")
	private List<WebElementFacade> monthList;
	
	@FindBy(css=".calendar twoMonth")
	private WebElementFacade calendarContainer;
	
	@FindBy(xpath="//input[@name='hotel.chkin']")
	private WebElementFacade clickCheckin;
	
	public void accesWebSite(){
		/*
	    hitgub 
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe"); 
		WebDriver driver = new ChromeDriver();
		
		driver
		
		//if you choose to run it with chrome driver..but you should use "driver" object for the rest of the project
		*/
		getDriver().navigate().to("http://www.orbitz.com/hotels/");
	}
	
	
	public void clickCheckin(){
		clickCheckin.click();
	}
	
	
	public void findMonth(List<WebElementFacade> ListElements,String month){
		for (WebElementFacade i : ListElements)
			if (i.getText().contentEquals(month)) {
				i.click();
				break;
			}else{
			//	getDriver().findElement(By.cssSelector(".button-next:nth-child(1) span:nth-child(1)")).click();;
			}
	}
	
	public List<WebElementFacade> grabMonthList() {
	//	element((WebElement) monthList).waitUntilVisible();
		
		List<WebElementFacade> resultList = new ArrayList<WebElementFacade>();
		
		List<WebElementFacade> entryList=monthList;
		System.out.println("am pus ceva in lista");
		
		for (WebElement webElement : entryList) {
			System.out.println(webElement);
			
			resultList.add((WebElementFacade) webElement);
		}
		return resultList;
	}


	public boolean isNextPresent() {
		boolean result = false;
		//element((WebElement) monthList).waitUntilVisible();
		
		System.out.println("am ajusn in next present");
		List<WebElement> nextButtonList = getDriver().findElements(By.cssSelector("a[style*='display: none'] "));
		
		
		System.out.println("intru in iful devastator");
		/*
		if (nextButtonList.size() > 0) {
			if (nextButtonList.get(0).getTagName().contentEquals("a")) {
				// nextButtonList.get(0).click();
				result = true;
			}
		}*/
	
		if(nextButtonList.isEmpty()){
			System.out.println("mda ies din if");
			getDriver().findElement(By.cssSelector(".arrowNext")).click();
			result=true;
			
		}
		return result;
		
	}
	
}
