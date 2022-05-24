package com.rcv.seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.List;

public class PrintAllLinks {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/");
        driver.manage().window().maximize();


        List<WebElement> allLinks =driver.findElements(By.tagName("a"));

        System.out.println(allLinks.size());
        System.out.println("============================WITH FOR EACH LOOP=======================");
        for(WebElement i : allLinks)
        {
            //System.out.println(i.getText());
        }
        System.out.println("============================WITH FOR LOOP=======================");
        for(int i=0;i<allLinks.size();i++)
        {
            //System.out.println(allLinks.get(i).getText()+"-->"+allLinks.get(i).getAttribute("href"));

        }
        Thread.sleep(3000);

    }
}
