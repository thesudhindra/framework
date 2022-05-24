package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IframeHandling extends baseClass {
    public static void main(String[] args) throws Exception {
        getBrowserInstance("chrome");

        driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
        // WebElement iframeElement = driver.findElement(By.xpath("//iframe[@id='ape_Gateway_right-2_desktop_iframe']"));
        driver.switchTo().frame("globalSqa");
        //driver.findElement(By.xpath("//div[@id='portfolio_filter']/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://www.globalsqa.com/training/selenium-online-training/']")).click();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        driver.switchTo().parentFrame();  //OR driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//li[@id='iFrame']")).getText());

        Thread.sleep(2000);
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        
    }

}
