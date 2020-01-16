package br.udemy.cucumbercourse.runners;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users//user//Documents//particularDevs//CursoCucumber//src//test//resources//features//",
		glue = "br.cucumbercourse.steps",
		tags = {"@functionalTests"},
		plugin = {"pretty","html:target/report.html", "json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false
		)
public class RunnerFunctionalTest {
	
	@BeforeClass
	public static void resetDataBase(){
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\user\\Documents\\particularDevs\\CursoCucumber\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://srbarriga.herokuapp.com");
		driver.findElement(By.id("email")).sendKeys("jessica.luz@matera.com");
		driver.findElement(By.id("senha")).sendKeys("102011jcs");
		driver.findElement(By.tagName("button")).click();
		driver.findElement(By.linkText("reset")).click();
		driver.quit();
	}

}
