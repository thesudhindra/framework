package com.Regression;

import com.orangeHrm.baseClass;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;

public class switchTabs extends baseClass {
    public static void main(String[] args) throws InterruptedException {
        getBrowserInstance("chrome");

        driver.navigate().to("https://www.google.co.in/");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("IRCTC" + Keys.ENTER);
        driver.findElement(By.xpath("//h3[normalize-space()='IRCTC Next Generation eTicketing System']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();

        String parentWindow =driver.getWindowHandle();
        System.out.println(parentWindow);
        System.out.println(driver.getTitle());

        driver.findElement(By.xpath("//a[@aria-label='Menu Hotels. Website will be opened in new tab']")).click();

        Thread.sleep(5000);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        System.out.println(tabs.size());

        for(String wid :tabs)
        {
            if(wid!=parentWindow)
            {
                driver.switchTo().window(wid);
                System.out.println(driver.getWindowHandle());
                System.out.println(driver.getTitle());
            }
        }








    }
}
