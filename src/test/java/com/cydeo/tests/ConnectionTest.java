package com.cydeo.tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class ConnectionTest {

    @Test
    public void connectionTest(){
        AndroidDriver driver;
        URL url;
        UiAutomator2Options caps=new UiAutomator2Options();
        try {
            url=new URL("http://192.168.178.72:4723/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
        driver=new AndroidDriver(url,caps);
        System.out.println("driver.getDeviceTime()---> "+driver.getDeviceTime());


    }

}
