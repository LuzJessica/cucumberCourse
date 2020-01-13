package br.udemy.cucumbercourse.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users//user//Documents//particularDevs//CursoCucumber//src//test//resources//features//insertAccount.feature",
		glue = "br.cucumbercourse.steps",
		tags = "@ToDo",
		plugin = {"pretty","html:target/report.html", "json:target/report.json"},
		monochrome = true,
		snippets = SnippetType.CAMELCASE
		)
		
public class RunnerTest {
	
	
	

}
