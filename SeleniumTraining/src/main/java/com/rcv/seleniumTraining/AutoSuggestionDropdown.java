package com.rcv.seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class AutoSuggestionDropdown {
    public static void main(String [] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();


        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//li[@class= \"makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut\"]")).click();
        driver.findElement(By.xpath("//span[text()='From']")).click();
        Thread.sleep(1500);
        WebElement selectFrom = driver.findElement(By.xpath("//input[@placeholder='From']"));
        Thread.sleep(1500);
        selectFrom.sendKeys("Pune");
        Thread.sleep(1500);
        selectFrom.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1500);
        selectFrom.sendKeys(Keys.ENTER);


      }
    }
