package com.rcv.seleniumTraining;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class BasicWebdriverMethods {

    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "D:\\Java - Selenium\\Dependencies\\chromedriver_win32  v100\\chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput", "true");

        WebDriver driver = new ChromeDriver();


        driver.get("https://www.saucedemo.com");
        driver.manage().window().maximize();
        System.out.println(driver.getWindowHandle());

        driver.navigate().to("https://www.sugarcrm.com/");
        String windowHandle = driver.getWindowHandle();
        System.out.println(windowHandle);


        driver.close();


    }


}
