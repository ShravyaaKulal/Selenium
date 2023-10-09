package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class LoginTest { 
	WebDriver driver;
	
	//@Parameters("browser")
	@BeforeMethod
	public void setup(String strBrowser) 
	{
		if(strBrowser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Browser Name....."+strBrowser);
			driver = new ChromeDriver();
		}
		else if(strBrowser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
	driver.manage().window().maximize();
		
	}

  @Test
  public void validLoginTest() 
  {
	  
	driver.get("https://the-internet.herokuapp.com/login");
		driver.findElement(By.id("username")).sendKeys("tomsmith");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.tagName("button")).click();
  }
  @AfterMethod
  public void teardown() {
	  //driver.close();
  }
}
