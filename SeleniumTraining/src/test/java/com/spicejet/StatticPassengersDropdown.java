package com.spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StatticPassengersDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://3.110.88.201/dropdownsPractise/#");
		driver.manage().window().maximize();
		
	driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='paxinfo']")).getText());
		Thread.sleep(2000);
		
	int i = 1;
	while(i<5)
		{
		driver.findElement(By.cssSelector("#hrefIncAdt")).click();
		i++;
		
		}
		
		driver.findElement(By.xpath("//input[contains(@id,'btnclosepaxoption')]")).click();

	}

}
