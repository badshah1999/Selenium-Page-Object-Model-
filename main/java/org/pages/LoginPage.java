package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPage extends BaseClass {

    //Locators
    public LoginPage(RemoteWebDriver driver){
        this.driver = driver;
    }
    public boolean getUserLabel(){
       return driver.findElement(By.xpath("//label[normalize-space()='Username']")).isDisplayed();
    }
    public boolean getPasswordLabel(){
       return driver.findElement(By.xpath("//label[normalize-space()='Password']")).isDisplayed();
    }
    public boolean getLoginButton(){
        return driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();

    }
    public boolean forgotpasswordText(){
        return driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).isDisplayed();
    }

    //Params to be passed
    public LoginPage enterUserName(String username){
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
        return this;
    }
    public LoginPage enterPassword(String password){
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
        return this;
    }
    public void click(){
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }
    public ForgotPasswordPage forgetpass(){
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        return new ForgotPasswordPage(driver);
    }

}
