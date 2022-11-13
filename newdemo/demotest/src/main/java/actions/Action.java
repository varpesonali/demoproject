package actions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestBase.TestBase;

public class Action extends TestBase {
	
	public void click(WebDriver driver, WebElement ele) {

		Actions act = new Actions(driver);
		act.moveToElement(ele).click().build().perform();}
	
	
	
	public boolean selectByIndex(WebElement element, int index) {
		boolean flag = false;
		try {
			Select s = new Select(element);
			s.selectByIndex(index);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Option selected by Index");
			} else {
				System.out.println("Option not selected by Index");
			}
		}
	}
	public void implicitWait(WebDriver driver, int timeOut) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);}
	
	
		public void explicitWait(WebDriver driver, WebElement element, int timeOut ) {
			WebDriverWait wait = new WebDriverWait(driver,timeOut);
			wait.until(ExpectedConditions.visibilityOf(element));}
		
		
		
		
		public static void takess(String name)  {
			TakesScreenshot ts= ((TakesScreenshot)driver);
			 File src=ts.getScreenshotAs(OutputType.FILE);
			 
			String path="C:\\Users\\ANUP\\eclipse-workspace\\demotest\\screenshot\\";
			File des = new File(path+name+".png");
			try {
				FileHandler.copy(src, des);
			} catch (IOException e) {
				System.out.println("file not found");
				e.printStackTrace();
			}
		}

	}

