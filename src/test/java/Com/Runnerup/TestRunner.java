package Com.Runnerup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class TestRunner {
	
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Eclips\\Selenium_project\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Vinothkumar0172");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Muthu@0172");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		WebElement element = driver.findElement(By.xpath("//select[@id='location']"));
		
		Select s= new  Select(element);
		
		s.selectByIndex(6);
		
		WebElement element2 = driver.findElement(By.xpath("//select[@id='hotels']"));
		
		Select s1 = new Select(element2);
		
		s1.selectByIndex(2);
		
		WebElement element3 = driver.findElement(By.xpath("//select[@name='room_type']"));
		
		Select s2 = new Select(element3);
		
		s2.selectByIndex(2);
		
	    WebElement element4 = driver.findElement(By.xpath("//select[@name='room_nos']"));
	    
	    Select s3 = new Select(element4);
	    
	    s3.selectByIndex(5);
	    
	    WebElement element5 = driver.findElement(By.xpath("//select[@name='adult_room']"));
		
	    Select s4 = new Select(element5);
	    
	    s4.selectByIndex(4);
	    
	    WebElement element6 = driver.findElement(By.xpath("//select[@name='child_room']"));
	    
	    Select s5 = new Select(element6);
	    
	    s5.selectByIndex(3);
	    
	    
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    
	  
	    driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
	    
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@name= 'first_name']")).sendKeys("Vinoth");
		
		driver.findElement(By.xpath("//input[@name= 'last_name']")).sendKeys("Kumar");
		
		driver.findElement(By.xpath("//textarea[@name= 'address']")).sendKeys("Rajanagaram");
		
		driver.findElement(By.xpath("//input[@name= 'cc_num']")).sendKeys("1472521445631475");
		
		
		WebElement element7 = driver.findElement(By.xpath("//select[@name= 'cc_type']"));
		
		Select s6 = new Select(element7);
		
	    s6.selectByIndex(2);
	    
	    Thread.sleep(3000);
		
		WebElement element8 = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		
		
		Select s7 = new Select(element8);
		
		Thread.sleep(3000);
		
		s7.selectByIndex(5);
		
		WebElement element9 = driver.findElement(By.xpath("//select[@name= 'cc_exp_year']"));
		
		Select s8 = new Select(element9);
		
	    s8.selectByIndex(12);
		
		driver.findElement(By.xpath("//input[@name= 'cc_cvv']")).sendKeys("5623");
		
		driver.findElement(By.xpath("//input[@type= 'button']")).click();
		
		Thread.sleep(10000);
		
		driver.findElement(By.xpath("//input[@value='My Itinerary']")).click();
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.xpath("//input[@value='Logout']")).click();
		
		TakesScreenshot s10 = (TakesScreenshot) driver;
		
		File screenshotAs = s10.getScreenshotAs(OutputType.FILE);
		
		File f = new File("C:\\Eclips\\Selenium_project\\Screenshot\\adactin.png");
		
		FileHandler.copy(screenshotAs,f);
		
		driver.close();
				
	} 

	
	

}
