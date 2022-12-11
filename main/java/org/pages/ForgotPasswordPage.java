package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ForgotPasswordPage extends BaseClass {
    public ForgotPasswordPage(RemoteWebDriver driver) {
        this.driver=driver;
    }
    public boolean Header(){
        return driver.findElement(By.xpath("//h6[@class='oxd-text oxd-text--h6 orangehrm-forgot-password-title']")).isDisplayed();
    }
    public boolean forgetPasswordUsernameLabel(){
        return driver.findElement(By.xpath("//label[@class='oxd-label']")).isDisplayed();
    }
    public boolean ResetButton(){
        return driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
    }
    public boolean CancelButton(){
        return driver.findElement(By.xpath("//button[@type='button']")).isDisplayed();
    }
}
