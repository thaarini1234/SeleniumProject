package com.picnic.mavensel;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleSelinium {
	
		//public static void main(String[] args) throws InterruptedException
		//{
	@Test
	
	public void mavensel() throws InterruptedException
	{

			//System.setProperty("webdriver.chrome.driver","C:\\Users\\thaarinid\\eclipse-workspace_selenium\\SeleniumProject\\drivers\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\thaarinid\\eclipse-workspace_Selenium\\SeleniumProject\\drivers\\geckodriver.exe");
			WebDriverManager.chromedriver().setup();  
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			Thread.sleep(100);
			driver.findElement(By.name("Submit")).click();
			WebElement wel = driver.findElement(By.id("Welcome"));
			wel.click();
			
			//driver.get("https://google.com/");
	 		
			//driver.close();
		}
	
		
	}
	

