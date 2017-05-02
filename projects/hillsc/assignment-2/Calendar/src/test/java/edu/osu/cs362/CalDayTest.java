package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {

	 @Test
	  public void test01()  throws Throwable  {


//	      Calendar cal = Calendar.getInstance();

	      int thisMonth;
	      int thisYear;
	      int thisDay;
	      Calendar rightnow = Calendar.getInstance();
		//current month/year/date is today
	      thisMonth = rightnow.get(Calendar.MONTH)+1;
	    	    thisYear = rightnow.get(Calendar.YEAR);
	    	    thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

		    GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
		    CalDay cal_day = new CalDay(today);

	      int startHour=13;
	      int startMinute=30;
	      int startDay=10;
	      int startMonth=4;
	      int startYear=2017;
	      String title="Birthday Party";
	      String description="This is someone's birthday party.";
	      Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);

	      cal_day.addAppt(appt);

	      assertEquals(thisMonth, cal_day.getMonth());
	      assertEquals(thisYear, cal_day.getYear());
	      assertEquals(thisDay, cal_day.getDay());
	      assertEquals(1, cal_day.getSizeAppts());
	      assertTrue(cal_day.isValid());

	      System.out.println(cal_day.toString());
	      



	 }
}
	
