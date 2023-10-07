package SeleniumClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassTest {
	public static void main(String[]args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//driver.navigate().to("https://www.google.com/");
		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		srcBox.sendKeys("Selenium Maven");
		srcBox.sendKeys(Keys.ENTER);
		String strTitle= driver.getTitle();
		System.out.println("Title is ......"+strTitle);

		driver.navigate().back();
		System.out.println("URL is....."+driver.getCurrentUrl());
		System.out.println("Title after back is ......"+ driver.getTitle());
		driver.navigate().forward();
		driver.close();
              
	}

}
