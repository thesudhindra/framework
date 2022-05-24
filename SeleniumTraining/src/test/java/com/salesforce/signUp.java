package com.salesforce;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signUp {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input[type='text'][name=UserFirstName]")).sendKeys("Sudhindra");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Deshpande");
	}

}
