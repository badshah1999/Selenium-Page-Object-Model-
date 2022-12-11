package org.testcases;

import org.base.BaseClass;
import org.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    /**
     * @param data - This will return the data from the base class Data provider
     */
    @Test(dataProvider = "data",invocationCount = 2)
    public void login(String data[]){
        /**
        * This code will validate all the labels present in the login page
        */
        LoginPage loginPage = new LoginPage(driver);

        boolean getUserLabel = loginPage.getUserLabel();
        Assert.assertTrue(true);

        boolean getPassword  =loginPage.getPasswordLabel();
        Assert.assertTrue(true);

        boolean getLoginButton = loginPage.getLoginButton();
        Assert.assertTrue(true);

        boolean forgetpassword = loginPage.forgotpasswordText();
        Assert.assertTrue(true);

        /**
         * Getting the current URL and Title of the WebPage
         */
        String currentURL = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println("Current URL:"+currentURL);
        System.out.println("Title:"+title);

        /**
         * Invoking the methods by creating a constructor
         * Passing the required data
         */
        new LoginPage(driver)
                .enterUserName(data[0])
                .enterPassword(data[1])
                .click();

    }
}
