package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseOperations extends baseClass {
    public static void main(String[] args) throws InterruptedException {

        getBrowserInstance("chrome");
        //driver.get("https://demo.guru99.com/test/drag_drop.html");
        //driver.get("https://www.amazon.in");
        driver.get("https://www.flipkart.com/");

        WebElement csLink = driver.findElement(By.linkText("Fashion"));
       WebElement mobileLink = driver.findElement(By.linkText("Home"));

       Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

        Actions action = new Actions(driver);

        action.moveToElement(mobileLink).moveToElement(driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"))).click(driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe']"))).perform();
        Thread.sleep(10000);



//        Thread.sleep(5000);
        //action.doubleClick(mobileLink).build().perform();
//        WebElement s =driver.findElement(By.xpath("//a[normalize-space()='BANK']"));
//        WebElement t = driver.findElement(By.xpath("//ol[@id='bank']//child::li[@class='placeholder']"));
//
//        action.dragAndDrop(s,t).build().perform();
//        System.out.println(driver.findElement(By.xpath("//li[contains(text(),'BANK')]")).getText());

    }
}
