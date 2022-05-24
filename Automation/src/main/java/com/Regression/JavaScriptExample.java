package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

public class JavaScriptExample extends baseClass {

    public static void main(String[] args) throws Exception {
        getBrowserInstance("chrome");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='Admin'",driver.findElement(By.xpath("//input[@id='txtUsername']")));
        js.executeScript("arguments[0].value='admin123'",driver.findElement(By.cssSelector("input#txtPassword")));

        //.sendKeys("admin123");
       // driver.findElement(By.id("btnLogin")).click();

        js.executeScript("arguments[0].click()",driver.findElement(By.id("btnLogin")));
        System.out.println(js.executeScript("return document.title"));
        System.out.println(js.executeScript("return document.URL"));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']//b")).click();
//        js.executeScript("window.scrollBy(0,2500)");
//        Thread.sleep(5000);
//        js.executeScript("window.scrollBy(0,-2000)");
//        Thread.sleep(5000);
//        js.executeScript("window.scrollBy(2500,0)");
          js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
          Thread.sleep(2000);
          js.executeScript("window.scrollBy(0,-2500)");
          //js.executeScript("alert('This is automated alert created by Suhdhindra')");
          js.executeScript("prompt('This is automated prompt alert created by Sudhindra')");
          //js.executeScript("confirm('This is automated confirmation alert created by Sudhindra ')");
        //driver.close();
    }
}
