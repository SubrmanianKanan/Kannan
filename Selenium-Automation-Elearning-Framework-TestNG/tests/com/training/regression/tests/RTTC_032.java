package com.training.regression.tests;

import org.testng.annotations.Test;

import com.training.pom.CheckOutPOM;
import com.training.pom.RegisterPOM;
import com.training.sanity.tests.LoginTests;

public class RTTC_032 extends LoginTests {
	
	private CheckOutPOM checkoutPOM;
	@Test
	public void Checkoutwihtoutlogin()
	
	{
		checkoutPOM = new CheckOutPOM(driver); 
		checkoutPOM.checkout_Before_Prelogin();
	}

}
