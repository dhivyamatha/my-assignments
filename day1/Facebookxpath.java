package com.training;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		
	  driver.manage().window().maximize();
	  Thread.sleep(4000);
		
	  driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("testleaf.2023@gmail.com");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("(//input[@id='pass'])")).sendKeys("Tuna321");
	  Thread.sleep(4000);
	  driver.findElement(By.xpath("(//button[@name='login'])")).click();
	  Thread.sleep(4000);
	  
	  driver.close();
		
	  
	}

}
