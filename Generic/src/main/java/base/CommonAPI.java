package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public WebDriver driver = null;
    String url = "https://www.facebook.com/";

    @BeforeMethod
    public void setUp(String url){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\mdnas\\eclipse-workspace\\WebAutomation\\Generic\\Browser-Driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
    }
    @AfterMethod
    public void cleanUp(){driver.close();}
}
