package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class uploadImage extends baseClass {

    public static void main(String[] args) throws Exception {

        getBrowserInstance("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        Robot r = new Robot();
        driver.navigate().to("https://www.remove.bg/");
        Thread.sleep(2000);
       // driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg']")).click();
        Thread.sleep(2000);
        String img = "Downloads\\20220409_131528.jpg";
        StringSelection ss = new StringSelection(img);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);

        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);



    }
}
