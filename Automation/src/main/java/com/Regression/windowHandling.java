package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.sql.SQLOutput;
import java.util.Set;

public class windowHandling extends baseClass{

	public static void main(String[] args) throws Exception {

		getBrowserInstance("chrome");

		driver.navigate().to("https://www.google.co.in/");

		driver.findElement(By.cssSelector("input[class='gLFyf gsfi']")).sendKeys("amazon login" + Keys.ENTER);
		driver.findElement(By.xpath("//a[@href='https://www.amazon.in/your-account']//h3")).click();

		WebElement amazonLoginLink = driver.findElement(By.xpath("//h2[contains(text(),'Login')]"));

		if(amazonLoginLink.isDisplayed()) {
			amazonLoginLink.click();
			System.out.println("Successfully able to validate");
		}
		else
		{
			throw new Exception("Unable to validate the locator, please try another");
		}

		String parentWindowId = driver.getWindowHandle();
		System.out.println("pid: " + parentWindowId);


		//String keys = Keys.chord(Keys.SHIFT,Keys.ENTER); opened link in another window tab
		driver.findElement(By.linkText("Conditions of Use")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));

		String childWindowId = driver.getWindowHandle();
		System.out.println("cid: "+ childWindowId);

		Set<String> totalWindowIds = driver.getWindowHandles();


		for(String windowId:totalWindowIds)
		{

			if(!windowId.equals(parentWindowId))
			{
				driver.switchTo().window(windowId);

				if(driver.getTitle().contains("Conditions of Use"))
				{
					System.out.println("Successfully moved to child window tab " + driver.getTitle());
					//driver.close();
				}
				else
				{
					throw new Exception ("Invalid Tab..Please try again");
				}

			}

		}
		driver.switchTo().window(parentWindowId);
		System.out.println("Back to parent window, the title of parent is "+ driver.getTitle());
		//driver.quit();

	}

}
