package Base;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Login {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		
		//IE
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\patilmi\\Desktop\\IEDriverServer_Win32_3.7.0\\IEDriverServer.exe");
			//WebDriver driver=new InternetExplorerDriver();
			//WebDriver driver= new ChromeDriver();
			//driver.navigate().to("https://www.google.co.in");
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium Testing Setups\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
		driver.navigate().to("https://www.indeed.co.uk");
		driver.manage().window().maximize();
		
	/*	driver.findElement(By.xpath(".//input[@id='what']")).sendKeys("Selenium");
		driver.findElement(By.xpath(".//input[@id='where']")).clear();
		driver.findElement(By.xpath(".//input[@id='where']")).sendKeys("London");
		driver.findElement(By.xpath(".//input[@id='fj']")).click();*/
		
		System.out.println("Directory : "+System.getProperty("user.dir"));
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\patilmi\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.navigate().to("https://www.google.co.in");*/
	
		driver.navigate().back();
		driver.quit();
			
	}
}
