package TestNGfunctions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ToggleButtonFunction {
  
  //Global Declaration
	public String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String ChromeDrierpath="D:\\Eclipse\\Batch23Assesment\\ResourceFiles\\ChromeDriver\\V112.exe";
	public WebDriver driver;
		
  @BeforeTest
  public void CallingBrowser() 
  {
	 System.out.println("Launch chrome browser");
	// set the properties to the chrome browser
	System.setProperty("webdriver.chrome.driver", ChromeDrierpath);
		
	// defining the web driver
	driver=new ChromeDriver();
		
	// call the chrome browser and maximze in the window
	driver.manage().window().maximize();
		
	// call the baseurl
	driver.get(baseUrl);  
  }
  @Test(priority=1)
  public void OrangeHrmlogin() throws InterruptedException 
	{
   // duration to entering into the page
   Thread.sleep(2000);
				
  //identify the web elements and checking that the user  can login with VALID USERNAME and INVALID password
   WebElement usernametxt=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
   WebElement passwordtxt=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
   WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				
  //calling the object to execute
   usernametxt.sendKeys("Admin");
   Thread.sleep(1000);
   passwordtxt.sendKeys("admin123");
   Thread.sleep(1000);
   loginBtn.click();
   Thread.sleep(1000);
				
   System.out.println("Testing that the user can login with VALID username and VALID password");
   driver.navigate().refresh();
  }
  
  
  @Test(priority=2)
  public void ToggleButton() throws InterruptedException
  {
   // duration to entering into the page
    Thread.sleep(2000); 
    
  // identify the web elements for the toggle button
    WebElement toggleBtn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button"));
    
  // object calling 
    toggleBtn.click();
    Thread.sleep(1000);
    
    System.out.println("Toggle button is clicked and does not showing the dashboard");
  }

  @Test(priority=3)
  public void ToggleButtonreverse() throws InterruptedException
  {
  // duration to entering into the page
   Thread.sleep(2000); 
    
  // identify the web elements for the toggle button reverse
    WebElement toggleBtn1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button"));
    
  // object calling 
    toggleBtn1.click();
    Thread.sleep(3000);
    
    System.out.println("Toggle Button is reversed and showing the dashboard");
  }  
  
  @AfterTest
  public void EndLogin() throws InterruptedException
  {
	  Thread.sleep(4000);
	  driver.quit();
  }

}
