package com.Regression;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.orangeHrm.baseClass;

public class selectClassDemo extends baseClass{


	public static void main(String[] args) throws Exception {
		
		getBrowserInstance("chrome");
		
		driver.navigate().to("https://www.amazon.in");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select select = new Select(dropdown);
		//select.selectByVisibleText("Books");
		//select.selectByIndex(10);
		//select.selectByValue("search-alias=stripbooks");
		
		List<WebElement> dropdownValues = select.getOptions();
		System.out.println(dropdownValues.size());

		List<String> listValues = new ArrayList<>();
		for(WebElement e : dropdownValues)
		{
//
			listValues.add(e.getText());
//			System.out.println(e.getText());
				if(e.getText().equalsIgnoreCase("Baby"))
				{
					//System.out.println("Successfully selected the value from dropdown, the value is: "+select.getFirstSelectedOption().getText());
					System.out.println(e.getText()+" is present");
					//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Chandramadhaviche Pradesh" + Keys.RETURN);
				}
//				else
//				{
//					//throw new Exception ("Fail to select the element from the dropdown");
//					throw new Exception("Invalid Entry, Please try with correct keyword");
//				}
		}
		System.out.println(listValues);

		if (listValues.contains("Boos"))
		{
			System.out.println("Books is present");
		}
		else
		{
			throw new Exception("Expected value not present in the  dropdown list");
		}
		
		driver.quit();
		
	}

}
