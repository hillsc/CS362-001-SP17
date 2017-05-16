package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.*;


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

	      //test invalid calday contrsuctor
	      CalDay invalidCalDay = new CalDay();
	      String invalidCalDay_printout = invalidCalDay.toString();
	      //Iterator<Appt> tmp = invalidCalDay.iterator();
	      Iterator<?> iterator_invalid = invalidCalDay.iterator();
	      assertNull(iterator_invalid);

	      Iterator<?> iterator_today = cal_day.iterator();
	      assertNotNull(iterator_today);

	      String cal_day_printout = cal_day.toString(); 

	      assertEquals("\t --- " + thisMonth + "/" + thisDay + "/" + thisYear + " --- \n --- -------- Appointments ------------ --- \n\n", cal_day_printout);
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

	      int startHour2=17;
	      int startMinute2=15;
	      int startDay2=24;
	      int startMonth2=9;
	      int startYear2=2016;
	      String title2="dentist";
	      String description2="clean teeth";
	      Appt appt2 = new Appt(startHour2, startMinute2, startDay2, startMonth2, startYear2, title2, description2);

	      cal_day.addAppt(appt2);

	      //assertEquals(thisMonth, cal_day.getMonth());
	      //assertEquals(thisYear, cal_day.getYear());
	      //assertEquals(thisDay, cal_day.getDay());
	      assertEquals(2, cal_day.getSizeAppts());
	      assertTrue(cal_day.isValid());

	      cal_day_printout = cal_day.toString(); 
	      System.out.println(cal_day.toString());

	      assertEquals("\t --- " + thisMonth + "/" + thisDay + "/" + thisYear + " --- \n --- -------- Appointments ------------ --- \n\t4/10/2017 at 1:30pm ,Birthday Party, This is someone's birthday party.\n \t9/24/2016 at 5:15pm ,dentist, clean teeth\n \n", cal_day_printout);

		 //assertEquals("\t1/19/2016 at 11:20am ,dentist, clean teeth\n", apptString);

	      //test new cal day with appts

	      
	      int startHour3=15;
	      int startMinute3=15;
	      int startDay3=24;
	      int startMonth3=9;
	      int startYear3=2016;
	      String title3="doctor";
	      String description3="checkup";
	      Appt appt3 = new Appt(startHour3, startMinute3, startDay3, startMonth3, startYear3, title3, description3);

	      cal_day.addAppt(appt3);

	      cal_day_printout = cal_day.toString(); 
		assertEquals("\t --- " + thisMonth + "/" + thisDay + "/" + thisYear + " --- \n --- -------- Appointments ------------ --- \n\t4/10/2017 at 1:30pm ,Birthday Party, This is someone's birthday party.\n \t9/24/2016 at 3:15pm ,doctor, checkup\n \t9/24/2016 at 5:15pm ,dentist, clean teeth\n \n", cal_day_printout);

	      int startHour4=15;
	      int startMinute4=15;
	      int startDay4=24;
	      int startMonth4=9;
	      int startYear4=2016;
	      String title4="hw";
	      String description4="demo";
	      Appt appt4 = new Appt(startHour4, startMinute4, startDay4, startMonth4, startYear4, title4, description4);

	      cal_day.addAppt(appt4);

	      cal_day_printout = cal_day.toString(); 
		assertEquals("\t --- " + thisMonth + "/" + thisDay + "/" + thisYear + " --- \n --- -------- Appointments ------------ --- \n\t4/10/2017 at 1:30pm ,Birthday Party, This is someone's birthday party.\n \t9/24/2016 at 3:15pm ,doctor, checkup\n \t9/24/2016 at 3:15pm ,hw, demo\n \t9/24/2016 at 5:15pm ,dentist, clean teeth\n \n", cal_day_printout);




	 }
}
	
