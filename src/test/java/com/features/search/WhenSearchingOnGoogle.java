package com.features.search;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.pages.GooglePage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;

@RunWith(SerenityRunner.class)
public class WhenSearchingOnGoogle {

    @Managed                                                                
    WebDriver driver;
    
    GooglePage googlePage;

    @Test
    public void shouldInstantiateAWebDriverInstanceForAWebTest() {
    	 googlePage.open();

     //   googlePage.searchFor("firefly");

      //   assertThat(googlePage.getTitle()).isEqualTo("firefly - Google Search");
    }
}