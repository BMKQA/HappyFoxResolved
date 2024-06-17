package Admin_Portal;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import webdriverbase.AppPage;

public class AdminPortalTest1stPage extends AppPage {

	public AdminPortalTest1stPage(WebDriver driver) {
		super(driver);
		
	}
	
	
	@FindBy(xpath = "//span[@class='hf-top-bar_title_text hf-font-light']")
	WebElement Title;
	
	@FindBy(linkText = "Statuses")
	WebElement Statuses;
	
	public void clickStatus()
 	{
		hoverOverElementUsingJS(Title);
		Title.click();
		Statuses.click();
		
 	}
	
	@FindBy(linkText = "Priorities")
	WebElement Priorities;
	
	public void clickPriorities() throws InterruptedException
 	{
		sleep();
		hoverOverElementUsingJS(Title);
		Title.click();
		hoverOverElementUsingJS(Priorities);
		Priorities.click();
		
 	}
	
	
	@FindBy(xpath = "//button[@class='hf-mod-create']")
	WebElement NewStatus;
	
	public void clickNewStatus() {
		NewStatus.click();
	}
	
	
	@FindBy(xpath = "//input[@aria-label='Status Name']")
	WebElement StatusName;
	
	public void enterStatusName(String text) {
		StatusName.sendKeys(text);
	}

	@FindBy(xpath = "//div[@aria-label='Behavior']")
	WebElement Behavior;
	
	public void enterBehavior(String text) {
		Behavior.click();
		Behavior.sendKeys(text);
		Behavior.sendKeys(Keys.ENTER);

	}
		
	
	@FindBy(xpath = "//textarea[@aria-label='Description']")
	WebElement StatusDescription;
	
	public void enterStatusDescription(String text) {
		StatusDescription.clear();
		StatusDescription.sendKeys(text);
	}
	
	
	@FindBy(xpath = "//button[@data-test-id='add-status']")
	WebElement AddStatus;
	
	public void clickAddStatus() {
		AddStatus.click();
	}
	
		@FindBy(xpath = "//a[@data-test-id='manage-statuses-left-nav']")
		WebElement StatusesSection;
		
		public void clickStatusesSection() throws InterruptedException {
			scrolltoElement(StatusesSection);
			StatusesSection.click();
		}
		
		
		public void setDefaultStatus(String xpath) {
			String Status = "//div[contains(text(),'"+xpath+"')]//following::td[3]";
			WebElement abc = driver.findElement(By.xpath(Status));
			hoverOverElementUsingJS(abc);
		    abc.click();
		}	
		
	
	@FindBy(xpath = "//a[contains(text(),'Priorities')]")
	WebElement PrioritySection;
	
	public void clickPrioritySection() {
		PrioritySection.click();
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/section[1]/section[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[9]/td[2]")
	WebElement NewPriority;
	
	public void clickNewPriority() {
		NewPriority.click();
	}
	
	@FindBy(xpath = "//input[@data-test-id='form-field-name']")
	WebElement PriorityName;
	
	public void enterPriorityName(String text) {
		PriorityName.clear();
		PriorityName.sendKeys(text);
	}
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/header[1]/div[2]/nav[1]/div[7]/div[1]/div[1]")
	WebElement PriorityDescription;
	
	public void enterPriorityDescription(String text) {
		PriorityDescription.clear();
		PriorityDescription.sendKeys(text);
	}
	
	@FindBy(xpath = "//textarea[@data-test-id='form-field-helpText']")
	WebElement PriorityHelpText;
	
	public void enterPriorityHelpText(String text) {
		PriorityHelpText.clear();
		PriorityHelpText.sendKeys(text);
	}
	
	@FindBy(xpath = "//button[@data-test-id='add-priority']")
	WebElement AddPriority;
	
	public void clickAddPriority() {
		AddPriority.click();
	}
	
	
	public void setDefaultPriroity(String xpath) throws InterruptedException {
		
	    String priority = "//span[contains(text(),'"+xpath+"')]//following::td[3]";
		WebElement pqr = driver.findElement(By.xpath(priority));
		hoverOverElementUsingJS(pqr);
	    pqr.click();
	    sleep();
	    sleep();
	    
	}	
	
	public void ClickAddedPriority(String xpath) throws InterruptedException {
		sleep();
		String priority = "//span[contains(text(),'"+xpath+"')]";
	    scrolltoElement(priority);
	    driver.findElement(By.xpath(priority)).click();


	}
	
	@FindBy(xpath = "//a[@data-test-id='priority-delete-trigger']") 
	WebElement PriorityDeleteLink;
	
	public void clickPriorityDeleteLink() throws InterruptedException {
		scrolltoElement(PriorityDeleteLink);
		PriorityDeleteLink.click();
	}

	@FindBy(xpath = "//button[@data-test-id='delete-dependants-primary-action']")
	WebElement DeleteConfirm;
	
	public void clickDeleteConfirm() throws InterruptedException{
		DeleteConfirm.click();
		Thread.sleep(5000);
	}
	

	public void ClickAddedStatus(String xpath) throws InterruptedException {
		sleep();
		String Status = "//div[contains(text(),'"+xpath+"')]";
	    scrolltoElement(Status);
	    driver.findElement(By.xpath(Status)).click();
	}
		
	@FindBy(xpath = "//a[@data-test-id='status-delete-trigger']")
	WebElement StatusDeleteLink;
		
	public void clickStatusDeleteLink() throws InterruptedException {  
		scrolltoElement(StatusDeleteLink);
		StatusDeleteLink.click();
	}

	@FindBy(xpath = "//div[@class='hf-avatar-image-container ember-view']//img[@class='hf-avatar-image hf-avatar-image_show']")
	WebElement Profile;
		
	public void clickProfile() throws InterruptedException{
		sleep();
		waitForVisible(Profile);
		Profile.click();
	}
	
	
	@FindBy(xpath = "//a[text()='Logout']")
	WebElement Logout;
		
	public void clickLogout() {
		Logout.click();
	}
	
	public void sleep() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	

		
	
	

}
