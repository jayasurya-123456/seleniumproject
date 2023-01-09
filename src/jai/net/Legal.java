package jai.net;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Legal {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\d.jayasurya\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://192.168.12.196:8080/omniapp/pages/login/loginapp.app");
		driver.findElement(By.id("oaloginform:userid")).sendKeys("arvind");
		driver.findElement(By.id("oaloginform:password")).sendKeys("system123#");
		driver.findElement(By.id("oaloginform:loginbtn")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.id("oaloginform:contloginbtn")).click();
		Thread.sleep(2000);
		WebElement fo = driver.findElement(By.xpath("//iframe[@id='iframe_Int3002']"));
		driver.switchTo().frame(fo);
		WebElement fg = driver.findElement(By.xpath("//span[text()='Select Process'][@mid='wlf:processlistopt']"));
		fg.click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@title='GTM']")).click();
		driver.switchTo().frame(fo);
		WebElement work = driver.findElement(By.id("wlf:Prefix"));
		work.click();
		
		work.sendKeys("GTM_WF-776");
		driver.findElement(By.id("wlf:cmdBtn")).click();
		driver.switchTo().defaultContent();
		WebElement lo = driver.findElement(By.xpath("//iframe[@id='iframe_Int42']"));
		driver.switchTo().frame(lo);
		Thread.sleep(2000);
		WebElement er = driver.findElement(By.xpath("//label[@id='wlf:pnlResult_0_pn']"));
		er.click();
		Set<String> window = driver.getWindowHandles();
		List<String> ly = new LinkedList<String>(window);
		driver.switchTo().window(ly.get(1));
		Thread.sleep(2000);
		WebElement lp = driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
		driver.switchTo().frame(lp);
		WebElement hj = driver.findElement(By.xpath("(//input[@type='text'])[10]"));
		hj.sendKeys("naveenm");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("(//textarea[@onmouseover='this.title=this.value'])[4]")).sendKeys("test execution");
		driver.findElement(By.xpath("//button[@id='Btn_Save']")).click();
		driver.findElement(By.xpath("//button[@data-bb-handler='ok']")).click();
	}

}
