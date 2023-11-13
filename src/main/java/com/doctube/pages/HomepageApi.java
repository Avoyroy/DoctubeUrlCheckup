package com.doctube.pages;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.api.validation.LinkValidation;
import com.dataprovider.Dataprovider;
import com.doctube.Utility.ExcelLibrary;
import com.doctube.Utility.LaunchApp;
import com.invalidData.InvalidUrlCollection;

public class HomepageApi extends LaunchApp {

	// WebDriver driver=null;
	// LaunchApp la=new LaunchApp();
	ExcelLibrary exobj = new ExcelLibrary();

	@Test(dataProvider = "webUrl", dataProviderClass = Dataprovider.class)
	public void homeLink(String urls) throws IOException {
		launchBrowser(urls);
		LinkValidation obj = new LinkValidation();
		InvalidUrlCollection invalidUrl = new InvalidUrlCollection();

		List<WebElement> rawLink = driver.findElements(By.tagName("a"));
		Set<String> uniqueLink = new HashSet<String>();

		for (WebElement validLink : rawLink) {
			uniqueLink.add(validLink.getAttribute("href"));
		}
		int i = 0;
		for (String url : uniqueLink) {
			if (!url.contains("javascript:void(0)")) {

				if (obj.validateLink(url)) {
					System.out.println("pass");
				} else {
					exobj.setCellData("BrokenUrl", i, 0, url);
					i++;
				}

			}
		}

		tearDown();

	}
}
