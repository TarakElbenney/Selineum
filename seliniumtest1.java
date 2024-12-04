package seliniumtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class testclass {

	  public static void main(String[] args) {
	        // Set the path to ChromeDriver
	        System.setProperty("chromedriver", "C:\\Program Files (x86)\\chromedriver-win64");

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        // Open Google
	        driver.get("https://seleniumplayground.practiceprobs.com");

	        // Print the title of the page
	        System.out.println("Page title is: " + driver.getTitle());

	        
	        driver.quit();
	    }
	}


