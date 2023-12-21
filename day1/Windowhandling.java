package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	   
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    
	    driver.get("https://www.irctctourism.com/");
	    
	    driver.findElement(By.xpath("//span[text()='Flights']")).click();
	    
	    Set <String> windowHandles=driver.getWindowHandles();
	    
	    List<String>link = new ArrayList<String>(windowHandles);
	    driver.switchTo().window(link.get(1));
	    System.out.println(windowHandles+":"+driver.getTitle());
	    driver.switchTo().window(link.get(0));
	    driver.close();
	    
	    
	    
	    
	    
	    
	    
	    
	  //  chromeOptions.op= new ChromeOptions;
	    
	    
	  //  By.xpadriver.findElement( th("")).click();
	}

}
