package oldseleneum;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Code {

	public static void main(String[] args) throws IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Asus\\eclipse-workspace\\JavaSelenium\\Drive\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997\r\n");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

WebElement userid = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
userid.sendKeys("Greens@gmail.com");

WebElement clickbtn = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
clickbtn.click();

WebElement password = driver.findElement(By.xpath("//input[@id='fldPasswordDispId']"));
password.sendKeys("Greens");

//WebElement alert = driver.findElement(By.xpath("//iframe[@title='Adobe ID Syncing iFrame']"));
//driver.switchTo().frame(alert);
//Alert a = driver.switchTo().alert();
//a.accept();

driver.quit();

	}
}
