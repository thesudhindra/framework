package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class robotClassCopyPasteKeyEvents extends baseClass {

    public static void main(String[] args) throws Exception {
        getBrowserInstance("chrome");
        driver.navigate().to("https://www.amazon.in");
        WebElement mobileMenu = driver.findElement(By.linkText("Mobiles"));

        Actions action = new Actions(driver);
        action.contextClick(mobileMenu).build().perform();

        Robot robot = new Robot();

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_DOWN);

        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        action.click(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))).build().perform();
       // driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Text");


        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);


        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseWheel(50);

    }
}
