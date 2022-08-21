package com.cydeo.tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTest {

    public WebDriver driver;
    String browserType;


    @Parameters("browser")

    @BeforeClass


    // Passing Browser parameter from TestNG xml
    public void beforeTest(String browser) {
        browserType = browser;
        // If the browser is Firefox, then do this

        switch (browser.toLowerCase()) {
            case "firefox":
                //Initializing the firefox driver (Gecko)
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            case "chrome":
                //Initialize the chrome driver
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            default:
                //Initialize the chrome driver
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;

        }

        /*
        if (browser.equalsIgnoreCase("firefox")) {
            //Initializing the firefox driver (Gecko)
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        }
        if (browser.equalsIgnoreCase("chrome")) {

            //Initialize the chrome driver
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }
        */


        // Enter the website address in the browser
        driver.get("https://www.google.com/");

    }

    // Once Before method is completed, Test method will start

    @Test
    public void search() throws InterruptedException {
        By xpath = By.xpath("//input[@name='q']");
        driver.findElement(xpath).sendKeys(browserType + Keys.ENTER);
        System.out.println(browserType +" is running");
    }

    @AfterClass
    public void afterTest() {

        driver.quit();

    }

}

