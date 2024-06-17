package CustomerPortal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Admin_Portal.AdminPortalTest2ndPage;
import webdriverbase.AppPage;


public class SupportPortalPage extends AppPage{
	
	public SupportPortalPage(WebDriver driver)
	{
		super(driver);
				
	}
	
	
	public void navigateToHappyFoxSupportPortalURL(String url) {
		this.driver.get(url);
	}
		
	@FindBy(id = "id_subject")  
	WebElement Subject;
	
	public void enterSubject(String text)
 	{
		Subject.sendKeys(text);
 	}
	
	@FindBy(xpath = "//div[@class='cke_wysiwyg_div cke_reset cke_enable_context_menu cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']")  
	WebElement Message;
	
	public void enterMessage(String text)
 	{
	    Message.sendKeys(text);
 	}
	
	@FindBy(id = "add-cc")  
	WebElement AddCC;
	
	public void clickAddCC()
 	{
	    AddCC.click();
 	}
	
	@FindBy(id = "add-bcc")  
	WebElement AddBCC;
	
	public void clickAddBCC()
 	{
	    AddBCC.click();
 	}

	@FindBy(id = "id_name")  
	WebElement FullName;
	
	public void enterFullName(String text) throws InterruptedException
 	{
		sleep();
	    FullName.sendKeys(text);
 	}
	
	@FindBy(id = "id_email")  
	WebElement Email;
	
	public void enterEmail(String text) throws InterruptedException
 	{
		sleep();
	    Email.sendKeys(text);
 	}

	@FindBy(xpath = "//button[@id='submit']")  
	WebElement CreateTicket;
		
	public AdminPortalTest2ndPage clickCreateTicket()
	 {
		   CreateTicket.click();
		   return new AdminPortalTest2ndPage(driver);
	 }
	
     public void sleep() throws InterruptedException {
    	 Thread.sleep(1000);
     }
     
     
     
	
	
}
