import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Invokingbrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To Initiate Chrome browser
		/*System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		      driver.get("https://google.com");*/
		
		
		//To Initiate Edge browser
		
		/*System.setProperty("webdriver.edge.driver", "C:\\work\\Edge\\MicrosoftWebDriver.exe");
		
		   WebDriver driver= new EdgeDriver();
		   driver.get("https://gmail.com");*/
				   
		   
		 //To Initiate IE browser
		   
		   System.setProperty("webdriver.ie.driver", "C:\\work\\IEDriverServer_x64_3.8.0\\IEDriverServer.exe");
              
		   WebDriver driver = new InternetExplorerDriver();
		  driver.get("https://udemy.com");
		   
	}

}
