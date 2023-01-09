package jai.net;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker1 {
public static void main(String[] args) {
	String month="January";
	String year="2021";
	String day="30";
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\d.jayasurya\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/datepicker/#DropDown%20DatePicker");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement date = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(date);
	WebElement f = driver.findElement(By.id("datepicker"));
	f.click();
	while (true) {
		String text = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String text1 = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if (text.equals(month)&&text1.equals(year)) {
			break;
			
		} else {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		}
	}
	List<WebElement> web = driver.findElements(By.xpath("//table//tr//td//a"));
	for (int i = 0; i <web.size(); i++) {
		WebElement g = web.get(i);
		String u = g.getText();
		if (u.equals(day)) {
		web.get(i).click();
		}
	}
}
}


