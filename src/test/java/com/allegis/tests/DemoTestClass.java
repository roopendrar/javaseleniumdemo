package com.allegis.tests;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.allegis.pages.AlertsClass;
import com.allegis.pages.FrameHandling;
import com.allegis.pages.HomePage;
import com.allegis.pages.RegistrationPage;
import com.allegis.pages.WindowHandle;

public class DemoTestClass extends TestBase {

	@Test(priority = 1, enabled = true, description = "enabling all the given checkboxes, dropdown, fileupload, and inputkeys")
	public void firstTest() throws InterruptedException {
		HomePage home = new HomePage(driver);
		RegistrationPage register = new RegistrationPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);

		home.demobtn();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Register");

		wait.until(ExpectedConditions.visibilityOf(register.firstname));
		register.firstname();
		register.lastname();
		register.setaddress();
		register.setemail();
		register.setphonenumber();
		register.selectgender();
		register.checkbox1();
		register.checkbox2();
		register.selectskills();
		register.selectskills(driver);
		register.selectcountry();
		register.selectcountry(driver);
		register.selectyear();
		register.selctedyear(driver);
		register.selectmonth();
		register.selectedmonth(driver);
		register.selectdate();
		register.selectedday(driver);
		register.setpassword();
		register.confirmpassword();
		wait.until(ExpectedConditions.visibilityOf(register.fileupload));
		// register.upload();
		Reporter.log("Account registered by using all the above elements");
		Thread.sleep(5000);
		wait.until(ExpectedConditions.visibilityOf(register.refresh));
		register.refreshbtn();

		driver.close();

	}

	@Test(priority = 2, enabled = true, description = "working on all the three different types of alerts")
	public void alerts() throws InterruptedException {

		HomePage home = new HomePage(driver);
		RegistrationPage register = new RegistrationPage(driver);
		Actions action = new Actions(driver);
		AlertsClass alerts = new AlertsClass(driver);
		WebDriverWait wait = new WebDriverWait(driver, 60);

		home.demobtn();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Register");

		wait.until(ExpectedConditions.visibilityOf(register.switchto));
		register.switchbtn();
		action.moveToElement(register.alerts);
		register.alertbtn();
		// register.adds();

		wait.until(ExpectedConditions.visibilityOf(alerts.simplealertbtn));
		alerts.simplealertbtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		Reporter.log("Simple alert accepted");

		alerts.confirmbox();
		wait.until(ExpectedConditions.visibilityOf(alerts.confirmbtn));
		alerts.confirmbtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().alert().dismiss();
		Thread.sleep(5000);
		Reporter.log("confirmation alert declined");

		alerts.promtbox();
		wait.until(ExpectedConditions.visibilityOf(alerts.promtbtn));
		alerts.promtbtn();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		Reporter.log("promt alert text printed and accepted");

		driver.close();

	}

	@Test(priority = 3, enabled = true, description = "Handling single and multiple windows")
	public void windowhandle() {

		HomePage home = new HomePage(driver);
		RegistrationPage register = new RegistrationPage(driver);
		WindowHandle window = new WindowHandle(driver);
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		home.demobtn();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Register");

		wait.until(ExpectedConditions.visibilityOf(register.switchto));
		register.switchbtn();
		action.moveToElement(register.window);
		register.windows();

		wait.until(ExpectedConditions.visibilityOf(window.newtabclick));
		window.newtabbtn();
		String parent = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();

		while (iterator.hasNext()) {

			String child_window = iterator.next();
			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);
				Reporter.log("driver switched to the child window successfully");
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String title2 = driver.getTitle();
				Assert.assertEquals(title2, "Selenium");
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Reporter.log("The title of the new tab fetched successfully");

		wait.until(ExpectedConditions.visibilityOf(window.windowbox));
		window.windowbox();
		wait.until(ExpectedConditions.visibilityOf(window.windowclick));
		window.windowclick();
		String parent2 = driver.getWindowHandle();
		Set<String> windows2 = driver.getWindowHandles();
		Iterator<String> iterator2 = windows2.iterator();

		while (iterator.hasNext()) {

			String child_window = iterator2.next();
			if (!parent2.equals(child_window)) {
				driver.switchTo().window(child_window);
				Reporter.log("driver switched to the child window successfully");
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String title3 = driver.getTitle();
				Assert.assertEquals(title3, "SeleniumHQ Browser Automation");
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Reporter.log("The title of the new window fetched successfully");

		wait.until(ExpectedConditions.visibilityOf(window.multiwindowbox));
		window.multiwindowbox();
		wait.until(ExpectedConditions.visibilityOf(window.multiclick));
		window.multiclick();
		String parent3 = driver.getWindowHandle();
		Set<String> windows3 = driver.getWindowHandles();
		Iterator<String> iterator3 = windows3.iterator();

		while (iterator.hasNext()) {

			String child_window = iterator3.next();
			if (!parent3.equals(child_window)) {
				driver.switchTo().window(child_window);
				Reporter.log("driver switched to the child window successfully");
				System.out.println(driver.switchTo().window(child_window).getTitle());
				String title4 = driver.getTitle();
				Assert.assertEquals(title4, "SeleniumHQ Browser Automation");
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		Reporter.log("The title of the multiple window fetched successfully");

		driver.close();
	}

	@Test(priority = 4, enabled = true, description = "Handling the single and multiple window frames")
	public void frames() throws InterruptedException {

		HomePage home = new HomePage(driver);
		RegistrationPage register = new RegistrationPage(driver);
		FrameHandling frames = new FrameHandling(driver);
		Actions action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		home.demobtn();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Register");

		wait.until(ExpectedConditions.visibilityOf(register.switchto));
		register.switchbtn();
		action.moveToElement(register.frames);
		register.frames();

		Reporter.log("single window frame");
		wait.until(ExpectedConditions.visibilityOf(frames.singleframe));
		driver.switchTo().frame(frames.singleframe);
		frames.frametext();
		Reporter.log("switched to new frame and entered the text");
		Thread.sleep(5000);
		driver.switchTo().defaultContent();
		Reporter.log("switched to main window frame");

		Reporter.log("Multiple window frames");
		wait.until(ExpectedConditions.visibilityOf(frames.multipleframes));
		frames.multipleframebtn();
		driver.switchTo().frame(frames.multiframe);
		Reporter.log("Switched to Multiple window frames 1");
		driver.switchTo().frame(frames.multisingle);
		Reporter.log("Switched to Multiple window frames 2");
		Reporter.log("switched to new frame and entered the text");
		frames.frametext();
		driver.switchTo().defaultContent();
		Reporter.log("frames operation executed successfully");
		Thread.sleep(5000);
		driver.close();

	}
}
