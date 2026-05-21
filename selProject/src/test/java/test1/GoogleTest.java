package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleTest 
{
	
	@Test
	public void verifyTitle()
	{
      //System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver-win64\\chromedriver.exe");
        
      WebDriver driver=new ChromeDriver();
       
		System.out.println(" browser launched");
		
		//launch website
				driver.get("https://www.google.com/");
				
				//to maximize window size
				driver.manage().window().maximize();
				
				String title=driver.getTitle();
				
				System.out.println("google title ----> " +title);
				
				
	}


}
