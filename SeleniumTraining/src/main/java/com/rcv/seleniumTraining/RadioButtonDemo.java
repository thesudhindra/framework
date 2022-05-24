package com.rcv.seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.List;

public class RadioButtonDemo  {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.makemytrip.com/");
        driver.manage().window().maximize();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//li[@class= \"makeFlex hrtlCenter font10 makeRelative lhUser userLoggedOut\"]")).click();

        System.out.println("====================Get Total number of radio buttons on the page===================");
        List<WebElement> radioButtons = driver.findElements(By.xpath("//li[contains(@class,'font12 blackText latoBold wrapFilter')]"));
        System.out.println(radioButtons.size());
        for (WebElement i: radioButtons)
        {
            System.out.println(i.getAttribute("class"));
        }

        System.out.println("====================Select/deselect the radio button====================");
        WebElement selectRadioButton = driver.findElement(By.cssSelector("div[class='makeFlex hrtlCenter'] > ul[class*=\"specialFareNew\"] > li:nth-child(2)"));
        Thread.sleep(1500);
        selectRadioButton.click();
        Thread.sleep(1500);
        selectRadioButton.click();
        System.out.println(selectRadioButton.getAttribute("class"));


        //div[@class='makeFlex hrtlCenter']//child::li
        //li[contains(@class,"font12 blackText latoBold wrapFilter")]
    }
}
