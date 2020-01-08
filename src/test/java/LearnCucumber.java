
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LearnCucumber {
	
	@Given("^that I created the file correctly$")
	public void thatICreatedTheFileCorrectly() throws Throwable {
	    
	}

	@When("^I execute this$")
	public void iExecuteThis() throws Throwable {
	    
	}

	@Then("^the specification should finish succesfully$")
	public void theSpecificationShouldFinishSuccesfully() throws Throwable {
	    
	}
	
	private int count = 0;
	@Given("^that counter value is (\\d+)$")
	public void thatCounterValueIs(int arg1) throws Throwable {
	      count = arg1;   
	}

	 
	@When("^I increment with (\\d+)$")
	public void iIncrementWith(int arg1) throws Throwable {
	    count += arg1;
	}

	@Then("^the counter value will be (\\d+)$")
	public void theCounterValueWillBe(int arg1) throws Throwable {
		System.out.println(count);
		System.out.println(arg1);
	}
	
	

}
