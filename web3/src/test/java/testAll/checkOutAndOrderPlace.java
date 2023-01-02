package testAll;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import baseDriver.BaseDriver;

public class checkOutAndOrderPlace extends BaseDriver {

	@Test
	private void checkoutAndOrder() throws InterruptedException {

		driver.manage().window().maximize();
		Thread.sleep(2000);

		driver.findElement(By.id("first-name")).sendKeys("ariful");
		Thread.sleep(1000);
		driver.findElement(By.id("last-name")).sendKeys("islam");
		Thread.sleep(1000);
		driver.findElement(By.id("postal-code")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='finish']")).click();
		Thread.sleep(3000);

	}

}

