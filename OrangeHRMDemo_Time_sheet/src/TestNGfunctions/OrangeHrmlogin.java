package TestNGfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrangeHrmlogin {
  
  //Global Declaration
	public String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String ChromeDrierpath="D:\\Eclipse\\Batch23Assesment\\ResourceFiles\\ChromeDriver\\V112.exe";
	public WebDriver driver;
	
	@BeforeTest
	public void callingbrowser()
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
	public void Withoutlogins() throws InterruptedException
	{   
		// duration to entering into the page
		Thread.sleep(2000);
		
		// identify the web elements and checking that the user can login without username and password
		
		//WebElement usernametxt1=driver.findElement(By.xpath("//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		//WebElement passwordtxt1=driver.findElement(By.xpath("//*[@id="app"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		WebElement loginBtn1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
	     //calling the object to execute
		loginBtn1.click();
		Thread.sleep(1000);
		System.out.println("Testing the user can login without username and password");
		
		//refresh the page due to several validation
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	@Test(priority=2)
	public void INVALIDUSERNAMElogin() throws InterruptedException
	{
		// duration to entering into the page
		Thread.sleep(2000);
		
		//identify the web elements and checking that the user  can login with INVALID USERNAME and VALID password
		WebElement usernametxt2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		WebElement passwordtxt2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		WebElement loginBtn2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		
		//calling the object to execute
		usernametxt2.sendKeys("Suraveena");
		Thread.sleep(1000);
		passwordtxt2.sendKeys("admin123");
		Thread.sleep(1000);
		loginBtn2.click();
		Thread.sleep(1000);
		
		System.out.println("Testing that the user can login with INVALID username and VALID password");
		
		driver.navigate().refresh();
		Thread.sleep(2000);
	}
	
	@Test(priority=3)
	public void INVALIDpasswordlogin() throws InterruptedException 
	{
		// duration to entering into the page
		Thread.sleep(2000);
				
		//identify the web elements and checking that the user  can login with VALID USERNAME and INVALID password
		WebElement usernametxt3=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		WebElement passwordtxt3=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		WebElement loginBtn3=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				
		//calling the object to execute
		usernametxt3.sendKeys("Admin");
		Thread.sleep(1000);
		passwordtxt3.sendKeys("suvi123");
		Thread.sleep(1000);
		loginBtn3.click();
		Thread.sleep(1000);
				
		System.out.println("Testing that the user can login with VALID username and INVALID password");
				
		driver.navigate().refresh();
		Thread.sleep(2000);	
	}
	@Test(priority=4)
	public void INVALIDlogin() throws InterruptedException 
	{
		// duration to entering into the page
		Thread.sleep(2000);
				
		//identify the web elements and checking that the user  can login with VALID USERNAME and INVALID password
		WebElement usernametxt4=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		WebElement passwordtxt4=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		WebElement loginBtn4=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				
		//calling the object to execute
		usernametxt4.sendKeys("Suraveena");
		Thread.sleep(1000);
		passwordtxt4.sendKeys("suvi123");
		Thread.sleep(1000);
		loginBtn4.click();
		Thread.sleep(1000);
				
		System.out.println("Testing that the user can login with INVALID username and INVALID password");
				
		driver.navigate().refresh();
		Thread.sleep(2000);	
	}	
	
	
	@Test(priority=5)
	public void VALIDlogin() throws InterruptedException 
	{
		// duration to entering into the page
		Thread.sleep(2000);
				
		//identify the web elements and checking that the user  can login with VALID USERNAME and INVALID password
		WebElement usernametxt4=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		WebElement passwordtxt4=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		WebElement loginBtn4=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
				
		//calling the object to execute
		usernametxt4.sendKeys("Admin");
		Thread.sleep(1000);
		passwordtxt4.sendKeys("admin123");
		Thread.sleep(1000);
		loginBtn4.click();
		Thread.sleep(2000);
				
		System.out.println("Testing that the user can login with VALID username and VALID password");
				
		driver.navigate().refresh();
		Thread.sleep(2000);
	}	
	@AfterTest
	public void terminateLOGIN() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
