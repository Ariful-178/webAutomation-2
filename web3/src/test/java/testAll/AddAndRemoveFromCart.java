package testAll;

import org.testng.annotations.Test;

import baseDriver.BaseDriver;
import testUnits.AddToCart;
import testUnits.RemoveFromCart;

public class AddAndRemoveFromCart extends BaseDriver {

	@Test(priority = 1)

	public void Add() throws InterruptedException {

		driver.manage().window().maximize();
		Thread.sleep(1000);
		AddToCart addtocart = new AddToCart(driver);
		System.out.println("wo-100");

		addtocart.product01();
		Thread.sleep(1000);
		addtocart.product02();
		Thread.sleep(1000);
		addtocart.product03();
		Thread.sleep(1000);
		addtocart.product04();
		Thread.sleep(1000);
		addtocart.product05();
		Thread.sleep(1000);
		addtocart.product06();
		Thread.sleep(1000);
		addtocart.product07();
		Thread.sleep(3000);

	}

	@Test(priority = 2)
	public void remove() throws InterruptedException {
		driver.manage().window().maximize();
		Thread.sleep(1000);
		RemoveFromCart remvtocart = new RemoveFromCart(driver);
		Thread.sleep(1000);
		remvtocart.rproduct01();
		Thread.sleep(1000);
		remvtocart.rproduct02();
		Thread.sleep(1000);
		remvtocart.rproduct03();
		Thread.sleep(1000);
		remvtocart.rproduct04();
		Thread.sleep(1000);
		remvtocart.rproduct05();
		Thread.sleep(1000);
		remvtocart.rproduct07();
		Thread.sleep(3000);

	}

}
