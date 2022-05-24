package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class DragAndDropInIframe extends baseClass {
    public static void main(String[] args) throws Exception {
        getBrowserInstance("chrome");

        driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
        driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//iframe")));
        Actions action = new Actions(driver);
        WebElement t = driver.findElement(By.cssSelector("div#trash"));
        List<WebElement> s = driver.findElements(By.xpath("//ul[@id='gallery']//li"));

        System.out.println(s.size());
        for(int i=1;i<=s.size();i++)
        {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //action.dragAndDrop(driver.findElement(By.xpath("//ul[@id='gallery']//li["+i+"]")),t).build().perform();
            action.clickAndHold(driver.findElement(By.xpath("//ul[@id='gallery']//li["+i+"]"))).release(t).build().perform();
            System.out.println(driver.findElement(By.xpath("//ul[@id='gallery']//li["+i+"]")));
        }




    }
}
