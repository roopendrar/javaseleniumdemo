package com.allegis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertsClass {
	
	@FindBy(css = "button[class='btn btn-danger']")
	public WebElement simplealertbtn;
	
	@FindBy(xpath = "//a[@class='analystic' and text()='Alert with OK & Cancel ']")
	public WebElement confirmationbox;
	
	@FindBy(css = "button[class='btn btn-primary']")
	public WebElement confirmbtn;
	
	@FindBy(xpath = "//a[@class='analystic' and text()='Alert with Textbox ']")
	public WebElement promtbox;
	
	@FindBy(css = "button[class='btn btn-info']")
	public WebElement promtbtn;
	
	
	public AlertsClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void simplealertbtn() {
		try {
			simplealertbtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void confirmbox() {
		try {
			confirmationbox.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void confirmbtn() {
		try {
			confirmbtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void promtbox() {
		try {
			promtbox.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void promtbtn() {
		try {
			promtbtn.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
