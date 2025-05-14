import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewDynamicTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.tutorialspoint.com/selenium/practice/webtables.php");

// Get and print page title
String pageTitle = driver.getTitle();
System.out.println("Page Title: " +pageTitle);

Thread.sleep(3000);
driver.manage().window().maximize();

WebElement table = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/thead/tr/th[1]"));
List<WebElement> rows = table.findElements(By.xpath(".//tr"));
Thread.sleep(3000);
for(WebElement row:rows) {
	List<WebElement> cells = row.findElements(By.xpath(".//td"));
	for(WebElement cell :cells) {
		String cellText = cell.getText();
		System.out.println(cellText);
	}
}
}

}