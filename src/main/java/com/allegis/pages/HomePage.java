package com.allegis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(css = "li#menu-item-251 a")
	public WebElement demosite;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void demobtn() {
		try {
			demosite.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
