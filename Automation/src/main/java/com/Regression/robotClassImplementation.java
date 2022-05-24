package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class robotClassImplementation extends baseClass {

    public static void main(String[] args) throws Exception {
        getBrowserInstance("chrome");
        driver.navigate().to("https://www.amazon.in");
        WebElement mobileMenu = driver.findElement(By.linkText("Mobiles"));
        Actions action = new Actions(driver);
        action.contextClick(mobileMenu).build().perform();

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
