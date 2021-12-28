package com.mobile.mobiletest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class MobileTest {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();
//		capabilities.setCapability("BROWSER_NAME", "Android");
//		capabilities.setCapability(MobileCapabilityType.PLATFORM, Platform.ANDROID);
//		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
//		capabilities.setCapability("appPackage","com.android.calculator2");
//		capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
//		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "LMG710EMW0d32cb6b");
//		capabilities.setCapability(MobileCapabilityType.VERSION, "10");
		caps.setCapability("deviceName", "LMG710EMW0d32cb6b");
//		caps.setCapability("udid", "emulator-5554"); // DeviceId from "adb devices" command
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "10.0");
		caps.setCapability("skipUnlock", "true");
		caps.setCapability("appPackage", "com.isinolsun.app");
		caps.setCapability("appActivity", "com.isinolsun.app.activities.SplashActivity");
		caps.setCapability("noReset", "false");
		caps.setCapability("appPackage","com.google.android.calculator");
		caps.setCapability("appActivity","com.android.calculator2.Calculator");
		URL url = new URL("http://0.0.0.0:4723/wd/hub");// Appium Server Address
		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, caps);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//android.widget.Button[@text='7']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='3']")).click();
		driver.findElement(By.xpath("//android.widget.Button[@text='=']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
