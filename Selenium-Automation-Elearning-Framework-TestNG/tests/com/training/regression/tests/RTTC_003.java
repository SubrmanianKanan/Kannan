package com.training.regression.tests;

import org.testng.annotations.Test;

import com.training.pom.RegisterPOM;
import com.training.sanity.tests.LoginTests;

public class RTTC_003 extends LoginTests {
	
	private RegisterPOM registerPOM;
	
	@Test
	public void Registeruser()
	
	{
		registerPOM = new RegisterPOM(driver); 
		registerPOM.clickAccountlink();
		registerPOM.clickLoginregisterlink();
		registerPOM.enterloginEmail();
		registerPOM.enterwrongloginPassword();
		registerPOM.clickLoginbtn();
		registerPOM.clickForgottenpwlink();
		registerPOM.enterloginEmail();
		registerPOM.clickContinuebutton();
		//comment

}
}
//test