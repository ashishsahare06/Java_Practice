package Java_a2z;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicWebTable {
	static WebDriver driver;
	
public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		driver=  new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(1000);
		int rowcount= driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr")).size();
		System.out.println(rowcount);
		int coloumcount =driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody//th")).size();
		System.out.println(coloumcount);
for(int i=1;i<rowcount;i++){
	for(int j=1;j<=coloumcount;j++){
	
	String actualvalue = driver.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr["+(i+1)+"]/td["+j+"]")).getText();
	if (actualvalue.equals("Italy")) {
		System.out.println(i+":"+j);
	}
	
	}	

}


	}

}
