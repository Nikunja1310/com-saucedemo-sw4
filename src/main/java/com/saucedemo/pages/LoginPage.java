package com.saucedemo.pages;
import com.saucedemo.utilities.Utility;
import org.openqa.selenium.By;

/**
 * Created By Nikunja A Senjalia
 */
public class LoginPage extends Utility {

    By usernameField = By.xpath("//input[@id='user-name']");
    By passwordField = By.name("password");
    By loginButton = By.xpath("//input[@id='login-button']");
    By productsText = By.id("//span[@class='title']");

   // By errorMessage = By.xpath("//div[@class='message-error validation-summary-errors']");


    public void enterUserName(String username){
        sendTextToElement(usernameField, username);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }


    public String getProductText(){
        return getTextFromElement(productsText);
    }
//
//    public String getErrorMessage(){
//        return getTextFromElement(errorMessage);
//    }
}
