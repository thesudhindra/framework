package com.rcv.seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class CheckBoxDemo {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");
        driver.manage().window().maximize();

        WebElement tab = driver.findElement(By.xpath("//a[normalize-space()='Tab 2']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(tab);
        actions.perform();

        WebElement selectCheckbox = driver.findElement(By.xpath("//input[@value='Bike']"));
        System.out.println(selectCheckbox.getAttribute("value"));
        System.out.println(selectCheckbox.isSelected());
        Thread.sleep(2000);
        selectCheckbox.click();
        System.out.println(selectCheckbox.isSelected());
        Thread.sleep(1000);
        selectCheckbox.click();
        System.out.println(selectCheckbox.isSelected());


    }
}
