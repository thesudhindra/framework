package com.rcv.seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelectDropdown {
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/dropdowns");

        List<WebElement> allOptions = driver.findElements(By.tagName("option"));
        System.out.println(allOptions.size());
        for(WebElement i : allOptions)
        {
            System.out.println(i.getText());
        }
        driver.close();
    }


}
