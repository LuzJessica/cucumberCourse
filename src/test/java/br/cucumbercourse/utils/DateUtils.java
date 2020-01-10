package br.cucumbercourse.utils;

import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	
	public static Date obtaingData(int days){
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, 1);
		return calendar.getTime();
	}

}
