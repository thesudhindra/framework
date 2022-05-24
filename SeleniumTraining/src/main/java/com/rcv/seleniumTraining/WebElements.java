package com.rcv.seleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver","D:\\Java - Selenium\\Dependencies\\chromedriver_win32  v100\\chromedriver.exe");
        System.setProperty("webdriver.chrome.silentOutput","true");
        WebDriver driver = new ChromeDriver();



        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        driver.findElement(By.cssSelector("input.search-keyword")).sendKeys("Brocolli ");
        //driver.findElement(By.cssSelector("input.search-keyword")).clear();
        System.out.println(driver.findElement(By.cssSelector("input.search-keyword")).getAttribute("class"));
        System.out.println(driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button")).getCssValue("font-family"));

        System.out.println(driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button")).getLocation());
        System.out.println(driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button")).getSize());
        System.out.println(driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button")).getTagName());
        System.out.println(driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button")).getText());
        System.out.println("===================== Boolean Outputs ========================");
        System.out.println(driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//div[@class='products']//div[1]//div[3]//button")).isSelected());


        driver.close();



    }
}
