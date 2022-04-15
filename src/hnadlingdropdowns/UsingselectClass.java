package hnadlingdropdowns;



import java.awt.List;
import java.nio.file.WatchEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsingselectClass {
	
	
	public void singleSelectDropdownList() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Driver Java Selenium\\chromedriver_win32\\chromedriver version 97.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/drop-down");
		WebElement mounth =driver.findElement(By.xpath("//select[@class=\"single-select\"]"));
		System.out.println(mounth.getText());
		Select select = new Select(mounth);
		boolean check=select.isMultiple();
		System.out.println(check);
		
		select.selectByVisibleText("May");
		Thread.sleep(10000);
		//select.deselectByVisibleText("May");//UnsupportedOperationException
		
	}
	public void multiSelectDropdownList() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","F:\\Driver Java Selenium\\chromedriver_win32\\chromedriver version 97.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testingshastra.com/assignments/drop-down");
		WebElement multiselect =driver.findElement(By.xpath("//select[@class=\"multi-select\"]"));
		Select select=new Select(multiselect);
		//boolean check= 	select.isMultiple();
		//System.out.println(check);

		select.selectByVisibleText("Core Java");
		select.selectByVisibleText("Selenium Grid");
		Thread.sleep(5000);
		//select.deselectAll();
		
		WebElement first=select.getFirstSelectedOption();
		System.out.println(first.getText());
		
	}
	//click , click with xpath  karna he if select class not there
		public void withoutUsingSelectClass() {
			System.setProperty("webdriver.chrome.driver","F:\\Driver Java Selenium\\chromedriver_win32\\chromedriver version 97.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://testingshastra.com/assignments/drop-down");
			driver.findElement(By.xpath("//select[@class=\"single-select\"]")).click();
            driver.findElement(By.xpath("(//option)[7]")).click();
           


		}
	
		
		
		
		
 
	
	
public static void main(String[] args) throws InterruptedException {
	new UsingselectClass().withoutUsingSelectClass();
}
}



