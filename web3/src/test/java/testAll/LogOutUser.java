package testAll;

import org.testng.annotations.Test;

import baseDriver.BaseDriver;
import testUnits.LogOut;

public class LogOutUser extends BaseDriver {

	@Test
	public void SignOutUser() throws InterruptedException {
		// TODO Auto-generated method stub

		System.out.println("working-1");

		LogOut lOut = new LogOut(driver);

		System.out.println("working-2");

		lOut.logOutBtn();

		System.out.println("working-3");
		Thread.sleep(1000);
		lOut.clickLogout();
		Thread.sleep(1000);

	}

}
