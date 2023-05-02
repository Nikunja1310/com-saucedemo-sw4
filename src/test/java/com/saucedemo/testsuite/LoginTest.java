package com.saucedemo.testsuite;


import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
 * Created by Nikunja A Senjalia
 * */
public class LoginTest extends BaseTest {
    //Object creation to call other class

    LoginPage loginPage = new LoginPage();
    ProductsPage productsPage = new ProductsPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        String expectedMessage = "Products";
        Assert.assertEquals(expectedMessage, getTextFromElement(By.xpath("//span[@class='title']")), "Products text is not matching");
    }
@Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        int expectedSize = 6;
        int actualSize = productsPage.getactualSizeOfProducts();
        Assert.assertEquals(expectedSize, actualSize, "Size does not match");
    }
}
