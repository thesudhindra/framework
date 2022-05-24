package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class IRCTC_windowHandling extends baseClass {

    public static void main(String[] args) throws Exception {

        getBrowserInstance("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.google.co.in/");
        driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("IRCTC" + Keys.ENTER);
        driver.findElement(By.xpath("//h3[contains(text(),'IRCTC Next Generation')]")).click();

        driver.findElement(By.cssSelector("button[class='btn btn-primary']")).click();

        driver.findElement(By.xpath("//a[contains(text(),'HOTELS')]")).click();//sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
       ;
        String parentIrctcWindow = driver.getWindowHandle();
        System.out.println("On IRCTC main page | Title: " + driver.getTitle() + " | Window Id: " + parentIrctcWindow);

        String childIrctcHotel = driver.getWindowHandle();
        System.out.println("On Hotels page | Title: " + driver.getTitle() + " | Window Id: " + childIrctcHotel);

        Set<String> totalWindowIds = driver.getWindowHandles();
        System.out.println(totalWindowIds.size());


        for (String windowId : totalWindowIds) {


            System.out.println((!windowId.equals(parentIrctcWindow)));
            if (windowId != parentIrctcWindow) {
                driver.switchTo().window(windowId);

                if (driver.getTitle().equals("IRCTC Hotels")) {
                    System.out.println(driver.getTitle());
                    driver.findElement(By.cssSelector("input#filterText")).sendKeys("Viman Nagar");
                    Thread.sleep(5000);
                    WebElement dropdownValue = driver.findElement(By.xpath("//div[@class='left_city']"));
                    WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
                    wait.until(ExpectedConditions.visibilityOf(dropdownValue));

                    dropdownValue.click();

                    driver.findElement(By.xpath("//div[@class='form-in-custom3']//child::button")).click();

                    List<WebElement> totalRoomTypes = driver.findElements(By.xpath("//div[@class='delux-room-service-wrap']//span"));
                    System.out.println(totalRoomTypes.size());
                    int temp = 0;
                    ArrayList<Integer> values = new ArrayList<Integer>();

                    for (int i = 1; i <= totalRoomTypes.size(); i++) {
                        String str = driver.findElement(By.xpath("//div[@class='delux-room-service-wrap'][" + i + "]//span")).getText();
                        str = str.replace("/-", "");
                        temp = Integer.parseInt(str);

                        values.add(temp);
                        System.out.println(temp);

                    }

                    System.out.println("============= Lowest Price room cost is:  "+Collections.min(values)+" ======================");
                    driver.close();
                }
            } else {
                throw new Exception("Invalid window, Please try again");
            }
        }

        driver.switchTo().window(parentIrctcWindow);
        System.out.println("Back to parent window " + driver.getTitle());
        driver.quit();


    }
}
