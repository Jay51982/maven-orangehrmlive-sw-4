package com.orangehrmlive.pages;


import com.orangehrmlive.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    //storing element in variable

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By userName = By.id("txtUsername");
    By passwordField = By.id("txtPassword");
    By loginButton = By.xpath("//input[@id='btnLogin']");
    By errorMessage = By.id("welcome");

    // for each element need to create method

    public String getWelcomeText(){

        return getTextFromElement(welcomeText);
    }
    public void enterUserName(String email){

        sendTextToElement(userName,email);
    }
    public void enterPassword(String password){

        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){

        clickOnElement(loginButton);
    }
    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }

}
