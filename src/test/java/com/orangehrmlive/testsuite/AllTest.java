package com.orangehrmlive.testsuite;

import com.orangehrmlive.pages.LoginPage;
import com.orangehrmlive.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllTest extends TestBase {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickOnLoginButton();

        String expectedMessage = "Welcome Paul";
        String actualMessage = loginPage.getErrorMessage();
        Assert.assertEquals(expectedMessage,actualMessage,"Login message is not verify.");
    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        loginPage.clickOnLoginButton();

    }



}
