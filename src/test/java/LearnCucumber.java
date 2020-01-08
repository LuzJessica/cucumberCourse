
import org.junit.Assert;

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
	private int division = 0;
	private int multiplication = 0;
	@Given("^that counter value is (\\d+)$")
	public void thatCounterValueIs(int arg1) throws Throwable {
	      count = arg1;   
	}

	 
	@When("^I increment with (\\d+)$")
	public void iIncrementWith(int arg1) throws Throwable {
	    count += arg1;
	}
	

	@Then("^the counter incremented value will be (\\d+)$")
	public void theCounterIncrementedValueWillBe(int arg1) throws Throwable {
		Assert.assertFalse(arg1==count);
	}
	
	@When("^I decrement with (\\d+)$")
	public void iDecrementWith(int arg1) throws Throwable {
	    count -= arg1;
	}
	
	@Then("^the counter decremented value will be (\\d+)$")
	public void theCounterDecrementedValueWillBe(int arg1) throws Throwable {
		Assert.assertTrue(arg1==10);
	}
	
	@When("^I divide by (\\d+)$")
	public void iDivideBy(int arg1) throws Throwable {
	    division = count/arg1;
	}
	
	@Then("^the counter divided by value will be (\\d+)$")
	public void theCounterDividedByValueWillBe(int arg1) throws Throwable {
	   Assert.assertEquals(arg1, division);
	}
	
	@When("^I multiplicate by (\\d+)$")
	public void iMultiplicateBy(int arg1) throws Throwable {
		multiplication = count * arg1;
	}

	@Then("^the counter multiplicated by value will be (\\d+)$")
	public void theCounterMultiplicatedByValueWillBe(int arg1) throws Throwable {
		Assert.assertNotEquals(arg1, multiplication);
	}

}
