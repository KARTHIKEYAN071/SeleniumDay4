package demo.pracWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class exercise3 {
	public static void main(String args[]) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver;
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(co);
		driver.navigate().to("https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb");
		WebElement rname=driver.findElement(By.xpath("//*[@id=\"input-to-name\"]"));
		rname.sendKeys("Karthikeyan");
		WebElement remail=driver.findElement(By.xpath("//*[@id=\"input-to-email\"]"));
		remail.sendKeys("karthi123@gmail.com");
		WebElement yname=driver.findElement(By.xpath("//*[@id=\"input-from-name\"]"));
		yname.sendKeys("Karthikeyan R");
		WebElement yemail=driver.findElement(By.xpath("//*[@id=\"input-from-email\"]"));
		yemail.sendKeys("karthi456@gmail.com");
		WebElement birth=driver.findElement(By.xpath("//*[@id=\"input-theme-7\"]"));
		birth.click();
		WebElement message=driver.findElement(By.xpath("//*[@id=\"input-message\"]"));
		message.sendKeys("hello");
		WebElement amount=driver.findElement(By.xpath("//*[@id=\"input-amount\"]"));
		amount.sendKeys("5");
		WebElement continuebtn=driver.findElement(By.xpath("//*[@class=\"btn btn-primary\"]"));
		continuebtn.submit();

		
		

		
	}
}
