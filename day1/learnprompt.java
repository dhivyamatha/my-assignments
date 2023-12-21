package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnprompt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
	    driver.get("https://leafground.com/alert.xhtml");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.findElement(By.xpath("//*[@id='j_idt88:j_idt104']")).click();
	    //driver.findElement(By.xpath("//span[text()='Show'])[5]")).click();
	    
	    
	    Alert prompt = driver.switchTo().alert();
	  
		   prompt.sendKeys("Testleaf");
		   Thread.sleep(3000);
		   
		   prompt.accept();
		   Thread.sleep(3000);
	    String Text= driver.findElement(By.id("confirm_result")).getText();
	    Thread.sleep(3000);
	    System.out.println("Text");
	    
	    Thread.sleep(3000);
	    driver.close();
	}

}
