package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class IRCTC_windowHandlingTest extends baseClass {

    public static void main(String[] args) throws Exception {

        getBrowserInstance("chrome");

//        driver.navigate().to("https://www.google.co.in/");
//        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("IRCTC" + Keys.ENTER);
//        driver.findElement(By.xpath("//h3[contains(text(),'IRCTC Next Generation')]")).click();
//       Thread.sleep(1000);
//        driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//a[contains(text(),'HOTELS')]")).click();//sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));


        driver.get("https://www.hotel.irctctourism.com/hotel");

//        System.out.println("On IRCTC main page | Title: "+driver.getTitle()+" | Window Id: "+irctcWindow);
//        Thread.sleep(2000);
//
//        String irctcHotelWindow = driver.getWindowHandle();
//        System.out.println("On IRCTC Hotel page | Title: "+driver.getTitle()+" | Window Id: "+irctcHotelWindow);
//
//        Set<String> totalWindowIds = driver.getWindowHandles();
//        System.out.println(totalWindowIds.size());
//        for(String windowId:totalWindowIds)
//        {
//            if(!windowId.equals(irctcWindow))
//            {
//                driver.switchTo().window(windowId);


                Thread.sleep(1000);
                WebElement textField = driver.findElement(By.cssSelector("input#filterText"));
                Wait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
                wait.until(ExpectedConditions.visibilityOf(textField));
                textField.sendKeys("Viman Nagar");
        Thread.sleep(1000);

                driver.findElement(By.xpath("//div[@class='left_city']")).click();
                driver.findElement(By.xpath("//div[@class='form-in-custom3']//child::button")).click();
        Thread.sleep(2000);

                List<WebElement> totalRoomTypes = driver.findElements(By.xpath("//div[@class='delux-room-service-wrap']//span"));
                int lowPrice = 0;
        System.out.println(totalRoomTypes.size());
                for(int i=1; i<=totalRoomTypes.size();i++)
                {
                    String str = driver.findElement(By.xpath("//div[@class='delux-room-service-wrap']["+i+"]//span")).getText();
                    str= str.replace("/-","");
                    int temp = Integer.parseInt(str);
                    System.out.println(temp);
                    lowPrice = temp;
                    if(temp < lowPrice)
                        lowPrice= temp;

                }
                System.out.println("Lowest Price of Hotel Room Is: "+lowPrice);

//            }
//            else
//            {
//                throw new Exception("Invalid window, Please try again");
//            }
//        }
//
//            driver.switchTo().window(irctcWindow);
//        System.out.println("Back to parent window "+ driver.getTitle());


    }
}
