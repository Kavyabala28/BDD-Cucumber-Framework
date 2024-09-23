package stepDefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLead extends CommonExecution{
	
	@Given("Load the url")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@Given("Enter username {string}")
	public void enterUserName(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
	}
	
	@Given("Enter password {string}")
	public void enterPassword(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}
	
	@When("Click Login")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@When("Click crmsfa")
	public void clickCRMSFA() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	
	@When("Click create Lead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	
	@Given("Enter firstname (.*)$")
	public void enterFirstName(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
	}
	
	@Given("Enter lastname (.*)$")
	public void enterLastName(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
	}
	
	@Given("Enter companyname (.*)$")
	public void enterCompanyName(String cname) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
	}
	
	@Given("Enter phone no (.*)$")
	public void enterPhoneNum(String phoneNum) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phoneNum);
	}
	
	@When("Click submit")
	public void clickSubmit() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	
}
