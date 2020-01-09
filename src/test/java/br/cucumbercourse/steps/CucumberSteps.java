package br.cucumbercourse.steps;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.cucumbercourse.converters.DateConverter;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CucumberSteps {

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

	@Given("^that the delivery due date is in (.*)$")
	public void thatTheDeliveryDueDateIsIn(@Transform(DateConverter.class)Date date) throws Throwable {
		delivery = date;
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

	@Given("^that the( special)? ticket is A.(\\d{3})$")
	public void thatTheTicketIsAF(String type,int arg2) throws Throwable {

	}

	@Given("^that the ticket value is R\\$ (.*)$")
	public void thatTheTicketValueIsR$(Double value) throws Throwable {

	}

	@Given("^that the passenger name is \"(.{5,20})\"$")
	public void thatThePassengerNameIs(String arg1) throws Throwable {

	}

	@Given("^that the passenger telephone is 9(\\d{3})-(\\d{4})$")
	public void thatThePassengerTelephoneIs(int arg1, int arg2) throws Throwable {

	}

	@When("^create the steps$")
	public void createTheSteps() throws Throwable {

	}

	@Then("^the test will work$")
	public void theTestWillWork() throws Throwable {

	}

	int movieUnitsInStock = 0;
	Double moviePrice = 0.0;
	String rentType = "";
	Double rentPrice = 0.0;
	Double moviePriceAfterRent = 0.0;
	Double moviePriceAfterExtendedRent = 0.0;
	int movieUnitsInStockAfterRent = 0;
	String returnDate = "";
	int rentPontuation = 0;

	@Given("^a movie with (\\d+) units in stock$")
	public void aMovieWithUnitsInStock(int arg1) throws Throwable {

		movieUnitsInStock = arg1;

	}

	@Given("^that the rent price is R\\$ (.*)$")
	public void thatTheRentPriceIsR$(Double arg1) throws Throwable {
		moviePrice = arg1;

	}

	@Given("^the rent type is (.*)$")
	public void theRentTypeIsExtended(String arg1) throws Throwable {
		rentType = arg1;
	}

	@When("^rent$")
	public void rent() throws Throwable {

		if(movieUnitsInStock !=0){
			if(rentType.equals("extended")){
				moviePriceAfterRent = moviePrice * 2;
				returnDate = "in 3 days";
				rentPontuation = 2;
			}else{
			moviePriceAfterRent = moviePrice * 1;
			movieUnitsInStockAfterRent = movieUnitsInStock - 1;
			returnDate = "on next day";
			}
		}
	}

	@Then("^the rent price will be R\\$ (.*)$")
	public void theRentPriceWillBeR$(Double arg1) throws Throwable {
		Assert.assertEquals(arg1, moviePriceAfterRent);
	}

	@Then("^the return date will be (.*)$")
	public void theReturnDateWillBeOnNextDay(String arg1) throws Throwable {
		Assert.assertEquals(arg1, returnDate);
	}

	@Then("^the stock of movie will be (\\d+) unit$")
	public void theStockOfMovieWillBeUnit(int arg1) throws Throwable {
		Assert.assertEquals(arg1, movieUnitsInStockAfterRent);
	}

	@Then("^wont be able because does not have stock$")
	public void wontBeAbleBecauseDoesNotHaveStock() throws Throwable {

	}

	@Then("^the return date will be (\\d+) days$")
	public void theReturnDateWillBeInDays(int arg1) throws Throwable {

		Assert.assertEquals(arg1, returnDate);
	}

	@Then("^the received pontuation will be (\\d+) points$")
	public void theReceivedPontuationWillBePoints(int arg1) throws Throwable {
		Assert.assertEquals(arg1, rentPontuation);
	}

}
