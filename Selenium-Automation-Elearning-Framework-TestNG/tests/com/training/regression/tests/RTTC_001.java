package com.training.regression.tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.training.generics.ScreenShot;
import com.training.pom.LoginPOM;
import com.training.pom.RegisterPOM;
import com.training.sanity.tests.LoginTests;

public class RTTC_001 extends LoginTests  {
	
	
	
	private RegisterPOM registerPOM;
	
	
	@Test
	public void Registeruser()
	
	{
		registerPOM = new RegisterPOM(driver); 
		registerPOM.clickAccountlink();
		registerPOM.clickLoginregisterlink();
		registerPOM.clickRegisterbutton();
		registerPOM.completeregistration();
	

}
}
