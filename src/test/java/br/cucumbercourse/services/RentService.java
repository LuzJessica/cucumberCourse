package br.cucumbercourse.services;

import java.util.Calendar;

import br.cucumbercourse.entities.Movie;
import br.cucumbercourse.entities.RentNote;
import br.cucumbercourse.entities.RentType;
import br.cucumbercourse.utils.DateUtils;

public class RentService {

	public RentNote rent(Movie movie, RentType rentType){
		if(movie.getStock() == 0){
			throw new RuntimeException("Movie without stock!");
		}
		RentNote rentNote = new RentNote();
		switch (rentType) {
		case COMMON:
			rentNote.setRentPrice(movie.getPrice() * 1);
			rentNote.setReturnDate(DateUtils.obtaingData(1));
			rentNote.setPontuation(1);			
			break;
		case EXTENDED:
			rentNote.setRentPrice(movie.getPrice() * 2);
			rentNote.setReturnDate(DateUtils.obtaingData(3));
			rentNote.setPontuation(2);	
			break;
		case WEEKLY:
			rentNote.setRentPrice(movie.getPrice() * 3);
			rentNote.setReturnDate(DateUtils.obtaingData(7));
			rentNote.setPontuation(3);	
			break;
		default:
			break;
		}
		
		
		movie.setStock(movie.getStock() - 1);
		return rentNote;

	}

}
