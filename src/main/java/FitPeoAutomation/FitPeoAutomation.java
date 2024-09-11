package FitPeoAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FitPeoAutomation {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ashis\\OneDrive\\Desktop\\trupi\\FitPeoAutomation\\Drivers\\chromedriver.exe");

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.fitpeo.com");   // Step 1: Navigate to the FitPeo Homepage
	        driver.manage().window().maximize();
	        
	        
	       try {
	    	   WebElement revenueCalculatorLink = new WebDriverWait(driver, Duration.ofSeconds(10))  // Step 2: Navigate to the Revenue Calculator Page
	                    .until(ExpectedConditions.elementToBeClickable(By.linkText("Revenue Calculator")));
	            revenueCalculatorLink.click();
	            
	            Thread.sleep(1500); 
	         	 
	          WebElement sliderSection = new WebDriverWait(driver, Duration.ofSeconds(10))  // Step 3: Scroll Down to the Slider Section
	                   .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(@class,'duk49p')]")));
	          JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,250)");
			
	        WebElement slider = driver.findElement(By.xpath("//*[@id=\":r0:\"]")); // Step 4: Adjust the Slider to Set Its Value to 820
	        Thread.sleep(500);
	        ((JavascriptExecutor) driver).executeScript("arguments[0].value=820;", slider);

	          	 Thread.sleep(1500); 
	          
	          	 WebElement slider3 = driver.findElement(By.xpath("//*[@id=\":r0:\"]"));
	           	js.executeScript("arguments[0].value='560';", slider3);
	           	slider3.clear();
	           	js.executeScript("arguments[0].value='560';", slider3);
	           	Thread.sleep(1000);

	        
	        
	        
	        
//	    Step 6: Validate Slider Value Updates to 560
	    WebElement sliderValue = driver.findElement(By.xpath("//*[@id=\":r0:\"]")); 
	       String actualSliderValue = sliderValue.getAttribute("value");
	      if (!actualSliderValue.equals("560")) {
	        throw new AssertionError("Expected slider value to be 560, but got " + actualSliderValue);
	        }
	      js.executeScript("arguments[0].value='820';", slider3);
	       driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
	       driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	       driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
	       driver.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
	       Thread.sleep(1000);
	      
	    // Step 8: Validate Total Recurring Reimbursement
	       WebElement totalReimbursement = driver.findElement(By.xpath("/html/body/div[2]/div[1]/header/div/p[4]")); // Replace with actual ID or locator
	       String actualTotalReimbursement = totalReimbursement.getText();
	       if (!actualTotalReimbursement.equals("$110700")) {
	           throw new AssertionError("Expected total reimbursement to be $110700, but got " + actualTotalReimbursement);
	       }
	        Thread.sleep(1000); 
	        
		} catch (Exception e) {
			 e.printStackTrace();
		} finally {
     
          driver.quit();
        }
	        
	}

}
