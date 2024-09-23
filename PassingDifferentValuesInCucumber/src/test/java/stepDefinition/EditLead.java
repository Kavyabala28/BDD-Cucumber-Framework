package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class EditLead extends CommonExecution{
	 
	@Given("Load the Url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps");
	}
	
	@Given("Enter Username {string}")
	public void enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter Password {string}")
	public void enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	
	@When("Click login")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When("Click crmsfa link")
	public void clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@When("Click Leads tab")
	public void leadsTab() {
		driver.findElement(By.linkText("Leads")).click();
	}
	
	@When("Click Find Leads")
	public void findLeads() {
		driver.findElement(By.linkText("Find Leads")).click();
	}
	
	@When("Click Phone Tab")
	public void phoneTab() {
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '] )[2]")).click();
	}
	
	@Given("Enter phoneNumber (.*)$")
	public void enterPhoneNumber(String phoneNum) {
		driver.findElement(By.name("phoneNumber")).sendKeys(phoneNum);
	}
	
	@When("Click Find Leads button")
	public void findLeadsBtn() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	}
	
	@When("Click Lead Id")
	public void clickLeadId() throws InterruptedException {
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
	}
	
	@When("Click Edit button")
	public void clickEditBtn() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}
	
	@Given("Enter CompanyName (.*)$")
	public void enterCompanyName(String cname) {
		WebElement updateCompanyName = driver.findElement(By.id("updateLeadForm_companyName"));
		updateCompanyName.clear();
		updateCompanyName.sendKeys(cname);
	}
	
	@When("Click Update button")
	public void clickUpdateBtn() {
		driver.findElement(By.className("smallSubmit")).click();
	}
}

