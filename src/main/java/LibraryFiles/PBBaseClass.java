package LibraryFiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBBaseClass 
{
public WebDriver driver;
public void InitializeBrowser()
{
System.setProperty("webdriver.chrome.driver", "C:\\Selenium file\\chromedriver_win32\\chromedriver.exe");

 driver = new ChromeDriver();
 
 driver.get("https://www.policybazaar.com/");
 driver.manage().window().maximize();
 driver.manage().deleteAllCookies();
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 
 
}
}
