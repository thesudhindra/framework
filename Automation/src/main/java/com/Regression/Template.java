package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;

public class Template extends baseClass {
    public static void main(String[] args) throws Exception {
        getBrowserInstance("chrome");

        driver.navigate().to("https://www.selenium.dev/downloads/");
        //driver.findElement(By.xpath("//a[normalize-space()='4.1.4']")).click();
        System.out.println(driver.getTitle());
        //driver.quit();

    }
}
