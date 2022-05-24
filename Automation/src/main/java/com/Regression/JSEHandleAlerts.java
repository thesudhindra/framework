package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JSEHandleAlerts extends baseClass {

    public static void main(String[] args) throws Exception {
        getBrowserInstance("chrome");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='Admin'",driver.findElement(By.xpath("//input[@id='txtUsername']")));
        js.executeScript("arguments[0].value='admin123'",driver.findElement(By.cssSelector("input#txtPassword")));

        //.sendKeys("admin123");
       // driver.findElement(By.id("btnLogin")).click();

          //js.executeScript("alert('This is automated alert created by Suhdhindra')");
         // js.executeScript("confirm('This is automated confirmation alert created by Sudhindra ')");
        js.executeScript("prompt('This is automated prompt alert created by Sudhindra')");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(3000);
        driver.switchTo().alert().sendKeys("Accepted");
        Thread.sleep(5000);
        System.out.println(driver.switchTo().alert().getText());

        driver.switchTo().alert().accept();

        //driver.switchTo().alert().dismiss();
        //driver.close();
    }
}
