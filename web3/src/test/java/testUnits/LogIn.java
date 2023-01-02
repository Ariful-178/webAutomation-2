package testUnits;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import baseDriver.BaseDriver;

public class LogIn extends BaseDriver {

	WebDriver driver;

	public LogIn(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='user-name']")
	WebElement username1;
	@FindBy(xpath = "//input[@id='password']")
	WebElement password1;
	@FindBy(xpath = "//input[@id='login-button']")
	WebElement clickLogin1;

	public void enterUserName(String username) {
		username1.sendKeys(username);
	}

	public void enterpass(String pass) {
		password1.sendKeys(pass);
	}

	public void clickLogin() {
		clickLogin1.click();
	}

}
