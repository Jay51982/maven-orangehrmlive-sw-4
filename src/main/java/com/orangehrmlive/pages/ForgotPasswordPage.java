package com.orangehrmlive.pages;


import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {

    By forgotPasswordLink = By.xpath("//a[normalize-space()='Forgot your password?']");
   // By forgotPasswordText  = By.xpath("//a[text() = 'Forgot your password?']");

  // By forgotPasswordText  = By.xpath("//a[@href = '/index.php/auth/requestPasswordResetCode']");
   By forgotPasswordText  = By.xpath("//h1[contains(text(),'Forgot Your Password?')]");

    public void clickOnForgotPasswordLink(){
        clickOnElement(forgotPasswordLink);
    }
    public String getForgotPasswordText(){
        return getTextFromElement(forgotPasswordText);
    }

}
