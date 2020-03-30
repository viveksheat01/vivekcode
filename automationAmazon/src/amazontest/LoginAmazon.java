package amazontest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAmazon {

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_automationTest\\automationAmazon\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String title=driver.getTitle();
		System.out.println(title);
		
	WebElement elt=	driver.findElement(By.id("twotabsearchtextbox"));
	elt.sendKeys("amazon prime");
	
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	// scroll down
	
	JavascriptExecutor js=((JavascriptExecutor)driver);
	
	js.executeScript("window.scrollBy(0,500)", "");
	
	driver.findElement(By.xpath("//span[text()='Amazon Prime Video']")).click();
	
	//login with amazon 
	
	driver.findElement(By.id("masrw-sign-in-button-announce")).click();
	
	driver.findElement(By.id("ap_email")).sendKeys("testdemo@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.name("password")).sendKeys("autoAmz@123");
	driver.findElement(By.id("signInSubmit")).click();
	
	driver.getTitle();
	
	driver.close();
	
	
	
	
	
		
		
		
		

	}

}
