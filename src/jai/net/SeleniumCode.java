package jai.net;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumCode {
	public static Select s;
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\d.jayasurya\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("http://192.168.12.196:8080/omniapp/pages/login/loginapp.app");
driver.findElement(By.id("oaloginform:userid")).sendKeys("naveenm");
driver.findElement(By.id("oaloginform:password")).sendKeys("system123#");
driver.findElement(By.id("oaloginform:loginbtn")).click();
Thread.sleep(3000);
String paren = driver.getWindowHandle();
driver.findElement(By.id("oaloginform:contloginbtn")).click();
Thread.sleep(2000);
driver.switchTo().frame("queueList");
Thread.sleep(2000);
WebElement fr = driver.findElement(By.xpath("//label[@title='GTM Initiate']"));
Thread.sleep(2000);
fr.click();
driver.switchTo().defaultContent();
Thread.sleep(3000);
WebElement fo = driver.findElement(By.xpath("//iframe[@id='iframe_Int3002']"));
Thread.sleep(2000);
driver.switchTo().frame(fo);
Thread.sleep(2000);

WebElement fg = driver.findElement(By.xpath("(//span[@mid='wlf:processlistopt'])[2]"));
fg.click();
driver.switchTo().defaultContent();
driver.findElement(By.xpath("//span[@title='GTM']")).click();
WebElement ho = driver.findElement(By.xpath("//iframe[@id='iframe_Int42']"));
driver.switchTo().frame(ho);
Thread.sleep(2000);
driver.findElement(By.id("wlf:NewShow")).click();
Thread.sleep(2000);

Set<String> all = driver.getWindowHandles();
List<String> li = new LinkedList<String>();
li.addAll(all);
driver.switchTo().window(li.get(1));
Thread.sleep(3000);
WebElement fra = driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
driver.switchTo().frame(fra);
Thread.sleep(3000);
String ti = driver.getTitle();
System.out.println(ti);
String[] split = ti.split(":");
String str = split[1];
System.out.println(str);
WebElement drop = driver.findElement(By.name("Affected_Countries"));
Select s = new Select(drop);
s.selectByVisibleText("Japan");
WebElement z = driver.findElement(By.name("product_category"));
s= new Select(z);
s.selectByVisibleText("Trade");
WebElement z1 = driver.findElement(By.name("product_sub_category"));
s= new Select(z1);
s.selectByVisibleText("Open Account Finance");
WebElement z2 = driver.findElement(By.name("Affected_template"));
s= new Select(z2);
s.selectByVisibleText("Country Request");
WebElement z3 = driver.findElement(By.name("Requested_for"));
s= new Select(z3);
s.selectByVisibleText("New Template");
WebElement z4 = driver.findElement(By.name("Client_segment"));
s= new Select(z4);
s.selectByVisibleText("BB");
WebElement z5 = driver.findElement(By.name("language_form"));
s= new Select(z5);
s.selectByVisibleText("English Only");
WebElement z6 = driver.findElement(By.name("Rationale"));
s= new Select(z6);
s.selectByVisibleText("Product Enhancement");
driver.findElement(By.name("Explanation")).sendKeys("test comment complites");
driver.findElement(By.id("Template_name")).sendKeys("jaisurya");
driver.findElement(By.xpath("(//div[@class=' controls squaredTwo '])[3]")).click();
driver.findElement(By.xpath("//button[text()=' Submit']")).click();

Thread.sleep(2000);
String alttext = driver.findElement(By.xpath("//div[text()='Please attach Final (Clean) Template in word']")).getText();
System.out.println(alttext);
WebElement q = driver.findElement(By.xpath("//button[text()='OK']"));

q.click();

driver.switchTo().defaultContent();
WebElement l = driver.findElement(By.xpath("//div[@id='Documents']"));
l.click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//table//tr//td//label)[17]")).click();
Thread.sleep(2000);
Set<String> parent = driver.getWindowHandles();
List<String> zi = new LinkedList<String>();
zi.addAll(parent);
driver.switchTo().window(zi.get(2));
WebElement p = driver.findElement(By.id("browsefromPC"));
////p.click();
p.sendKeys("D:\\upload\\Document1.pdf");
Thread.sleep(5000);
WebElement o = driver.findElement(By.xpath("//select[@id='importForm:fileListDataTable:0:dtDocListMenu']"));
s= new Select(o);
s.selectByVisibleText("Final (Clean) Template in word");
driver.findElement(By.xpath("//label[@id='importForm:BtnOk']")).click();
Thread.sleep(3000);
driver.close();

Thread.sleep(6000);

driver.switchTo().window(li.get(1));
WebElement p1 = driver.findElement(By.xpath("//iframe[@id='ngformIframe']"));
driver.switchTo().frame(p1);

Thread.sleep(2000);
driver.findElement(By.xpath("//button[@id='Btn_Submit']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[text()='OK']")).click();

driver.close();
driver.switchTo().window(paren);
driver.switchTo().defaultContent();


WebElement pro = driver.findElement(By.xpath("//iframe[@id='iframe_Int3002']"));
driver.switchTo().frame(pro);

WebElement work = driver.findElement(By.id("wlf:Prefix"));
work.click();

work.sendKeys(str);
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
//////JavascriptExecutor js=(JavascriptExecutor)driver;
//driver.findElement(By.xpath(""))
//js.executeScript("arguments[0].scrollIntoView(false)", )

TakesScreenshot t =  (TakesScreenshot)driver;
File src = t.getScreenshotAs(OutputType.FILE);
File f = new File("C:\\Users\\d.jayasurya\\eclipse-workspace\\Selenium\\Screenshot\\jai.png");
FileUtils.copyFile(src, f);
}
}
