package testUnits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import baseDriver.BaseDriver;

public class AddToCart extends BaseDriver {

	WebDriver driver1;

	public AddToCart(WebDriver driver) {

		this.driver1 = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement product1;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bike-light']")
	WebElement product2;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
	WebElement product3;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	WebElement product4;
	@FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-onesie']")
	WebElement product5;
	@FindBy(xpath = "//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']")
	WebElement product6;
	@FindBy(xpath = "//a[@class='shopping_cart_link']")
	WebElement product7;

	public void product01() {
		product1.click();
	}

	public void product02() {
		product2.click();
	}

	public void product03() {
		product3.click();
	}

	public void product04() {
		product4.click();
	}

	public void product05() {
		product5.click();
	}

	public void product06() {
		product6.click();
	}

	public void product07() {
		product7.click();
	}

}
