package br.cucumbercourse.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InsertAccountSteps {

	private WebDriver driver;
	
	@Given("^that I am accessing the application$")
	public void thatIAmAccessingTheApplication() throws Throwable {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\Documents\\particularDevs\\CursoCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
		
		
	}

	@When("^I inform the user (.*)$")
	public void iInformTheUserJessicaluzGecInatelBr(String arg1) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^the password (.*)$")
	public void thePasswordJcs(String arg1) throws Throwable {
		driver.findElement(By.id("senha")).sendKeys(arg1);
	}

	@When("^select enter$")
	public void selectEnter() throws Throwable {
		driver.findElement(By.tagName("button")).click();
	}

	@Then("^I view the main page$")
	public void iViewTheMainPage() throws Throwable {
		String homepageText = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		
		Assert.assertEquals("Bem vindo, Jéssica!", homepageText);
	}

	@When("^I select Accounts$")
	public void iSelectAccounts() throws Throwable {
		driver.findElement(By.linkText("Contas")).click();
;	}

	@When("^select Add$")
	public void selectAdd() throws Throwable {
		driver.findElement(By.linkText("Adicionar")).click();
	}

	@When("^inform an account (.*)$")
	public void informAnAccount(String arg1) throws Throwable {
		driver.findElement(By.id("nome")).sendKeys(arg1);;
	}

	@When("^select Save$")
	public void selectSave() throws Throwable {
		driver.findElement(By.tagName("button")).click();
	}

	@Then("^the account is inserted with success$")
	public void theAccountIsInsertedWithSuccess() throws Throwable {
		
		String successText = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals("Conta adicionada com sucesso!", successText);
		
	}
	
	@Then("^I am notified that the account name is mandatory$")
	public void iAmNotifiedThatTheAccountNameIsMandatory() throws Throwable {
		
		String mandatoryNameText = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Informe o nome da conta", mandatoryNameText);
	}
	
	@Then("^I am notified that an account with the same name already exists$")
	public void iAmNotifiedThatAnAccountWithTheSameNameAlreadyExists() throws Throwable {
		
		String mandatoryNameText = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Já existe uma conta com esse nome!", mandatoryNameText);
	}

}
