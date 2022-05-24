package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClick extends baseClass {
    public static void main(String[] args) {
        getBrowserInstance("chrome");

        driver.get("https://www.amazon.in");
        Actions action = new Actions(driver);
        WebElement amazonLink = driver.findElement(By.xpath("//a[@id='nav-cart']"));
        action.contextClick(amazonLink).build().perform();

    }

}
