package compareLocations;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UberEatsSelenium {
	
	public void viewMore() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ahmed\\Downloads\\chromedriver.exe");
        @SuppressWarnings("unused")
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ubereats.com/en-CA/cities/");
        
        List<WebElement> list = new ArrayList<WebElement>(); 
        list = driver.findElements(By.className("a.bz.cd"));
        WebElement TxtBoxContent = driver.findElement(By.className("a.bz.cd"));
        System.out.println("Printing " + TxtBoxContent.getAttribute("value"));
        
        for (WebElement more : list )
        	System.out.println(more.getAttribute("value"));
      //  driver.findElement(arg0)
	}	
	
}
