package TImesheetOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondApproval9 {
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
		  
	 //identify web elements for click edit button 
	 WebElement ClickEdit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[1]"));
	 ClickEdit.click();
	 Thread.sleep(7000);
	   
	 System.out.println("Edit button clicked");
	
	//duration to entering into the page  
	Thread.sleep(2000); 
	
	//identify the web element for the project name
	WebElement projectname=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[1]/div/div[2]/div/div/input"));
    projectname.sendKeys("ACME");
    Thread.sleep(2000);
	   
	//identify the web element for the project name click option
    WebElement projectnameCLK=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[1]/div/div[2]/div/div[2]/div[1]"));
    projectnameCLK.click();
	Thread.sleep(2000);
	
	
	//******SELECTING THE ACTIVITY MANUALLY IN THE DROPDWON WITHIN SECONDS*******
    Thread.sleep(6000);//Administration
	   
	   
	                      //---------************MONDAY ACTIVITY*************-----------
	   
	   
	 //identifying the web element for the Monday
	 WebElement  monday1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[3]/div/div[2]/input"));
	 monday1.sendKeys("4");
	 Thread.sleep(2000);
	   
	 //identify the web element to click the icon button
	 WebElement icon001=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[3]/button"));
	 icon001.click();
	 Thread.sleep(2000);
	 
	 //identify the web element for making comments for Monday activity
	 WebElement Mondayactivity1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[2]/div/div[2]/textarea"));
	 Mondayactivity1.sendKeys("Coordinate office operations to secure efficiency\n");
	 Thread.sleep(2000);
	  
	 //identify the web elements to save the activity
	 WebElement Savebutton1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[3]/button[2]"));
	 Savebutton1.click();
	 Thread.sleep(2000);
	   
	   
	                              //---------************TUESDAY ACTIVITY*************-----------
	   
	 //identifying the web element for the Tuesday
	 WebElement tuesday1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[4]/div/div[2]/input"));
	 tuesday1.sendKeys("4");
	 Thread.sleep(2000);
	   
	 //identify the web element to click the icon button
	 WebElement icon002=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[4]/button"));
	 icon002.click();
	 Thread.sleep(2000); 
	  
     //identify the web element for making comments for Tuesday activity
	 WebElement tuesdayactivity1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[2]/div/div[2]/textarea"));
	 tuesdayactivity1.sendKeys("Preparing weekly reports");
	 Thread.sleep(2000);
	   
	 //identify the web elements to save the activity
	 WebElement Savebutton2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[3]/button[2]"));
	 Savebutton2.click();
	 Thread.sleep(2000);  
	   
	   
	                            //---------************WEDNESDAY ACTIVITY*************-----------
	   
	   
	 //identifying the web element for the Wednesday
	 WebElement  wednesday1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[5]/div/div[2]/input"));
	 wednesday1.sendKeys("5");
	 Thread.sleep(2000);
	   
	 //identify the web element to click the icon button
	 WebElement icon003=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[5]/button"));
	 icon003.click();
	 Thread.sleep(2000); 
	  
     //identify the web element for making comments for Wednesday activity
	 WebElement wednesdayactivity1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[2]/div/div[2]/textarea"));
	 wednesdayactivity1.sendKeys("Support budgeting and bookkeeping procedures");
	 Thread.sleep(2000);
	   
	 //identify the web elements to save the activity
	 WebElement Savebutton3=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[3]/button[2]"));
	 Savebutton3.click();
	 Thread.sleep(2000);     
	   
	   
	   
	                             //---------************THURSDAY ACTIVITY*************-----------
	   
	 //identifying the web element for the Thursday
	 WebElement  thursday1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[6]/div/div[2]/input"));
	 thursday1.sendKeys("3");
	 Thread.sleep(2000);
	   
	 //identify the web element to click the icon button
	 WebElement icon004=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[6]/button"));
	 icon004.click();
	 Thread.sleep(2000); 
	  
     //identify the web element for making comments for Thursday activity
	 WebElement thursdayactivity1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[2]/div/div[2]/textarea"));
	 thursdayactivity1.sendKeys("Assist colleagues whenever necessary");
	 Thread.sleep(2000);
	   
	 //identify the web elements to save the activity
	 WebElement Savebutton4=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[3]/button[2]"));
	 Savebutton4.click();
	 Thread.sleep(2000);  
	   
	   
	  
	                            //---------************FRIDAY ACTIVITY*************-----------
	   
	 //identifying the web element for the Friday
	 WebElement  friday1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[7]/div/div[2]/input"));
	 friday1.sendKeys("5");
	 Thread.sleep(2000);
	   
    //identify the web element to click the icon button
	WebElement icon005=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[7]/button"));
	icon005.click();
	Thread.sleep(2000); 
	  
    //identify the web element for making comments for Friday activity
	WebElement fridayactivity1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[2]/div/div[2]/textarea"));
    fridayactivity1.sendKeys("Track stocks of office supplies and place orders when necessary");
	Thread.sleep(2000);
	   
	//identify the web elements to save the activity
    WebElement Savebutton5=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[3]/button[2]"));
	Savebutton5.click();
	Thread.sleep(2000); 
	   
	System.out.println("All the datas for the project1 has updated to the time sheet");
	
    //duration to entering into the page  
  	Thread.sleep(2000); 
  	
    //identify the web element to find the add row
     WebElement addrow=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[2]/td/button"));	
     addrow.click();
     Thread.sleep(2000);
  	   
    //identify the web element for the project name
     WebElement projectname2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[2]/td[1]/div/div[2]/div/div/input"));
     projectname2.sendKeys("ACME");
     Thread.sleep(2000);
  	   
    //identify the web element for the project name click option
     WebElement projectnameCLK2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[2]/td[1]/div/div[2]/div/div[2]/div[1]"));
     projectnameCLK2.click();
     Thread.sleep(2000);
     
     
  	   
    //******SELECTING THE ACTIVITY MANUALLY IN THE DROPDWON WITHIN SECONDS*******
     Thread.sleep(6000);  // Bug Fix
     
     
    //identifying the web element for the Monday
     WebElement  Monday2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[2]/td[3]/div/div[2]/input"));
     Monday2.sendKeys("5");
     Thread.sleep(2000);
  	   
    //identify the web element to click the icon button
     WebElement icon2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[2]/td[3]/button"));
     icon2.click();
     Thread.sleep(2000);
  	 
    //identify the web element for making comments for Monday activity
     WebElement mondayactivity2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[2]/div/div[2]/textarea"));
     mondayactivity2.sendKeys("Prioritize test code\n");
     Thread.sleep(2000);
  	  
    //identify the web elements to save the activity
     WebElement savebutton02=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[3]/button[2]"));
     savebutton02.click();
     Thread.sleep(2000);
     
     System.out.println("The datas for the project2 has updated to the time sheet");
     
    //identify the web element to find the SAVE button for the entire project1
	WebElement SAVE1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[3]"));
	SAVE1.click();
	Thread.sleep(12000); 
     
     
    //identify the web element to click on submit button
    WebElement submit1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[2]"));
    submit1.click();
    Thread.sleep(6000);
    
    //duration to entering into the page  
    Thread.sleep(12000);
    	
    //identify the web element to comment on approval sheet
    WebElement SheetApprove1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/textarea"));
    SheetApprove1.sendKeys("Approved");
    Thread.sleep(12000);
     
     
    //identify the web element to click on approve button
    WebElement ApproveCLK1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button[2]"));
    ApproveCLK1.click();
    Thread.sleep(12000);
     
    System.out.println("Time sheet Action1 has been approved");
    }
	
	@Test(priority=1)
    public void  ResetAction1() throws InterruptedException
    {
    //duration to entering into the page  
    Thread.sleep(12000);
    	
    //identify the web element to click on Reset button
    WebElement ResetCLK1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button"));
    ResetCLK1.click();
    Thread.sleep(6000);
     
    //identify the web elements to find the edit button after Reset option
    WebElement EditAfterReset1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button"));
	EditAfterReset1.click();
    Thread.sleep(5000);
	   
	//identify the web elements to find the icon button after Reset option
    WebElement iconAfterReset=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[2]/table/tbody/tr[1]/td[3]/button"));
	iconAfterReset.click();
    Thread.sleep(12000);
	    
    //identify the web elements to edit the comment
    WebElement Iconcomment=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[2]/div/div[2]/textarea"));
    Iconcomment.sendKeys(" managing email enquiries\n");
	Thread.sleep(5000);
	    
    //identify the web elements to save the activity
    WebElement savebuttonactivity1=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[4]/div/div/div/form/div[3]/button[2]"));
    savebuttonactivity1.click();
    Thread.sleep(12000);  
     
    //identify the web elements to save the project
    WebElement SAVE2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/form/div[3]/div[2]/button[3]"));
    SAVE2.click();
    Thread.sleep(12000); 
     
    System.out.println("Cliked the Reset button and added some comment for the second approval");
    }
    
    @Test(priority=2)
    public void  TimeSheetAction2() throws InterruptedException
    {
    //duration to entering into the page  
    Thread.sleep(12000);
    	
    //identify the web element to comment on the approval sheet
    WebElement SheetApprove2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[1]/div/div/div/div[2]/textarea"));
    SheetApprove2.sendKeys("Second Approval");
    Thread.sleep(16000);
     
     
    //identify the web element to click on approve button
    WebElement ApproveCLK2=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/form/div[2]/button[2]"));
    ApproveCLK2.click();
    Thread.sleep(14000);
     
    System.out.println("Time sheet Action2 has been approved");
    }
    
    @AfterTest
	public void EndLogin() throws InterruptedException
	{
	Thread.sleep(4000);
	driver.quit();
    }
}
