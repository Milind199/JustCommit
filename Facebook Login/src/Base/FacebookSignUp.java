package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookSignUp {

	public static void main(String[] args) throws Exception
	{
		// TODO Auto-generated method stub
		
		//Launch Browser
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\patilmi\\Desktop\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();		
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='u_0_g']")).sendKeys("Anil");
		driver.findElement(By.xpath(".//*[@id='u_0_i']")).sendKeys("Patil");
		driver.findElement(By.xpath(".//*[@id='u_0_l']")).sendKeys("8605599942");
		driver.findElement(By.xpath(".//*[@id='u_0_s']")).sendKeys("raj@199");
		
		Select day=new Select(driver.findElement(By.xpath(".//*[@id='day']")));
		day.selectByIndex(3);
		Select month=new Select(driver.findElement(By.xpath(".//*[@id='month']")));
		month.selectByVisibleText("Apr");
		Select year=new Select(driver.findElement(By.xpath(".//*[@id='year']")));
		year.selectByValue("2000");
		Thread.sleep(500);
		
		driver.findElement(By.id("u_0_7")).click();
		
		driver.findElement(By.xpath(".//*[@id='u_0_y']")).click();
		driver.navigate().back();
		driver.close();
		
		

	}

}
