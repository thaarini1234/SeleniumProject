package com.picnic.mavensel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
@Test


	
	public  void orange() throws InterruptedException
	{
		
		 WebDriverManager.chromedriver().setup();
		//System.setProperty(""webdriver.chrome.driver","C:\\Users\\thaarinid\\eclipse-workspace_selenium\\SeleniumProject\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        
        driver.get("https://www.saucedemo.com/ ");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user"); 
        Thread.sleep(3000);
         
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(3000);
       
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(3000);
        
        WebElement validation = driver.findElement(By.xpath("//div[@id='']"));
        boolean x= validation.isDisplayed();
        System.out.println("Swaglab is validated:"+ x);
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@id='checkout']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Thaarini");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Doraiswami");
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("600101");
        Thread.sleep(3000);
        
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)","");
        
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
        jse1.executeScript("window.scrollBy(0,250)","");
        
        driver.findElement(By.xpath("//button[@id='finish']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@id='back-to-products']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
        Thread.sleep(3000);
        
        
     	
	}

}
