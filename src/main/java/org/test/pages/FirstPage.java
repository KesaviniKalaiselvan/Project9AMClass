package org.test.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.baseclass.BaseClass;

public class FirstPage extends BaseClass {
	
	public FirstPage() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	private WebElement closebtn;
	
	@FindBy(name="q")
	private WebElement searchbox;
	
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	private WebElement searchbtn;

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public WebElement getSearchbox() {
		return searchbox;
	}

	public WebElement getClosebtn() {
		return closebtn;
	}

}
