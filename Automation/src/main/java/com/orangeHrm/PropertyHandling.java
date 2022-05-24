package com.orangeHrm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyHandling
{
    Properties prop;
    String filepath = "D:\\selenium2022\\Automation\\config.properties";

    public PropertyHandling() throws Exception
    {
        FileInputStream input = new FileInputStream(filepath);
        prop = new Properties();
        prop.load(input);

    }

    public String getProperty(String key)
    {
        return prop.getProperty(key);
    }
}
