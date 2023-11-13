package com.doctube.pages;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.api.validation.LinkValidation;
import com.dataprovider.Dataprovider;

public class TestUrl extends LinkValidation{
	@Test(dataProvider = "webUrl",dataProviderClass = Dataprovider.class)
	public void fun(String url) throws IOException {
		//System.out.println(validateLink("https://doctube.com/watch/%E0%A4%95%E0%A4%AE-%E0%A4%89%E0%A4%AE-%E0%A4%B0-%E0%A4%AE-%E0%A4%B9-%E0%A4%B0%E0%A4%B9-%E0%A4%B9-%E0%A4%85%E0%A4%A8-%E0%A4%AF%E0%A4%AE-%E0%A4%A4-%E0%A4%AE-%E0%A4%B9%E0%A4%B5-%E0%A4%B0-%E0%A4%9C-%E0%A4%A8-%E0%A4%95-%E0%A4%AF-%E0%A4%95%E0%A4%B9%E0%A4%A4-%E0%A4%B9-%E0%A4%8F%E0%A4%95-%E0%A4%B8%E0%A4%AA%E0%A4%B0-%E0%A4%9F_YVIZIOrbXwOu4j3.html"));
		Set<String> ss=new HashSet<String>();
		ss.add("sita ram");
		System.out.println(url);
		
	}
}
