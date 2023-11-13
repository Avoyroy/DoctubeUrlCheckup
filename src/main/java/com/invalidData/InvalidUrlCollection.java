/**
 * 
 */
package com.invalidData;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Test
 *
 */
public class InvalidUrlCollection {
	Set<String> brokenUrl=new HashSet<String>();
	public void validateUrl(String url) {
		brokenUrl.add(url);
	}
	public void trigerEmail() {
		
	}
}
