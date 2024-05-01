package com.cydeo.tests;

import com.cydeo.utilities.MobileUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.net.URL;

public class EtsyNativeTestTask {
    @Test
    public void signInTest(){
        AndroidDriver driver;
        URL url;
        UiAutomator2Options options=new UiAutomator2Options();
        options.setApp("C:/Users/gayat/IdeaProjects/Live_Mobile_Labs/etsy.apk");
        options.setAppPackage("com.etsy.android");
        options.setAppActivity("com.etsy.android.ui.user.auth.SignInActivity");
        try {
            url=new URL("http://localhost:4723/");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        driver=new AndroidDriver(url,options);
        MobileUtils.wait(3);
       // driver.findElement(By.id("com.etsy.android:id/btn_sign_in_dialog")).click();

        driver.findElement(By.id("com.etsy.android:id/btn_sign_in_dialog")).click();
    }

}
