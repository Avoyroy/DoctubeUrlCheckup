/**
 * 
 */
package com.api.validation;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Test
 *
 */
public class LinkValidation {
	
	public boolean validateLink(String urls) throws IOException {
		
		URL url=new URL(urls);
		//url.toURI();
		HttpURLConnection conn=null;
		try {
			conn = (HttpURLConnection) url.openConnection();
			conn.connect();
			if(conn.getResponseCode()>=300)
				return false;
			else
				return true;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			conn.disconnect();
		}
		return false;
	
	}
}
