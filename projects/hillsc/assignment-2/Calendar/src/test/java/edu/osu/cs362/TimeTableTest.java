package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
	      //Calendar cal = Calendar.getInstance();

	      int thisMonth;
	      int thisYear;
	      int thisDay;
	      Calendar rightnow = Calendar.getInstance();
		//current month/year/date is today
	      thisMonth = rightnow.get(Calendar.MONTH)+1;
	    	    thisYear = rightnow.get(Calendar.YEAR);
	    	    thisDay = rightnow.get(Calendar.DAY_OF_MONTH);

		    GregorianCalendar today = new GregorianCalendar(thisYear, thisMonth, thisDay);
		    GregorianCalendar tomorrow = (GregorianCalendar)today.clone();
		    tomorrow.add(Calendar.DAY_OF_MONTH, 1);
		    CalDay cal_day = new CalDay(today);

	      int startHour=8;
	      int startMinute=45;
	      int startDay=2;
	      int startMonth=3;
	      int startYear=2014;
	      String title="Birthday Party";
	      String description="This is someone's birthday party.";
	      Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);

	      cal_day.addAppt(appt);

	      assertEquals(thisMonth, cal_day.getMonth());
	      assertEquals(thisYear, cal_day.getYear());
	      assertEquals(thisDay, cal_day.getDay());
	      assertEquals(1, cal_day.getSizeAppts());
	      assertTrue(cal_day.isValid());

	   
	      TimeTable timeTable = new TimeTable();

	      LinkedList<Appt> listAppts = new LinkedList<Appt>();
	      listAppts.add(appt);
	      listAppts.add(appt);

	      LinkedList<CalDay> cal_days = new LinkedList<CalDay>();
	      cal_days = timeTable.getApptRange(listAppts, today, tomorrow);


	      



	 }

}
