package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLead {
	
	public ChromeDriver driver;

	@Given("Launch browser")
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Given("Load the url")
	public void loadURL() {
		driver.get("http://leaftaps.com/opentaps/control/main");
	}
	
	@Given("Enter username")
	public void enterUserName() {
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	}
	
	@Given("Enter password")
	public void enterPassword() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
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
	
	@Given("Enter firstname")
	public void enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rio");
	}
	
	@Given("Enter lastname")
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
	}
	
	@Given("Enter companyname")
	public void enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys Limited");
	}
	
	@Given("Enter phone no")
	public void enterPhoneNum() {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9876543210");
	}
	
	@When("Click submit")
	public void clickSubmit() {
		driver.findElement(By.className("smallSubmit")).click();
	}
	
	@Given("Close Browser")
	public void closeBrowser() {
		driver.close();
	}
}

