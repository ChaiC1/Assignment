package basic;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;



public class Ass1 {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();  //Maximise the window
	driver.get("https://www.ebay.com");
	driver.findElement(By.xpath("//i[@class='gh-sprRetina'][@id='gh-shop-ei']")).click();
	
	driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Cell-Phones-Smart-Watches-Accessories/15032/bn_1865441'][@class='scnd']")).click();
    try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    driver.findElement(By.xpath("//*[text()='Cell Phones & Smartphones'][@class='b-textlink b-textlink--parent']")).click();
    driver.findElement(By.xpath("//button[@data-marko='{\"onclick\":\"handleSeeAllBtn s0-27-9-0-1[0]-0-1[0]-0 false\"}']")).click();
    try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   
    WebElement modalContainer=driver.findElement(By.xpath("//div[@class='x-overlay__container']"));
    WebElement modalAcceptButton=modalContainer.findElement(By.xpath("//div[@data-aspecttitle='aspect-Screen%20Size']"));
    modalAcceptButton.click();
    try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

   WebElement modalAcceptButton1=modalContainer.findElement(By.xpath("//span[text()='4.0 - 4.4 in']"));
   modalAcceptButton1.click();
   WebElement modalAcceptButton2=modalContainer.findElement(By.xpath("//div[@data-aspecttitle='price']"));
   modalAcceptButton2.click();
   try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   WebElement modalAcceptButton3=modalContainer.findElement(By.xpath("//input[@aria-label='Minimum Value, US Dollar']"));
   modalAcceptButton3.sendKeys("100");
   WebElement modalAcceptButton4=modalContainer.findElement(By.xpath("//input[@aria-label='Maximum Value, US Dollar']"));
   modalAcceptButton4.sendKeys("200");
   
   WebElement modalAcceptButton5=modalContainer.findElement(By.xpath("//div[@data-aspecttitle='location']"));
   modalAcceptButton5.click();
   try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   WebElement modalAcceptButton6=modalContainer.findElement(By.xpath("//input[@value='Worldwide']"));
   modalAcceptButton6.click();
   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
   WebElement modalContainer1=driver.findElement(By.xpath("//div[@class='x-overlay-footer']"));
   WebElement modalAcceptButton7=modalContainer1.findElement(By.xpath("//button[@aria-label='Apply']"));
   JavascriptExecutor executor= (JavascriptExecutor) driver;
   executor.executeScript("argument[0].scrollIntoView(true);",modalAcceptButton7);
   modalAcceptButton7.click();
   
 driver.findElement(By.xpath("//button[@data-marko='{\"onclick\":\"toggle s0-27_1-9-0-1[0]-0-0-6-5-4[0]-flyout false\"}']")).click();
 WebElement Screensize =driver.findElement(By.xpath("//span[text()='Screen Size: 4.0 - 4.4 in']"));
 String s2= Screensize.getText();
 System.out.println(Screensize);

 String s1= "Screen Size: 4.0 - 4.4 in";
 assertEquals(s2, s1);                    //Verifying
 
 WebElement Prize= driver.findElement(By.xpath("//span[text()='Price: $200.00 to $400.00']"));
 String p2=Prize.getText();
 System.out.println(Prize);
 String p1="Price: $200.00 to $400.00";
 assertEquals(p2, p1);                     //Verifying
 
 WebElement Location= driver.findElement(By.xpath("//span[text()='Item Location: Worldwide']"));
 String l2=Location.getText();
 System.out.println(Location);
 String l1="Price: $200.00 to $400.00";
 assertEquals(l2, l1);                  //Verifying   
    
	
	
	}

	
	
	
	
}