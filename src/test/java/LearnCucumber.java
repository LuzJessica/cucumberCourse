

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
	
	Date delivery = new Date();
	
	@Given("^that the delivery due date is in (\\d+)/(\\d+)/(\\d+)$")
	public void thatTheDeliveryDueDateIsIn(int day, int month, int year) throws Throwable {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, day);
		calendar.set(Calendar.MONTH, month -1 ); //no java o mes começa a contar de 0
		calendar.set(Calendar.YEAR, year);
		
		delivery = calendar.getTime();
	   
	}

	@When("^the package delay (\\d+) (.+)$")
	public void thePackageDelayDays(int arg1, String time) throws Throwable {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(delivery);
		if(time.equals("days")){
			calendar.add(Calendar.DAY_OF_MONTH, arg1);
		}
		if(time.equals("months")){
			calendar.add(Calendar.MONTH, arg1);
		}
		delivery = calendar.getTime();
	}

	@Then("^the delivery will be done in (\\d{2}\\/\\d{2}\\/\\d{4})$")
	public void theDeliveryWillBeDoneIn(String date) throws Throwable {
	    DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	    String formatedDate = format.format(delivery);
	    Assert.assertEquals(date, formatedDate);
	}
	
	

}
