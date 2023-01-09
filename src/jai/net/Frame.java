package jai.net;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\d.jayasurya\\eclipse-workspace\\Selenium\\drive\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	FileReader read = new FileReader("C:\\Users\\d.jayasurya\\eclipse-workspace\\Selenium\\src\\jai\\net\\Testdata.properties");
Properties prop = new Properties();
prop.load(read);
driver.manage().window().maximize();
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
String property = prop.getProperty("url");
driver.get(property);

}
}