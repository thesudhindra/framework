package com.Regression;


import com.orangeHrm.baseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Objects;

public class VerifyBrokenLinks extends baseClass {

    public static void main(String[] args) throws Exception {

        getBrowserInstance("chrome");
        driver.navigate().to("https://www.amazon.in");
        List<WebElement> allHyperlinks = driver.findElements(By.tagName("a"));
        int cnt=0;
        for(WebElement links: allHyperlinks)
        {
            String validUrls = links.getAttribute("href");
            if (Objects.nonNull(validUrls) && validUrls.startsWith("http"))
            {
                cnt++;
                //System.out.println("URL: "+validUrls);

                URL url = new URL(validUrls);
                //System.out.println(url);
                URLConnection urlConnection = url.openConnection();
                HttpURLConnection connection  = (HttpURLConnection)urlConnection;
                connection.connect();
                 int statusCode = connection.getResponseCode();
            if(statusCode!=200 && statusCode!=204)
            {
                System.out.println(statusCode + "  : "+validUrls);
            }
            }

        }

        System.out.println("Count: "+ cnt);
        driver.quit();

    }
}
