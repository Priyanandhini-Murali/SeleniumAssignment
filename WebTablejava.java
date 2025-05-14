import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablejava {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
driver.get("https://search.yahoo.com/search?d=%7b%22dn%22%3a%22yk%22%2c%22subdn%22%3a%22digitalservice%22%2c%22ykid%22%3a%22e0129bf2-e840-3ce1-a35f-6c87ffa9ac3c%22%7d&fr2=p%3ads%2cv%3aomn%2cm%3asa%2cbrws%3achrome%2cpos%3a1&fr=mcafee&type=E211US826G0&p=Facebook&guccounter=1");

// Get and print page title
String pageTitle = driver.getTitle();
System.out.println("Page Title: " +pageTitle);

Thread.sleep(3000);
driver.manage().window().maximize();
WebElement loginLink = driver.findElement(By.linkText("Login"));
loginLink.click();
Thread.sleep(3000);
//driver.findElement(By.name("btnK")).click();

Thread.sleep(10000);

driver.findElement(By.xpath("//*[@id=\"tads\"]/div[3]/div/div/div/div[1]/a/div[1]/span")).click();

driver.findElement(By.linkText(pageTitle));

Thread.sleep(3000);

driver.quit();

	}

}