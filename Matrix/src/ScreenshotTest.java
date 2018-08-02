import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ScreenshotTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");*/
		
		
				
		
		
		       System.setProperty("webdriver.chrome.driver", "path of exe");
		       
		       WebDriver driver = new ChromeDriver();
		       
		       driver.get("URL");

		       
		       File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		       
		       FileUtils.copyFile(src, new File ("C:\\work\\Screenshots\\scrt.png"));
		       
		       
		 
		
		
	/*	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File ("C:\\work\\Screenshots\\scrt.png"));*/
		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File ("C:\\work\\Screenshots\\scrt.png"));
		
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File ("C:\\work\\Screenshots\\scrt.png") );
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\work\\\\chromedriver_win32\\\\chromedriver.exe");
		driver.get("");
		
		File src = ((TakesScreenshot)driver).getScreenshotAS(OutputType.FILE);
		
		FileUtils.copyFile(src, new ("C:\\work\\Screenshots\\file"));
		
		File src= ((TakeScreenshot)driver.getScreenshotAs(OutputType.File);
		

			
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE));
		
		FileUtils.copyFile(src, new ("location of file"));
		
		
				
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(Output.FILE)		
				
				FileUtils.copyFile(src, new ("location of file"));
		
		
		
		File src= ((TakesScreenshot)driver).getScreenshotAs(Output.FILE);
		
		FileUtils.copyFile(src, new ("location of file"))
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
