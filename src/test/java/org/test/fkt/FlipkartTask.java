package org.test.fkt;

import org.test.baseclass.BaseClass;
import org.test.pages.FirstPage;

public class FlipkartTask extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
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
		
		
		
		
	}
	

}
