/**
 * 
 */
package com.doctube.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * @author Test
 *
 */
public class LaunchApp {
	
	public static WebDriver driver=null;
	public void launchBrowser(String url) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("headless");
		driver=new ChromeDriver(opt);
		driver.navigate().to(url);
		driver.manage().window().fullscreen();
	}
	public void tearDown() {
		driver.close();
	}
}
