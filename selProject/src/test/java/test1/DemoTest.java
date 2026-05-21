package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void launch()
	{
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver-win64\\chromedriver.exe");
        
      WebDriver driver=new ChromeDriver();
       
		System.out.println(" browser launched");
		
		//launch website
				driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
				
				//to maximize window size
				driver.manage().window().maximize();
				
				//to locate firstName textbox
				driver.findElement(By.id("input-firstname")).sendKeys("Prajkta");
				
				//to locate lastName textbox
				driver.findElement(By.name("lastname")).sendKeys("Desai");
	}

}
