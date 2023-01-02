package testUnits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseDriver.BaseDriver;

public class RemoveFromCart extends BaseDriver {

	WebDriver driver1;

	public RemoveFromCart(WebDriver driver) {

		this.driver1 = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='remove-sauce-labs-backpack']")
	WebElement rproduct1;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bike-light']")
	WebElement rproduct2;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
	WebElement rproduct3;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-fleece-jacket']")
	WebElement rproduct4;
	@FindBy(xpath = "//button[@id='remove-sauce-labs-onesie']")
	WebElement rproduct5;
	@FindBy(xpath = "//button[@id='remove-test.allthethings()-t-shirt-(red)']")
	WebElement rproduct6;
	@FindBy(xpath = "//button[@id='checkout']")
	WebElement rproduct7;

	public void rproduct01() {
		rproduct1.click();
	}

	public void rproduct02() {
		rproduct2.click();
	}

	public void rproduct03() {
		rproduct3.click();
	}

	public void rproduct04() {
		rproduct4.click();
	}

	public void rproduct05() {
		rproduct5.click();
	}

	public void rproduct06() {
		rproduct6.click();
	}

	public void rproduct07() {
		rproduct7.click();
	}

}
