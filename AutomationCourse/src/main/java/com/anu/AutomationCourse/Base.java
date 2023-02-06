package com.anu.AutomationCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Base
{
	public WebDriver driver;

	
	public  void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\AutomationCourse\\src\\main\\java\\Resources\\chromedriver.exe");//driver initialization
		//if the browser is edge key will be - webdriver.edge.driver
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	public static void main(String[] args) 
	{
		Base base = new Base();
		base.initializeBrowser();
	}
	

}

