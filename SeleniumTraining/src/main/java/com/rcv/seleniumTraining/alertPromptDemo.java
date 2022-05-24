package com.rcv.seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPromptDemo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
        driver.manage().window().maximize();

        driver.switchTo().frame(driver.findElement(By.id("iframeResult")));
        System.out.println("Frame name is --> "+driver.getTitle());
        driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("Sudhindra");
        driver.switchTo().alert().dismiss();
        System.out.println(driver.findElement(By.cssSelector("p[id='demo']")).getText());
        driver.close();

    }
}
