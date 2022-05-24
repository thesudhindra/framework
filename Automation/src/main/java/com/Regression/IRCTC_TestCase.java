package com.Regression;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;
import com.orangeHrm.baseClass;

public class IRCTC_TestCase extends baseClass {

	public static void main(String[] args) throws InterruptedException {
		
		getBrowserInstance("chrome");
		
		driver.navigate().to("https://www.google.co.in");
		WebElement searchBox = driver.findElement(By.cssSelector("input[title='Search']"));
		//driver.findElement(By.cssSelector("input[title='Search']")).sendKeys("IRCTC" + Keys.ENTER );
		searchBox.sendKeys("IRCTC" + Keys.ENTER);
		//searchBox.sendKeys(Keys.ENTER);
		
		driver.findElement(By.cssSelector("a[href='https://www.irctc.co.in/'] h3")).click();
		System.out.println(driver.getCurrentUrl() + "<--->" +driver.getTitle());
		
		//Thread.sleep(1000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement OkButton =driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='btn btn-primary']")));
		OkButton.click();
		System.out.println(OkButton.getText());
		
		
			
	
		driver.findElement(By.xpath("//button[contains(text(),'Search')]")).submit();
		WebElement errorMessage = driver.findElement(By.xpath("//div[starts-with(@class,'ui-toast-detail')]"));
		
		if(errorMessage.isDisplayed())
		{
			System.out.println(errorMessage.getText());  
		}
		
		
		
		
		

	}

}
