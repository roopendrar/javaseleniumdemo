package com.allegis.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WindowHandle {
	
	@FindBy(xpath = "//button[@class='btn btn-info' and text()='    click   ']")
	public WebElement newtabclick;
	
	@FindBy(xpath = "//li/a[text()='Open New Seperate Windows']")
	public WebElement windowbox;
	
	@FindBy(css = "button[class='btn btn-primary']")
	public WebElement windowclick;
	
	@FindBy(xpath = "//li/a[text()='Open Seperate Multiple Windows']")
	public WebElement multiwindowbox;
	
	@FindBy(css = "button[class='btn btn-info'][onclick='multiwindow()']")
	public WebElement multiclick;
	

	public WindowHandle(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void newtabbtn() {
		try {
			newtabclick.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void windowbox() {
		try {
			windowbox.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void windowclick() {
		try {
			windowclick.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void multiwindowbox() {
		try {
			multiwindowbox.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void multiclick() {
		try {
			multiclick.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
