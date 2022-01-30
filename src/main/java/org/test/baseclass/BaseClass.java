package org.test.baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	//1
	public static WebDriver chromeLaunch() {  
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		return driver;
	}
	
        //2
	public static WebDriver edgeLaunch() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		return driver;
	}
	
	//3
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	//4
	public static String getTilte() {
		String title = driver.getTitle();
		return title;
			}
	//5
	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
		}
	
	//6
	public static void quit() {
		driver.quit();
	}	
	//7
	public static void sendKeys(WebElement a,String data) {
           a.sendKeys(data);		
	}
	//8
	public static void webElementClick(WebElement b) {
		b.click();
	}
	//9
	public static String getText(WebElement c) {
		 String text = c.getText();
		 return text;
	}
	//10
	public static String getAttributeValue(WebElement d) {
		String attribute = d.getAttribute("value");
		return attribute;
	}
	//11
	public static String getAttributeInnerText(WebElement e) {
		String attribute = e.getAttribute("innerText");
		return attribute;
	}
	//12
	public static void moveToElement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();		
	}
	//13
	public static void dragAndDrop(WebElement src, WebElement des) {
		Actions a=new Actions(driver);
		a.dragAndDrop(src, des).perform();
	}
	//14
	public static void contextClick(WebElement e) {
		Actions a=new Actions(driver);
		a.contextClick().perform();		
	}
	//15
	public static void doubleClick(WebElement e) {
		Actions a=new Actions(driver);
		a.doubleClick(e).perform();
		}
	//16
	public static void actionClick(WebElement e) {
		Actions a=new Actions(driver);
		a.click(e).perform();
	}
	//17
	public static void release(WebElement from, WebElement to) {
		Actions a=new Actions(driver);
		a.clickAndHold(from).release(to).perform();
	}
	//18
	public static void simpleAlert() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	//19
	public void confirmAlert() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	//20
	public static void promptAlert(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
		a.accept();		
		}
	//21
	public static void selectByIndex(WebElement e, int index) {
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	//22
	public static void selectByValue(WebElement e, String value) {
		Select s=new Select(e);
		s.selectByValue(value);
	}
	//23
	public static void selectByVisibleText(WebElement e,String text) {
		Select s=new Select(e);
		s.selectByVisibleText(text);
	}
	//24
	public static boolean isMultiple(WebElement e) {
		Select s=new Select(e);
		boolean multiple = s.isMultiple();
		return multiple;
	}	
	//25
	public static void deselectByIndex(WebElement e, int index) {
		Select s=new Select(e);
		s.deselectByIndex(index);
	}
	//26
	public static void deselectByValue(WebElement e, String value) {
		Select s=new Select(e);
		s.deselectByValue(value);
	}
	//27
	public static void deselectByVisibleText(WebElement e, String text) {
		Select s=new Select(e);
		s.deselectByVisibleText(text);
	}
	//28
	public static void deselectAll(WebElement e) {
		Select s=new Select(e);
		s.deselectAll();
	}
	//29
	public static File screenShot(String text) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Selenium17dec\\Screenshot"+text+".png");
		FileUtils.copyFile(from, to);
		return to;
				
	}
	//30
	public static void javascriptSetAttribute(WebElement e, String text) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+text+"')", e);	
	}
	//31
	public static Object javascriptGetAttribute(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Object a=js.executeScript("return arguments[0].getAttribute('value')", e);
		return a;
	}
	//32
	public static void javascriptClick(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", e);
	}
	//33
	public static void scrollDown(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", e);
	}
	//34
	public static void ScrollUp(WebElement e) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", e);
	}
	//35
	public static void framesById(String idorname) {
		driver.switchTo().frame(idorname);
	
	}
	//36
	public static void framesByIndex(int index) {
		driver.switchTo().frame(index);
	}
	//37
	public static void framesByWebElement(WebElement e) {
		driver.switchTo().frame(e);
	}
	//38
	public static void quitFrame() {
		driver.switchTo().defaultContent();
	}
	//39
	public static String getParentWindow() {
		String id = driver.getWindowHandle();
		return id;
	}
	//40
	public static void getWindowHandles(int index) {
		Set<String> allid = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(allid);
		driver.switchTo().window(li.get(index));
	}
	//41
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	//42
	public static void navigateBack() {
		driver.navigate().back();
	}
	//43
	public static void navigateForward() {
		driver.navigate().forward();
	}
	//44
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	//45
	public static boolean isDisplayed(WebElement e) {
		boolean d = e.isDisplayed();
		return d;
	}
	//46
	public static boolean isEnabled(WebElement e) {
		boolean d = e.isEnabled();
		return d;
	}
	//47
	public static boolean isSelected(WebElement e) {
		boolean d = e.isSelected();
		return d;
	}
	//48
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	//49
	public static String getOptions(WebElement e) {
		Select s=new Select(e);
		List<WebElement> options = s.getOptions();
		for (WebElement Alloptions : options) {
		String text = Alloptions.getText();
		return text;
		}
		return null;
	}
	//50
	public static String getAllSelectedOptions(WebElement e) {
			Select s=new Select(e);
			List<WebElement> options = s.getAllSelectedOptions();
			for (WebElement selected : options) {
			String text = selected.getText();
			return text;
			}
			return null;
		}
	//51
	public static String getFirstSelectedOption(WebElement e) {
		Select s=new Select(e);
		WebElement option = s.getFirstSelectedOption();
		String text = option.getText();
		return text;
		}	
	//52
	public static void dynamicWait(long sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}
	//53
	public static void staticWait(long millisec) throws InterruptedException {
		Thread.sleep(millisec);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
