package org.testcases;

import org.base.BaseClass;
import org.pages.ForgotPasswordPage;
import org.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPageTest extends BaseClass {

    @Test
    public void forgotpass(){
        new LoginPage(driver)
                .forgetpass();
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println("Forgot Page Title:"+title);
        System.out.println("Forgot Page URL:"+url);


    /**
     * This code will validate all the labels present in the Forgot password page
     */

        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);

        boolean boolUsername = forgotPasswordPage.forgetPasswordUsernameLabel();
        Assert.assertTrue(true);

        boolean boolPassword = forgotPasswordPage.Header();
        Assert.assertTrue(true);

        boolean boolReset = forgotPasswordPage.ResetButton();
        Assert.assertTrue(true);

        boolean boolCancel = forgotPasswordPage.CancelButton();
        Assert.assertTrue(true);
    }
}
