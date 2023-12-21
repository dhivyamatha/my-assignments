package week4day1;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnframe {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.switchTo().frame("iframeResult");
	   driver.findElement(By.xpath("//button[text()='Try it']")).click();
	  Alert a1= driver.switchTo().alert();
	  a1.accept();
   String text = driver.findElement(By.id("demo")).getText();
	   System.out.println(text);
	    
	    
	    
	    
	    
	}

}
