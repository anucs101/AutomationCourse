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
	
	public void getTitleCommands()
	{
	String actualTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";			
	String title = driver.getTitle();
	if(title.equals(actualTitle))
	{
		System.out.println("titles are equal");
	}
	else
	{
		System.out.println("titles are not equal");
	}
	
	
	}
	
	public void getUrlCommand()
	{
		String url = driver.getCurrentUrl();
		String actualUrl = "https://www.amazon.in/";
		if(url.equals(actualUrl))
		{
			System.out.println("urls are equal");
		}
		else
		{
			System.out.println("urls are not equal");
		}
	}
	
	public void getpageSourceCommand()
	{
	String pageSource =	driver.getPageSource();
	String actualPageSource = "<!-- sp:feature:csm:head-open-part1 -->";
	if(pageSource.contains(actualPageSource))
	{
		System.out.println("page sources are equal");
	}
	else
	{
		System.out.println("page sources are not equal");
	}
	}
	
	public void quit()
	{
		driver.quit();
	}
	
	public void afterTest()
	{
		driver.close();
	}
	
	public void navigateCommands()
	{
		driver.navigate().to("https://www.flipkart.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	  public static void main(String[] args) 

	{ Base base = new Base();
	  base.initializeBrowser(); 
	  base.getTitleCommands();
	  base.getUrlCommand();
	  base.getpageSourceCommand();
	  base.navigateCommands();
	  base.afterTest();
	  //base.quit(); }
	}
}

