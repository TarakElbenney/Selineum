package seliniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class testclass {

	  public static void main(String[] args) {
	        // Set the path to ChromeDriver
	        System.setProperty("chromedriver", "C:\\Program Files (x86)\\chromedriver-win64");

	        // Initialize ChromeDriver
	        WebDriver driver = new ChromeDriver();
	        try {
	            System.out.println("Ouverture du site...");
	            driver.get("https://seleniumplayground.practiceprobs.com/");


	            // Maximize the window
	            driver.manage().window().maximize();
	            Thread.sleep(5000); // Pause for 10 seconds

	            System.out.println("Recherche de la barre de recherche...");
	            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	            WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("query")));

	            System.out.println("Saisie du mot-clé 'Breed'...");
	            searchField.sendKeys("Breed");
	            Thread.sleep(10000); // Pause for 10 seconds

	            System.out.println("Recherche des résultats...");
	            List<WebElement> results = driver.findElements(By.className("md-search-result__item"));
	            Thread.sleep(5000); // Pause for 10 seconds

	            List<String> links = new ArrayList<>();
	            for (WebElement result : results) {
	                String innerHTML = result.getAttribute("innerHTML");
	                if (innerHTML.contains("Akita Inu")) {
	                    String[] splitResult = innerHTML.split("href=");
	                    String linkPart = splitResult[1].split("\"")[1];
	                    links.add(linkPart);
	                }
	            }

	            System.out.println("Liens trouvés : " + links);
	            Thread.sleep(10000); // Pause pour observer les résultats avant de quitter

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            driver.quit();
	        }
	    }
    }
	


