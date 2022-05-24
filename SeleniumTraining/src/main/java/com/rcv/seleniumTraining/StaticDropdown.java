package com.rcv.seleniumTraining;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class StaticDropdown {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		driver.manage().window().maximize();
//		WebElement dropdown = driver.findElement(By.cssSelector("select#dropdown-class-example"));
//		Select select = new Select(dropdown);
//		select.selectByValue("option1");
//		String str= select.getFirstSelectedOption().getText();
//		System.out.println(str);
//
//		select.selectByVisibleText(str);
//		System.out.println(select.getFirstSelectedOption().getText());
//
//		select.selectByIndex(3);
//		System.out.println(select.getFirstSelectedOption().getText());
		WebElement multiselectDropdown = driver.findElement(By.xpath("//select[@id='second']"));
		Select select = new Select (multiselectDropdown);

		select.selectByValue("pizza");
		select.selectByIndex(1);

		//select.deselectAll();

		select.selectByVisibleText("Burger");

		//select.deselectByValue("donut");

		List <WebElement> ls = select.getAllSelectedOptions();

		System.out.println(ls.size());
		for(WebElement i:ls)
		{
			System.out.println(i.getText());
		}





		//driver.close();
	}
	

}
