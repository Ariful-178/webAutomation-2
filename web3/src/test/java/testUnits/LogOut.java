package testUnits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.BaseDriver;

public class LogOut extends BaseDriver {

	WebDriver driver;

	public LogOut(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "react-burger-menu-btn")
	WebElement Logout1;
	@FindBy(id = "logout_sidebar_link")
	WebElement clickLogOut1;

	public void logOutBtn() {
		Logout1.click();
	}

	public void clickLogout() {
		clickLogOut1.click();
	}
}
