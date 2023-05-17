package TImesheetOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditTimeSheet5 {
	//Global Declaration
    public String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String ChromeDrierpath="D:\\Eclipse\\Batch23Assesment\\ResourceFiles\\ChromeDriver\\V113.exe";
	public WebDriver driver;
			
	@BeforeTest
	public void CallingBrowser() throws InterruptedException 
	{
	 System.out.println("Launch chrome browser");
		  
	 //set the properties to the Chrome browser
	 System.setProperty("webdriver.chrome.driver", ChromeDrierpath);
				
	 //defining the web driver
	 driver=new ChromeDriver();
				
	 //call the Chrome browser and maximze in the window
	 driver.manage().window().maximize();
				
	 //call the baseurl
	 driver.get(baseUrl); 
		  
	 //duration to entering into the page
	 Thread.sleep(4000);
					
	 //identify the web elements and checking that the user  can login with VALID USERNAME and VALID password
	 WebElement usernametxt=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	 WebElement passwordtxt=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	 WebElement loginBtn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		  			
     //calling the object to execute
	 usernametxt.sendKeys("Admin");
	 Thread.sleep(1000);
	 passwordtxt.sendKeys("admin123");
	 Thread.sleep(1000);
	 loginBtn.click();
	 Thread.sleep(6000);
		   
	 System.out.println("Testing that the user can login with VALID username and VALID password");  
		  
	 //identify the web elements for Time option inthe DashBoard
	 WebElement Timelogin=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a"));
	 Timelogin.click();
     Thread.sleep(7000);
		   
	 System.out.println("User can click in the time login");
		  
	 //identify the web elements for the employee name Existing
	 WebElement Employeename=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/div/div/input"));
	 Employeename.sendKeys("Linda Jane Anderson");
	 Thread.sleep(5000);
		   
	 //Search for Employee name is existing in the OrangeHRM System before execute
	 WebElement SearchName=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/div/div[2]/div/span"));
	 SearchName.click();
     Thread.sleep(2000);
		  
	 System.out.println("User can find the EmployeeName and Search done");
		   
	 //identify the web elements to click view option
	 WebElement view=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button"));
	 view.click();
     Thread.sleep(2000);
	 
	 System.out.println("User can click the View button");
	
	  
	 //*******SELECTING THE DATE MANUALLY IN THE CALENDAR********
	 Thread.sleep(9000);
	  
	 System.out.println("Choose date manualy");
	  
	 //identify the web elements to click Create Time Sheet and edit Option
	 WebElement ClickTimeSheetEditBtn=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button"));
	 ClickTimeSheetEditBtn.click();
	 Thread.sleep(6000);
			   
	 System.out.println("User can click the CreateTimeSheet and button "); 
     }
	
	 @Test(priority=1)
	 public void TimeSheetEdit() throws InterruptedException
	 {
	 //duration to entering into the page  
	 Thread.sleep(4000);  
		  
	 //identify web elements for click edit button 
	 WebElement ClickEdit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[1]"));
	 ClickEdit.click();
	 Thread.sleep(4000);
	   
	 System.out.println("Edit button clicked");
	 }

	 
	 @AfterTest
	  public void EndLogin() throws InterruptedException
	  {
	  Thread.sleep(4000);
	  driver.quit();
	  }
}
