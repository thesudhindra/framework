package com.Regression;

import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class VerifyBrokenImages extends baseClass {
    public static void main(String[] args) throws Exception {
        getBrowserInstance("chrome");

        driver.navigate().to("https://www.amazon.in");
        int cnt=0;
        int temp=0;
        List<WebElement> allImages = driver.findElements(By.tagName("img"));

        for(WebElement element:allImages)
        {

            cnt++;

            String imageUrl = element.getAttribute("src");
            URL url = new URL(imageUrl);
            URLConnection urlConnection = url.openConnection();
            HttpURLConnection connection = (HttpURLConnection) urlConnection;
            int statusCode = connection.getResponseCode();
            if(statusCode!=200 && statusCode != 204)
            {
                System.out.println(statusCode +" : "+imageUrl);
                temp++;
            }

        }

        System.out.println(cnt);
        if(temp==0)
            System.out.println("No Broken Images found");
        driver.close();

    }
}
