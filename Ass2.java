package basic;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertSame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ass2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();  //Maximise the window
		
		driver.get("https://www.ebay.com");
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Macbook");
		driver.findElement(By.id("gh-cat-box")).click();
		//Value=58058

		WebElement Category=driver.findElement(By.id("gh-cat"));
		  Select ddrp=new Select(Category);
		  ddrp.selectByValue("58058");
		  
		  driver.findElement(By.id("gh-btn")).click();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String url ="https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2380057.m570.l1313&_nkw=Macbook&_sacat=58058";
		 // System.out.println(driver.getCurrentUrl());
		  String title= driver.getCurrentUrl();
		  System.out.println(title);
		  if(title.equals(url)) {
			  System.out.println("Page Loaded");
			  System.out.println("Current url:"+ title );
			  
		  }
		  else {
			  System.out.println("Page did not loaded");
			  
		  }
		 WebElement Macbook= driver.findElement(By.xpath("//li[@data-viewport='{\"trackableId\":\"01GVA87J5YP1T4JFMWQ9Z313C3\"}']"));
	System.out.println(Macbook.getText());
	String s=" MacBook";
	
		
		  if(Macbook.getText().contains(s) )   {
			  
			  System.out.println("Result Matches");
		  System.out.println("Result Matched"+ Macbook );
		  
	  }
	  else {
		  System.out.println("Result did not matched");
		  
	  }
		  


	}

}
