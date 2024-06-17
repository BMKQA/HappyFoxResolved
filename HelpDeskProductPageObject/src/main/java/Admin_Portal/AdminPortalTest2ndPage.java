package Admin_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webdriverbase.AppPage;

public class AdminPortalTest2ndPage extends AppPage {

	public AdminPortalTest2ndPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//a[contains(text(),'Pending Tickets')]") 
	WebElement PendingTickets;
	
	public void clickPendingTickets()
 	{
		hoverOverElementUsingJS(PendingTickets);
		PendingTickets.click();
		
 	}
	
	
     public void openCustomerTicket(String xpath) throws InterruptedException {
		
	    String ticket = "//a[@title='"+xpath+"']";
		WebElement pqr = driver.findElement(By.xpath(ticket));
		hoverOverElementUsingJS(pqr);
	    pqr.click();
	    sleep();  
	    
	}	
     
     
    @FindBy(xpath = "//a[@data-test-id='ticket-side-pane-contact-name']") 
  	WebElement contactName;
    
    public String getContactName()
	{
    	System.out.println(contactName.getText());
		return contactName.getText();
	}
    
    @FindBy(xpath = "//a[@data-test-id='ticket-side-pane-contact-name']//following::div[1]/div[1]/span[1]") 
  	WebElement Emailtxt;
    
    public String getEmailtxt()
	{
    	System.out.println(Emailtxt.getText());
		return Emailtxt.getText();
	}
    
    @FindBy(xpath = "//div[contains(text(),'status')]//following::div[1]") 
  	WebElement Statustxt;
    
    public String getStatustxt()
	{
    	System.out.println(Statustxt.getText());
		return Statustxt.getText();
	}
    
    
    @FindBy(xpath = "//div[contains(text(),'status')]//following::div[1]//following::span[1]/div/div/div/div[2]") 
  	WebElement Prioritytxt;
    
    public String getPrioritytxt()
	{
    	System.out.println(Prioritytxt.getText());
		return Prioritytxt.getText();
	}
    
      
     
    @FindBy(xpath = "//span[contains(text(),'Reply')]") 
 	WebElement ReplyButton;
 	
 	public void clickReplyButton()
  	{
 		ReplyButton.click();
 		
  	}
 	
 	@FindBy(xpath = "//span[@data-test-id='canned-action-trigger']") 
 	WebElement CannedAction;
 	
 	public void clickCannedAction()
  	{
 		CannedAction.click();
 		
  	}
 	
 	@FindBy(xpath = "//input[@placeholder='Search more Canned Actions']") 
 	WebElement SearchCannedAction;
 	
 	@FindBy(xpath = "//li[@class='ember-power-select-option']") 
 	WebElement ChooseCannedAction;
 	
 	public void clickSearchCannedAction(String abc)
  	{
 		SearchCannedAction.click();
 		SearchCannedAction.sendKeys(abc);
 		ChooseCannedAction.click();
 		
  	}
 	
 	
 	@FindBy(xpath = "//button[@data-test-id='hf-add-canned-action']") 
 	WebElement ApplyCannedAction;
 	
 	public void clickApplyCannedAction()
  	{
 		ApplyCannedAction.click();
 		
  	}
 	
 	
 	@FindBy(xpath = "//button[@data-test-id='add-update-reply-button']") 
 	WebElement Reply;
 	
 	public void sendReply() throws InterruptedException
  	{
 		Reply.click();
 		sleep();
 		
  	}
 	
    
    @FindBy(xpath = "//a[contains(text(),'Agent Portal')]")  
 	WebElement AgentPortal;
     
     public void gotoAgentPortal() {
    	 
    	 AgentPortal.click();
     }
 	
 	
  	@FindBy(xpath = "//a[@data-test-id='details-close']") 
  	WebElement CloseTicket;
  	
  	public AdminPortalTest1stPage closeTheTicket()
   	{
  		CloseTicket.click();
  		return new AdminPortalTest1stPage(driver);
  		
   	}
   
     public void sleep() throws InterruptedException {
    	 Thread.sleep(2000);
     }
}
