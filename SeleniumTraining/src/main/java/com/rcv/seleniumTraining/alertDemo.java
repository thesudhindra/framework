package com.rcv.seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(" Sudhindra ");
        Thread.sleep(1500);
        WebElement alertButton = driver.findElement(By.cssSelector("input#alertbtn"));
        alertButton.click();
        Thread.sleep(1500);
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//input[@id='name']")).sendKeys(" Sudhindra ");
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        Thread.sleep(1500);
        System.out.println( driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();



    }
}
