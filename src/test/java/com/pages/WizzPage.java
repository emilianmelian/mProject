package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.Page;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class WizzPage  extends PageObject {

	
	@FindBy(css="input[id*='AutocompleteOriginStation']")
	WebElementFacade originStation;
	
	@FindBy(css="input[id*='AutocompleteDestinationStation']")
	WebElementFacade destinationStation;
	
	@FindBy(css = "li[data-iata='BLL']")
	private List<WebElementFacade> listOrase;
	
	@FindBy(css = ".home :nth-child(26) :nth-child(1) :nth-child(1) :nth-child(3)")
	private List<WebElementFacade> group;
	
	
	@FindBy(css="input[id='ControlGroupRibbonAnonNewHomeView_AvailabilitySearchInputRibbonAnonNewHomeView_DepartureDate']")
	private WebElementFacade  departureDate;
	
	@FindBy(id="ControlGroupRibbonAnonNewHomeView_AvailabilitySearchInputRibbonAnonNewHomeView_ButtonSubmit")
	private WebElementFacade  searchButton;
	
	@FindBy(id="HeaderControlGroupRibbonSelectView_AvailabilitySearchInputRibbonSelectView_ButtonSubmit")
	private WebElementFacade  searchButton1;
	
	//.wrap:nth-child(1) li[data-iata='ABZ']
			
			//prinde elementele din lista a doua
	//		 .wrap ul li  > :first-child
	
	//  .home :nth-child(26) :nth-child(1) :nth-child(1) :nth-child(3)
	public void accesWebSite(){
		
		getDriver().navigate().to("https://wizzair.com/en-GB/FlightSearch");
	}
	
	 public void  chooseCity(){
		// originStation.click();
		// originStation.click();
		// originStation.click();
	//	 waitABit(2000);
		// WebDriverWait wait = new WebDriverWait(getDriver(), 15);
		// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='text3']"))); 
		//List<WebElementFacade> resultList = new ArrayList<WebElementFacade>();
		//List<WebElementFacade> entryList=listOrase;
		//List<WebElementFacade> lista1=new List<WebelementFacade>;
		
		//for (WebElement webElement : entryList) {
		///	System.out.println("cevvaaaaaaaa"+webElement);
		//	webElement.click();
		//	break;\
		 
		 
		 
		 
		 
		 originStation.sendKeys("Aberdeen");
		 destinationStation.sendKeys("Gdansk");
		 
	//	 destinationStation.sendKeys(arg0);
		 
		 
		 getDriver().findElement(By.cssSelector("input[id*='AutocompleteDestinationStation']")).sendKeys(Keys.RETURN);
		/// getDriver().findElement(By.cssSelector("button[id*=HeaderControlGroupRibbonSelectView_AvailabilitySearchInputRibbonSelectView_ButtonSubmit]")).sendKeys(Keys.RETURN);
		 departureDate.click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		// getDriver().findElement(By.xpath("html/body/div[12]/div/ul/li[1]")).click();
	  //  element(group).waitUntilVisible();
		//waitABit(5000);
	    
	   // Select oSelect = new Select(getDriver().findElement(By.xpath("html/body/div[12]/div/ul")));
	    
		// getDriver().findElement(By.cssSelector(".home :nth-child(26) :nth-child(1) :nth-child(1) :nth-child(3) :nth-child(3)")).click();
		// ((WebElement) getDriver()).sendKeys(Keys.RETURN);
	//	 getDriver().findElement(By.cssSelector("input[id*='AutocompleteOriginStation']")).sendKeys(Keys.ENTER);
	 //   oSelect.selectByIndex(2);
	   // Thread.sleep(2000);
	    
		// waitABit(2000);
		// getDriver().findElement(By.xpath("html/body/div[14]/div/ul/li[1]")).click();
		 
		 /* List<WebElement> oSize = oSelect.getOptions();
			int iListSize = oSize.size();
	 
			// Setting up the loop to print all the options
			for(int i =0; i < iListSize ; i++){
				// Storing the value of the option	
				String sValue = oSelect.getOptions().get(i).getText();
				// Printing the stored value
				System.out.println(sValue);
				// Putting a check on each option that if any of the option is equal to 'Africa" then select it 
				if(sValue.equals("BCN")){
					oSelect.selectByIndex(i);
					break;
					}
				}
				*/
		// selectAsignee();
		// System.out.println(selectAsignee());
		//	List elements =  (List) js.executeScript("return jQuery.find(':checked')");
		//	String jQuerySelector = "'#myDiv input.test'";
		
			
			//	RenderedWebElement webElement = (RenderedWebElement) ((JavascriptExecutor) webDriver).executeScript("return $(" + jQuerySelector+ ").get(0);");
			
		// List<WebElementFacade> nimic=group;
		// for(WebElementFacade x:nimic){
		//	 System.out.println(x.getText());
		 }
		 
			public void clickSearchButton(){
			//	searchButton.click();
	    //	 getDriver().findElement(By.id("HeaderControlGroupRibbonSelectView_AvailabilitySearchInputRibbonSelectView_ButtonSubmit]")).sendKeys(Keys.RETURN);
				searchButton1.sendKeys(Keys.RETURN);
			}
		}
	 
	 
	
	
	
	

