/**
 * 
 */
package com.ip.tracker;


import java.net.InetAddress;
import java.net.UnknownHostException;

import org.testng.annotations.Test;

/**
 * @author Test
 *
 */
public class TestIp {
	@Test
	public void myIp() throws UnknownHostException {
		InetAddress ip= InetAddress.getLocalHost();
		System.out.println("my current ip address = "+ip.getHostAddress());
	}
}
