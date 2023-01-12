package com.selenium.test.insureme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
	
    public static void main( String[] args ) throws InterruptedException
    {
    	
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\mahes\\Desktop\\STAR\\chromedriver.exe");
    	//System.setProperty("webdriver.chrome.driver","/home/ubuntu/chromedriver");
    	ChromeOptions chromeOptions = new ChromeOptions();
    	WebDriver driver = new ChromeDriver(chromeOptions);
    	System.out.println("Welcome to the Selenium Scripts");
    	
    	driver.get("http://13.127.141.134:8082/");
    	Thread.sleep(1000);
    	
    	driver.findElement(By.id("fname")).sendKeys("Mahesh");
    	Thread.sleep(1000);
    	
    	driver.findElement(By.id("lname")).sendKeys("Varma");
    	Thread.sleep(1000);
    	
    	driver.findElement(By.id("email")).sendKeys("devops.mvc@gmail.com");
    	Thread.sleep(1000);
    	
    	driver.findElement(By.id("contact")).sendKeys("6364600600");
    	Thread.sleep(1000);
    	
    	driver.findElement(By.id("submit")).click();
    	
    	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.quit();
    	
    	System.out.println("Testcase executed sucessfully");
    
    }
}
