/**
 * 
 */
package com.dataprovider;

import org.testng.annotations.DataProvider;

/**
 * @author Test
 *
 */
public class Dataprovider {
	
	@DataProvider(name="webUrl")
	public String[][] webSiteUrls() {
		
		return new String[][] {
			{"https://www.doctube.com"},
			{"https://doctube.com/shorts"},
			{"https://doctube.com/explore"},
			{"https://doctube.com/channels"},
			{"https://doctube.com/dr-anurag-singh-thakur"},
			{"https://doctube.com/watch/%E0%A4%97%E0%A4%B0-%E0%A4%AD%E0%A4%A8-%E0%A4%B0-%E0%A4%A7%E0%A4%95-%E0%A4%94%E0%A4%B0-%E0%A4%87%E0%A4%B8%E0%A4%95-%E0%A4%AA-%E0%A4%B0%E0%A4%95-%E0%A4%B0-%E0%A4%95-%E0%A4%AC-%E0%A4%B0-%E0%A4%AE-%E0%A4%9C-%E0%A4%A8_b2lxss1RYaLINGm.html/list/4x62b5nDzkdYkaw"},
			{"https://doctube.com/tag/102"}
		};
	}
}
