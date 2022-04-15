package com.testingshastra;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.grid.Main;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.locators.RelativeLocator .*;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Set;

public class SeleniumDemo {

	public void testcase01() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Driver Java Selenium\\chromedriver_win32\\chromedriver version 97.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/");
		driver.findElement(By.xpath("//a[@href=\"/assignments\"]")).click();
		//driver.findElement(By.xpath("(//a[@href=\"/assignments/drag-and-drop\"])[1]")).click();
		//driver.findElement(By.xpath("(//a[@href=\"/assignments/drop-down\"])[1]")).click();
		driver.findElement(By.xpath("(//a[@href=\"/assignments/confirmation-alert\"])[1]")).click();
		driver.findElement(By.xpath("//button[@class=\"alert-btn\"]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Recent Placements')]")).click();
		driver.findElement(By.xpath("//button[@class=\\\"alert-btn\\\"]")).sendKeys( "harshal" , Keys.ENTER);
	
	
	  
		
		
		
		
		
		
		
		/**String v =driver.findElement(By.xpath("//input[@id=\"lname\"]")).getAttribute("value");
		System.out.println(v);
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).clear();
		driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("Harshal");
		Thread.sleep(5000);*/
		// driver.findElement(By.xpath("//input[@id=\"lname\"]")).sendKeys("Kadgale");
	    //driver.findElement(By.xpath("//span[@class=\"placeholderAlternative mobileNumber\"]")).click();
		//driver.findElement(By.xpath("//div[@class=\"desktop-shopLinks\"]/child::a/following-sibling::a/following-sibling::a//following-sibling::a")).click();
		//driver.findElement(By.xpath("//div[@class=\"Xb9hP\"]/child::input[@type=\"email\"]")).sendKeys("HarshalKadgale");
		//driver.findElement(By.xpath("//a[@href=\"/upload-pictures/start.sfly\"]")).click();
		//driver.findElement(By.xpath("//span[@class=\"signIn-label\"]")).click();
		//driver.findElement(By.xpath("//a[@href=\"https://www.shutterfly.com/shipping/\"]/child::span")).click();
       //driver.findElement(By.xpath("//a[@href=\"/shop/men\"]/parent::div")).click();

		
		//driver.findElement(By.xpath("//button[@class=\"VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-dgl2Hf ksBjEc lKxP2d FliLIb uRo0Xe TrZEUc t29vte\"]")).click();
		
		//driver.findElement(By.xpath("//a [@href=\"/personal-care\"] /parent ::div")).click();
		//driver.findElement(By.xpath("//div[@class=\"desktop-shopLinks\"]/child::a/following-sibling::a/following-sibling::a/following-sibling::a")).click();
		//driver.findElement(By.xpath("//div[@class=\"desktop-userIconsContainer\"]/child::span/following-sibling ::span")).click();
		
		//driver.findElement(By.xpath("//a[@href=\"/shop/men\"]/parent :: div")).click(); by relative Axeses
		//driver.findElement(By.xpath("//div[ inks\"]/a[@href=\"/shop/men\"]")).click(); //a [@href="/giftcard"]/ancestor:: div[@class="desktop-preHeaderContent desktop-showBanner"]
	   // driver.findElement(By.xpath("/html/body/a[2]")).click(); Absolute xpath
		//driver.findElement(By.className("desktop-searchBar")).sendKeys("mens sports wear");
		//driver.findElement(By.id("harshal2")).click();
		//driver.findElement(By.partialLinkText("goibibo")).click();
		//By by = By.id("harshal2");
		//driver.findElement(by).click();
		
		/*System.setProperty("webdriver.ie.driver", "F:\\Driver Java Selenium\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
        driver.get("https://www.myntra.com/");
		
		/**System.setProperty("webdriver.gecko.driver", "F:\\Driver Java Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.in");*/
        
        
	}

	public static void main (String[] args) throws InterruptedException  {
    new SeleniumDemo().testcase01();
	}
}

