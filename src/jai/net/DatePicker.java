package jai.net;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\d.jayasurya\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker");
	WebElement date = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	Thread.sleep(2000);
	driver.switchTo().frame(date);
	Thread.sleep(2000);
	WebElement f = driver.findElement(By.id("datepicker"));
	Thread.sleep(2000);
	f.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	WebElement fb = driver.findElement(By.xpath("//a[text()='20']"));
	fb.click();
	
}
}
