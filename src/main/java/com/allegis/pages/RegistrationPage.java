package com.allegis.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.ReadExcel;

public class RegistrationPage {

	@FindBy(css = "input[placeholder='First Name']")
	public WebElement firstname;

	@FindBy(css = "input[placeholder='Last Name']")
	public WebElement lastname;

	@FindBy(css = "textarea[class='form-control ng-pristine ng-untouched ng-valid']")
	public WebElement address;

	@FindBy(css = "input[type='email']")
	public WebElement email;

	@FindBy(css = "input[type='tel']")
	public WebElement number;

	@FindBy(css = "input[value='Male']")
	public WebElement maleradio;

	@FindBy(css = "input#checkbox1")
	public WebElement checkbox1;

	@FindBy(css = "input#checkbox2")
	public WebElement checkbox2;

	@FindBy(css = "div#msdd")
	public WebElement languages;

	@FindBy(xpath = "//a[text()='English']")
	public WebElement english;

	@FindBy(css = "select#Skills")
	public WebElement selectskills;

	public void selectskills(WebDriver driver) {
		Select skills = new Select(selectskills);
		skills.selectByValue("Certifications");
	}

	@FindBy(css = "select#country")
	public WebElement selectcountry;

	public void selectcountry(WebDriver driver) {
		Select country = new Select(selectcountry);
		country.selectByValue("India");
	}

	@FindBy(css = "select#yearbox")
	public WebElement selectyear;

	public void selctedyear(WebDriver driver) {
		Select year = new Select(selectyear);
		year.selectByValue("1969");
	}

	@FindBy(css = "select[placeholder='Month']")
	public WebElement selectmonth;

	public void selectedmonth(WebDriver driver) {
		Select month = new Select(selectmonth);
		month.selectByValue("September");
	}

	@FindBy(css = "select#daybox")
	public WebElement selectday;

	public void selectedday(WebDriver driver) {
		Select date = new Select(selectday);
		date.selectByValue("9");
	}

	@FindBy(css = "input#firstpassword")
	public WebElement password;

	@FindBy(css = "input#secondpassword")
	public WebElement confirmpassword;

	@FindBy(css = "input#imagesrc")
	public WebElement fileupload;

	@FindBy(css = "button#Button1")
	public WebElement refresh;

	@FindBy(xpath = "//a[@class='dropdown-toggle' and text()='SwitchTo']")
	public WebElement switchto;

	@FindBy(xpath = "//a[text()='Alerts']")
	public WebElement alerts;

	@FindBy(css = "div#dismiss-button")
	public WebElement adds;

	@FindBy(xpath = "//a[text()='Windows']")
	public WebElement window;

	@FindBy(xpath = "//li/a[text()='Frames']")
	public WebElement frames;

	public RegistrationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void firstname() {
		try {
			List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			firstname.sendKeys(testDataupdated.get(0).get("firstname"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void lastname() {
		try {
			List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			lastname.sendKeys(testDataupdated.get(0).get("lastname"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setaddress() {
		try {
			List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			address.sendKeys(testDataupdated.get(0).get("address"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setemail() {
		try {
			List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			email.sendKeys(testDataupdated.get(0).get("email"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setphonenumber() {
		try {
			List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			number.sendKeys(testDataupdated.get(0).get("phonenumber"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectgender() {
		try {
			maleradio.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void checkbox1() {
		try {
			checkbox1.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void checkbox2() {
		try {
			checkbox2.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void languages() {
		try {
			languages.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void english() {
		try {
			english.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectskills() {
		try {
			selectskills.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectcountry() {
		try {
			selectcountry.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectyear() {
		try {
			selectyear.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectmonth() {
		try {
			selectmonth.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void selectdate() {
		try {
			selectday.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void setpassword() {
		try {
			List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			password.sendKeys(testDataupdated.get(0).get("password"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void confirmpassword() {
		try {
			List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			confirmpassword.sendKeys(testDataupdated.get(0).get("confirmpassword"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void upload() {
		try {
			List<Map<String, String>> testDataupdated = ReadExcel.readstringdata();
			fileupload.sendKeys(testDataupdated.get(0).get("filepath"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void refreshbtn() {
		try {
			refresh.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void switchbtn() {
		try {
			switchto.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void alertbtn() {
		try {
			alerts.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void adds() {
		try {
			adds.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void windows() {
		try {
			window.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void frames() {
		try {
			frames.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
