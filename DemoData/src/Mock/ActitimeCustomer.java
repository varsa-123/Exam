package Mock;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeCustomer {
	public static void main(String[] args) throws Throwable {
		Random r = new Random();
		int num=r.nextInt(1000);
		String data = "KGF"+num;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\QSPJSP\\eclipse-workspace\\DemoData\\src\\Mock\\server\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.className("textField")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[class='textField pwdfield']")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector("div[class='title ellipsis']")).click();
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		//Thread.sleep(3000);
	 	driver.findElement(By.xpath("//input[contains(@class,'inputFieldWithPlaceholder ne')]")).sendKeys(data);
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(10));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		driver.findElement(By.xpath("//div[text()='Create Customer']")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.id("logoutLink")).click();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.8)
		
		
		
		
		
	
	}

}
