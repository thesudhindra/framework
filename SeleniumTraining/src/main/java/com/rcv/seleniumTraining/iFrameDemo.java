package com.rcv.seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class iFrameDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://chercher.tech/practice/frames");
        driver.manage().window().maximize();
        Thread.sleep(1500);

        System.out.println("======================= Total Frames & Names=======================");

        List<WebElement> allIFrames = driver.findElements(By.xpath("//iframe"));
        System.out.println(allIFrames.size());
        for(WebElement i : allIFrames)
        {
            System.out.println(i.getAttribute("id"));
        }
        System.out.println("======================= Playing with Iframes=======================");

        WebElement iframe1= driver.findElement(By.id("frame1"));
        driver.switchTo().frame(iframe1);
        System.out.println("In frame");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Test");

        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame2']")));
        //WebElement dropdown = driver.findElement(By.xpath("//select[@id=\"animals\"]"));
        Select selectdropdown = new Select(driver.findElement(By.xpath("//select[@id='animals']")));
        selectdropdown.selectByIndex(2);
        System.out.println(selectdropdown.getFirstSelectedOption().getText());

        driver.switchTo().parentFrame();
        System.out.println(driver.getTitle());

        Thread.sleep(1500);
        driver.switchTo().frame(iframe1);
        driver.switchTo().frame(driver.findElement(By.id("frame3")));
        driver.findElement(By.cssSelector("input#a")).click();
        System.out.println(driver.findElement(By.cssSelector("input#a")).isSelected());;


        driver.switchTo().parentFrame();
        driver.quit();

    }
}
