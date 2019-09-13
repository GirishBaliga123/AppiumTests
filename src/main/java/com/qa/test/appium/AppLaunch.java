package com.qa.test.appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppLaunch {

	public static void main(String[] args) {

		DesiredCapabilities caps = new DesiredCapabilities();
		//Set the Desired Capabilities
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "c084d3d1"); //Give Device ID of your mobile phone
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "9");
		caps.setCapability("appPackage", "com.android.vending");
		caps.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");
		caps.setCapability("noReset", "true");
		
		//Instantiate Appium Driver
		try {
				AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			
		} catch (MalformedURLException e) {
			System.out.println(e.getMessage());
		}
	}

}
