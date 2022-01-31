package org.test.fkt;

import org.test.baseclass.BaseClass;
import org.test.pages.FirstPage;
import org.testng.annotations.Test;

public class FlipkartTask extends BaseClass {
	
@Test
private void test1() throws InterruptedException {
	

		chromeLaunch();
		urlLaunch("https://www.flipkart.com/");
		windowMaximize();
		
		staticWait(2000);
		
		FirstPage f=new FirstPage();
		
		webElementClick(f.getClosebtn());
		sendKeys(f.getSearchbox(), "iphone");
		webElementClick(f.getSearchbtn());
		System.out.println("test1");
		System.out.println("test2");
		String text1 = getText(f.getIphone1());
		System.out.println(text1);
		
	}
	

}
