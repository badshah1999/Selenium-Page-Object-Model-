package org.base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.utils.ReadExcel;

import java.io.IOException;
import java.time.Duration;

public class BaseClass{
    public RemoteWebDriver driver = null;
    String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @DataProvider(name = "data")
    public Object[][] Exceldataprovider() throws IOException {
        Object[][] exceldata = ReadExcel.getExcel("/Users/badshah.p/Desktop/PageObjectModel.xlsx");
    return exceldata;
    }
    @BeforeMethod
    public void startup(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(url);
    }
    @AfterMethod
    public void endUp() throws InterruptedException{
        Thread.sleep(3000);
        driver.quit();
    }
}
