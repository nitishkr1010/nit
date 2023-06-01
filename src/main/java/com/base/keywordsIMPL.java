package com.base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class keywordsIMPL implements keywords {
	static  WebDriver driver;
	static FileInputStream input;
	static Properties prop;
	
	public void open() {
		prop = new Properties();
	try {
		input = new FileInputStream("E:\\JAVA\\crm_hybdfrmewwork\\src\\main\\java\\com\\base\\objectrepository");
		prop.load(input);
	}catch(IOException ex) {
		ex.printStackTrace();
	}finally {
		if(input != null) {
			try {
				input.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	if(prop.getProperty("browsername").equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","C:\\cc\\chromedriver.exe");	
	driver = new ChromeDriver();
	}
	if(prop.getProperty("browsername").equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\cc\\geckodriver.exe");	
		driver = new FirefoxDriver();
		}
	}

	public void url(String url) {
	driver.get(url);		
	}
	public void input(String testdata, String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(testdata);	
	}
	public void click(String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();	
	}
	public void addtocart(String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();	
	}
	public void openthecart(String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();	
	}
	
	public void removethecart(String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();
		
	}
	public void checkoutthecart(String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).click();
		
	}
	public void inputdata(String testdata1, String objectname) {
		driver.findElement(By.xpath(prop.getProperty(objectname))).sendKeys(testdata1);		
	}
	public void quit() {
		driver.close();	
	}

}