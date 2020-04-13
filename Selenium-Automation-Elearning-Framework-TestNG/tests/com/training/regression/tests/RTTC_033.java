package com.training.regression.tests;

import org.testng.annotations.Test;

import com.training.pom.RegisterPOM;
import com.training.sanity.tests.LoginTests;

public class RTTC_033 extends LoginTests {
private RegisterPOM registerPOM;
    private CheckOutPOM checkoutPOM;
    
    @Test
    public void Checkoutwithlogin()
    {
        registerPOM = new RegisterPOM(driver);
        checkoutPOM = new CheckOutPOM(driver);
        registerPOM.clickAccountlink();
        registerPOM.clickLoginregisterlink();
        registerPOM.enterloginEmail();
        registerPOM.enterloginPassword();
        registerPOM.clickLoginbtn();
        checkoutPOM.checkout_After_Prelogin();
    }
}