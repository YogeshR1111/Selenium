package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
         
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.edge.driver", "C:\\Selenium\\edgedriver_win32\\msedgedriver.exe");
		//WebDriver driver = new ChromeDriver();  
		WebDriver driver = new EdgeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		TakesScreenshot scn = (TakesScreenshot) driver;  
		File source = scn.getScreenshotAs(OutputType.FILE);  
		File destination = new File("C:\\Users\\yoges\\Downloads\\Lectures\\A.png");  
		FileHandler.copy(source, destination);  
		Thread.sleep(3000);  
		
		driver.get("https://www.cricbuzz2.com/");  
		
		File source2 = scn.getScreenshotAs(OutputType.FILE);
		File destination2 = new File("C:\\Users\\yoges\\Downloads\\Lectures\\B.png");  
		FileHandler.copy(source2, destination2);  
		
		
		System.out.println("SS Here. ");
		driver.close();
	}

}
