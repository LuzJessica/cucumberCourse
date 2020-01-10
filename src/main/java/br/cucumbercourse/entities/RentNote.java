package br.cucumbercourse.entities;

import java.util.Date;

public class RentNote {
	
	private int rentPrice;
	private Date returnDate;
	private String rentType;
	private int pontuation;

	public int getRentPrice() {
		return rentPrice;
	}

	public void setRentPrice(int rentPrice) {
		this.rentPrice = rentPrice;
	}

	public Date getReturnData() {
		return returnDate;
	}

	public void setReturnDate(Date time) {
		returnDate = time;
		
	}

	public String getRentType() {
		return rentType;
	}

	public void setRentType(String rentType) {
		this.rentType = rentType;
	}

	public void setPontuation(int pontuation) {
		this.pontuation = pontuation;
	}
	
	public int getPontuation() {
		return pontuation;
	}
	
}
