package br.cucumbercourse.services;

import java.util.Calendar;

import br.cucumbercourse.entities.Movie;
import br.cucumbercourse.entities.RentNote;
import br.cucumbercourse.utils.DateUtils;

public class RentService {

	public RentNote rent(Movie movie, String rentType){
		if(movie.getStock() == 0){
			throw new RuntimeException("Movie without stock!");
		}

		RentNote rentNote = new RentNote();
		if("extended".equals(rentType)){
			rentNote.setRentPrice(movie.getPrice() * 2);
			rentNote.setReturnDate(DateUtils.obtaingData(3));
			rentNote.setPontuation(2);
		} else if ("common".equals(rentType)){
			rentNote.setRentPrice(movie.getPrice());
			rentNote.setReturnDate(DateUtils.obtaingData(1));
			rentNote.setPontuation(1);
		}
		else{
			rentNote.setRentPrice(movie.getPrice());
			rentNote.setReturnDate(DateUtils.obtaingData(1));
		}

		movie.setStock(movie.getStock() - 1);
		return rentNote;

	}

}
