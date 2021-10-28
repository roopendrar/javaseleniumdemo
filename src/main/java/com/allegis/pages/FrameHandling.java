package com.allegis.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ReadExcel;

public class FrameHandling {
	
	@FindBy(css = "iframe#singleframe")
	public WebElement singleframe;
	
	@FindBy(xpath="//div[@style='margin-top: 150px']/input")
	public WebElement frametext;
	
	@FindBy(xpath="//li/a[text()='Iframe with in an Iframe']")
	public WebElement multipleframes; 
	
	@FindBy(xpath="//iframe[@style='float: left;height: 250px;width: 400px']")
	public WebElement multisingle;
	
	@FindBy(xpath="//iframe[@style='float: left;height: 300px;width:600px']")
	public WebElement multiframe;
	
	public FrameHandling(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	
	public void singleframebtn() {
		try {
			singleframe.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void frametext() {
		try {
			 List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			 frametext.sendKeys(testDataupdated.get(0).get("firstname"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void multipleframebtn() {
		try {
			multipleframes.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
