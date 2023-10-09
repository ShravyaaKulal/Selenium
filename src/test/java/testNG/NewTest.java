package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
  @Test
  public void TestClass () {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(driver.getTitle(), "Google Page");
	//driver.navigate().to("https://www.google.com/");
			WebElement srcBox = driver.findElement(By.className("gLFyf"));
			srcBox.sendKeys("Cucumber Tutorial");
			srcBox.submit();
			softAssert.assertEquals(driver.getTitle(), "Cucumber Tutorial");
			driver.close();
			//To check the failed assert
			softAssert.assertAll();
			//if we dont want to run any test
			//@Test (enabled= false)
	  }
  
}