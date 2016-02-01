package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;

//@DefaultUrl("http://www.store.demoqa.com")
public class ToolsQaPage extends PageObject{
	
	@FindBy(css = "div.menu-registration-container ul a")
	private WebElementFacade registrationButton;
	
	public void browserCommnads(){
		getDriver().navigate().to("http://www.DemoQA.com");
		String tile=getDriver().getTitle();
		int titleLength=getDriver().getTitle().length();
		
		System.out.println("title in the page is : "+tile);
		System.out.println("length ogf the tile is:  "+titleLength);
		
		//String url = "http://www.store.demoqa.com";
		//int titleLength=driver.getTitle().length();

	}
	
	public void navigateCommnads(){
		getDriver().navigate().to("http://www.DemoQA.com");
		registrationButton.click();
		
		getDriver().navigate().back();
		getDriver().navigate().forward();
		getDriver().navigate().to("http://www.DemoQA.com");
		
		getDriver().navigate().refresh();
		getDriver().close();
		
	}
   
	
	
	
}
