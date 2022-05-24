package com.OrangeHrm;
import com.orangeHrm.PropertyHandling;
import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRMLoginTest extends baseClass
{
    String userName=null;
    @Test
    public void AloginMethod() throws Exception {

        PropertyHandling propertyHandling = new PropertyHandling();
        getBrowserInstance(propertyHandling.getProperty("browser"));
        System.out.println("login method");

        driver.get(propertyHandling.getProperty("OrangeHrmURL"));
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(propertyHandling.getProperty("OrangeHrmUsername"));
        driver.findElement(By.cssSelector("input#txtPassword")).sendKeys(propertyHandling.getProperty("OrangeHrmPassword"));
        driver.findElement(By.id("btnLogin")).click();

    }
    @Test
    public void BverifyLogin() throws Exception {
        userName = driver.findElement(By.cssSelector("a#welcome")).getText();
        String dashboardStr = driver.findElement(By.xpath("//div[@class='head']//child::h1")).getText();

        if (userName.contains("Welcome") || dashboardStr.equals("Dashboard")) {
            System.out.println("Successfully able to login to " + driver.getTitle() + " | " + userName
                    + " to " + dashboardStr);
        }
        else {
            throw new Exception("Failed to login, Please try again");
        }
    }

    @Test
    public void ClogoutMethod() throws Exception
    {
        System.out.println("Logout Method");
        driver.findElement(By.xpath("//a[@id='welcome']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
        userName= userName.replace("Welcome ","");
        if(driver.findElement(By.xpath("//div[@id='logInPanelHeading']")).isDisplayed())
        {
            System.out.println(userName +" Logged out successfully");
        }
        else
        {
            throw new Exception("Failed to logout, Please try again");
        }


    }
    @AfterClass
    public void closeBrowser()
    {
        System.out.println("Closing browser instance");
        driver.quit();

    }

}
