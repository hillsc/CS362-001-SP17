package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.*;


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
		    GregorianCalendar nextWeek = (GregorianCalendar)today.clone();
		    nextWeek.add(Calendar.DAY_OF_MONTH, 7);

		    CalDay cal_day = new CalDay(today);

		    
	      GregorianCalendar tmp = (GregorianCalendar)today.clone();
	      tmp.add(Calendar.DAY_OF_MONTH, 2);
	

	      int startHour=8;
	      int startMinute=45;
	      int startDay=tmp.get(Calendar.DAY_OF_MONTH);;
	      int startMonth=tmp.get(Calendar.MONTH);
	      int startYear=tmp.get(Calendar.YEAR);
	      String title="Birthday Party";
	      String description="This is someone's birthday party.";
	      Appt appt = new Appt(startHour, startMinute, startDay, startMonth, startYear, title, description);

	      cal_day.addAppt(appt);

	      assertEquals(thisMonth, cal_day.getMonth());
	      assertEquals(thisYear, cal_day.getYear());
	      assertEquals(thisDay, cal_day.getDay());
	      assertEquals(1, cal_day.getSizeAppts());
	      assertTrue(cal_day.isValid());
	      
	      GregorianCalendar tmp2 = (GregorianCalendar)today.clone();
	      tmp2.add(Calendar.DAY_OF_MONTH, 5);

	      int startHour2=17;
	      int startMinute2=15;
	      int startDay2=tmp2.get(Calendar.DAY_OF_MONTH);;
	      int startMonth2=tmp2.get(Calendar.MONTH);
	      int startYear2=tmp2.get(Calendar.YEAR);

	      String title2="dentist";
	      String description2="clean teeth";
	      Appt appt2 = new Appt(startHour2, startMinute2, startDay2, startMonth2, startYear2, title2, description2);

	      cal_day.addAppt(appt2);
		
	      GregorianCalendar tmp3 = (GregorianCalendar)today.clone();
	      tmp3.add(Calendar.DAY_OF_MONTH, 3);


	      int startHour3=15;
	      int startMinute3=15;
	      int startDay3=tmp3.get(Calendar.DAY_OF_MONTH);;
	      int startMonth3=tmp3.get(Calendar.MONTH);
	      int startYear3=tmp3.get(Calendar.YEAR);

	      String title3="doctor";
	      String description3="checkup";
	      Appt appt3 = new Appt(startHour3, startMinute3, startDay3, startMonth3, startYear3, title3, description3);

	      cal_day.addAppt(appt3);

	      GregorianCalendar tmp4 = (GregorianCalendar)today.clone();
	      tmp4.add(Calendar.DAY_OF_MONTH, 10);


	      int startHour4=8;
	      int startMinute4=15;
	      int startDay4=tmp4.get(Calendar.DAY_OF_MONTH);;
	      int startMonth4=tmp4.get(Calendar.MONTH);
	      int startYear4=tmp4.get(Calendar.YEAR);

	      String title4="outrage";
	      String description4="doesntmatter";
	      Appt appt4 = new Appt(startHour4, startMinute4, startDay4, startMonth4, startYear4, title4, description4);

	      cal_day.addAppt(appt4);
		
	      GregorianCalendar tmp5 = (GregorianCalendar)today.clone();
	      tmp5.add(Calendar.DAY_OF_MONTH, -4);

	      int startHour5=28;
	      int startMinute5=15;
	      int startDay5=tmp5.get(Calendar.DAY_OF_MONTH);;
	      int startMonth5=tmp5.get(Calendar.MONTH);
	      int startYear5=tmp5.get(Calendar.YEAR);

	      String title5="outrage";
	      String description5="doesntmatter";
	      Appt appt5 = new Appt(startHour5, startMinute5, startDay5, startMonth5, startYear5, title5, description5);

	      cal_day.addAppt(appt5);


	      TimeTable timeTable = new TimeTable();

	      LinkedList<Appt> listAppts = new LinkedList<Appt>();
	      listAppts.add(appt);
	      listAppts.add(appt2);
	      listAppts.add(appt3);
	      listAppts.add(appt4);

	      LinkedList<CalDay> cal_days = new LinkedList<CalDay>();
	      cal_days = timeTable.getApptRange(listAppts, today, nextWeek);

	      assertEquals(7, cal_days.size());
	      assertEquals(false, cal_days.isEmpty());
	      //test deleteAppt
	      for (int i=0; i < cal_days.size(); i++){
		    System.out.println(cal_days.get(i).toString());
	      }
	      try {
		  if(cal_days.get(2).getSizeAppts() == 0){
		     throw new Exception("Object is empty");
		}
	      } catch (Exception e){
	      }
	      if(cal_days.get(0).getSizeAppts() != 0){
		     throw new Exception("Object should be empty");
		}
	      if(cal_days.get(1).getSizeAppts() != 0){
		     throw new Exception("Object should be empty");
		}
	      if(cal_days.get(2).getSizeAppts() != 1){
		     throw new Exception("Object is null");
		}
	      if(cal_days.get(3).getSizeAppts() != 1){
		     throw new Exception("Object is null");
		}
	      if(cal_days.get(4).getSizeAppts() != 0){
		     throw new Exception("Object should be empty");
		}
	      if(cal_days.get(5).getSizeAppts() != 1){
		     throw new Exception("Object is null");
		}
	      if(cal_days.get(6).getSizeAppts() != 0){
		     throw new Exception("Object should be empty");
		}




	      LinkedList<Appt> listAppts2 = new LinkedList<Appt>();
	      listAppts2 = timeTable.deleteAppt(listAppts, appt2);
	      assertEquals(false, listAppts2.isEmpty());
	      if(listAppts2 == null){
		     throw new Exception("Object is null");
		}
	      if(listAppts2.size() == 0){
		     throw new Exception("Object is empty");
		}
	      if(listAppts2.size() != 3){
		     throw new Exception("Object is not proper size");
		}
	      if (!appt.equals(listAppts2.get(0))){
		     throw new Exception("Object is not proper");
	      }
	      if (!appt3.equals(listAppts2.get(1))){
		     throw new Exception("Object is not proper");
	      }
	      if (!appt4.equals(listAppts2.get(2))){
		     throw new Exception("Object is not proper");
	      }




	      LinkedList<Appt> emptyList = new LinkedList<Appt>();
	      listAppts2 = timeTable.deleteAppt(emptyList, appt2);
	      try {
		timeTable.deleteAppt(emptyList, appt2);
	      } catch (Exception e){
	      }

	      if(listAppts2 != null){
		     throw new Exception("Object is not null");
		}
	      //assertEquals(true, listAppts2.isEmpty());
	    
	      
	      LinkedList<Appt> listAppts3 = new LinkedList<Appt>();
	      listAppts3.add(appt5);

	      cal_days = timeTable.getApptRange(listAppts3, today, nextWeek);
	      try {
		cal_days = timeTable.getApptRange(listAppts, tomorrow, today);
	      } catch (Exception e){
	      }
	      try {
		cal_days = timeTable.getApptRange(listAppts, today, today);
	      } catch (Exception e){
	      }
	      try {
		cal_days = timeTable.getApptRange(listAppts, nextWeek, today);
	      } catch (Exception e){
	      }

	      
	 }

}
