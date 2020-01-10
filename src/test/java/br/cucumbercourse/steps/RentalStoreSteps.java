package br.cucumbercourse.steps;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.cucumbercourse.entities.Movie;
import br.cucumbercourse.entities.RentNote;
import br.cucumbercourse.services.RentService;
import br.cucumbercourse.utils.DateUtils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RentalStoreSteps {
	
	private Movie movie;
	private RentService rent = new RentService();
	private RentNote rentNote;
	private String error;
	private String rentType;
	
	@Given("^a movie with (\\d+) units in stock$")
	public void aMovieWithUnitsInStock(int arg1) throws Throwable {
		movie = new Movie();
		movie.setStock(arg1);
	}

	@Given("^that the rent price is R\\$ (\\d+)$")
	public void thatTheRentPriceIsR$(int arg1) throws Throwable {
		movie.setPrice(arg1);
	}

	@When("^rent$")
	public void rent() throws Throwable {
		try {
			rentNote = rent.rent(movie, rentType);
		} catch (RuntimeException e) {
			error = e.getMessage();
		}
	}

	@Then("^the rent price will be R\\$ (\\d+)$")
	public void theRentPriceWillBeR$(int arg1) throws Throwable {
		Assert.assertEquals(arg1, rentNote.getRentPrice() );
	}


	@Then("^the stock of movie will be (\\d+) unit$")
	public void theStockOfMovieWillBeUnit(int arg1) throws Throwable {
		Assert.assertEquals(arg1, movie.getStock());
	}

	@Then("^wont be able because does not have stock$")
	public void wontBeAbleBecauseDoesNotHaveStock() throws Throwable {
		Assert.assertEquals("Movie without stock!", error);
		
	}

	@Given("^the rent type is extended$")
	public void theRentTypeIsExtended() throws Throwable {
		rentType = "extended";
	}

	@Then("^the return date will be in (\\d+) days?$")
	public void theReturnDateWillBeInDays(int arg1) throws Throwable {
		Date returnDate = DateUtils.obtaingData(arg1);
		Date rentDate = rentNote.getReturnData();
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		
		Assert.assertEquals(format.format(returnDate), format.format(rentDate));
	}

	@Then("^the received pontuation will be (\\d+) points$")
	public void theReceivedPontuationWillBePoints(int arg1) throws Throwable {
		
		Assert.assertEquals(arg1, rentNote.getPontuation());
	}
	
	@Given("^the rent type is common$")
	public void theRentTypeIsCommon() throws Throwable {
		rentType = "common";
	}

}