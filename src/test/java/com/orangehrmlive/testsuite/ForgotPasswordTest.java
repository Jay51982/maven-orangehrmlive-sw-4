package com.orangehrmlive.testsuite;

import com.orangehrmlive.pages.ForgotPasswordPage;
import com.orangehrmlive.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends TestBase {

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException {
        forgotPasswordPage.clickOnForgotPasswordLink();
        String expectedMessage = "Forgot Your Password?";
        String actualMessage = forgotPasswordPage.getForgotPasswordText();
        Assert.assertEquals(expectedMessage, actualMessage, "Forgot password page is missing");
    }
}
