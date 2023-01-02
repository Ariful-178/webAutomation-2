package testAll;

import org.testng.annotations.Test;

import baseDriver.BaseDriver;
import testUnits.LogIn;

public class signInUser extends BaseDriver {

	@Test
	public void loginUser() throws InterruptedException {
		// TODO Auto-generated method stub

		driver.manage().window().maximize();
		Thread.sleep(1000);

		LogIn lpgIn = new LogIn(driver);
		System.out.println("wo-1");
		lpgIn.enterUserName("standard_user");
		System.out.println("wo-2");
		lpgIn.enterpass("secret_sauce");
		System.out.println("wo-3");
		lpgIn.clickLogin();

	}

}
