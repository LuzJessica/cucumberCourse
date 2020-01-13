package br.cucumbercourse.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InsertAccountSteps {

	WebDriver driver = new ChromeDriver();
	
	@Given("^that I am accessing the application$")
	public void thatIAmAccessingTheApplication() throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\Documents\\particularDevs\\CursoCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		driver.get("https://srbarriga.herokuapp.com");
	
	}

	@When("^I inform the user \"([^\"]*)\"$")
	public void iInformTheUser(String arg1) throws Throwable {
		
		
		
	}

	@When("^the password \"([^\"]*)\"$")
	public void thePassword(String arg1) throws Throwable {
	}

	@When("^select enter$")
	public void selectEnter() throws Throwable {
	}

	@Then("^I view the main page$")
	public void iViewTheMainPage() throws Throwable {
	}

	@When("^I select Accounts$")
	public void iSelectAccounts() throws Throwable {
	}

	@When("^select Add$")
	public void selectAdd() throws Throwable {
	}

	@When("^inform an account \"([^\"]*)\"$")
	public void informAnAccount(String arg1) throws Throwable {
	}

	@When("^select Save$")
	public void selectSave() throws Throwable {
	}

	@Then("^the account is inserted with success$")
	public void theAccountIsInsertedWithSuccess() throws Throwable {
	}

}
