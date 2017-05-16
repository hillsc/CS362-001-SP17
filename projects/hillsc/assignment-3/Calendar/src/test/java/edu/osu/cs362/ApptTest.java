package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
		 appt.setStartDay(19);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(1);
		 assertEquals(true, appt.getValid());
		 appt.setStartYear(2016);
		 assertEquals(true, appt.getValid());
		 appt.setStartHour(3);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(20);
		 assertEquals(true, appt.getValid());
		
		 assertEquals(3, appt.getStartHour());
		 assertEquals(20, appt.getStartMinute());
		 assertEquals(19, appt.getStartDay());
		 assertEquals(01, appt.getStartMonth());
		 assertEquals(2016, appt.getStartYear());
		 if (!appt.getValid()){
		     throw new Exception("Object is not valid but should be");
		 }
		 appt.setTitle("dentist");
		 appt.setDescription("clean teeth");

		 String apptString = appt.toString();
		 assertEquals(true, appt.getValid());
		 assertEquals("\t1/19/2016 at 3:20am ,dentist, clean teeth\n", apptString);
		 
		 //test hour > 12
		 appt.setStartHour(14);
		 apptString = appt.toString();
		 assertEquals(true, appt.getValid());
		 assertEquals("\t1/19/2016 at 2:20pm ,dentist, clean teeth\n", apptString);


		 //test hour > 24
		 appt.setStartHour(29);
		 apptString = appt.toString();
		 assertEquals(false, appt.getValid());
		 
		 //test hour < 0
		 appt.setStartHour(-1);
		 apptString = appt.toString();
		 assertEquals(false, appt.getValid());


		 //test hour == 0
		 appt.setStartHour(0);
		 apptString = appt.toString();
		 assertEquals(true, appt.getValid());

		 assertEquals("\t1/19/2016 at 12:20am ,dentist, clean teeth\n", apptString);
		 
		 //test hour == 11
		 appt.setStartHour(11);
		 apptString = appt.toString();
		 assertEquals(true, appt.getValid());

		 assertEquals("\t1/19/2016 at 11:20am ,dentist, clean teeth\n", apptString);



		 
		 //test mutations of month check
		 appt.setStartMonth(13);
		 assertEquals(false, appt.getValid());
		 appt.setStartMonth(-1);
		 assertEquals(false, appt.getValid());
		 appt.setStartMonth(8);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(1);
		 assertEquals(true, appt.getValid());
		 appt.setStartMonth(12);
		 assertEquals(true, appt.getValid());



		 //test mutations of day check
		 appt.setStartDay(40);
		 assertEquals(false, appt.getValid());
		 appt.setStartDay(-1);
		 assertEquals(false, appt.getValid());
		 appt.setStartDay(11);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(1);
		 assertEquals(true, appt.getValid());
		 appt.setStartDay(31);
		 assertEquals(true, appt.getValid());

		 
		 //test mutations of minute check
		 appt.setStartMinute(71);
		 assertEquals(false, appt.getValid());
		 appt.setStartMinute(-1);
		 assertEquals(false, appt.getValid());
		 appt.setStartMinute(12);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(0);
		 assertEquals(true, appt.getValid());
		 appt.setStartMinute(59);
		 assertEquals(true, appt.getValid());


		 //test mutations of year
		 appt.setStartYear(2000);
		 assertEquals(true, appt.getValid());
		
		 //test mutations of hour check
		 appt.setStartHour(42);
		 assertEquals(false, appt.getValid());
		 appt.setStartHour(-1);
		 assertEquals(false, appt.getValid());
		 appt.setStartHour(3);
		 assertEquals(true, appt.getValid());
		 appt.setStartHour(0);
		 assertEquals(true, appt.getValid());
		 appt.setStartHour(23);
		 assertEquals(true, appt.getValid());




		 
		 appt.setTitle(null);
		 appt.setDescription(null);

		 //test negative value for equivalent mutation
		 //appt.setStartMonth(-1);
		 //assertEquals(false, appt.getValid());
		 //appt.setStartDay(-1);
		 //assertEquals(false, appt.getValid());
		 //appt.setStartMinute(-1);
		 //assertEquals(false, appt.getValid());
		 //appt.setStartYear(-1);
		 //assertEquals(false, appt.getValid());
		 //appt.setStartHour(-1);
		 //assertEquals(false, appt.getValid());
		 
		 appt.setStartMonth(8);
		 appt.setStartDay(12);
		 appt.setStartMinute(19);
		 appt.setStartYear(2016);
		 appt.setStartHour(17);
		 appt.setTitle("dentist");
		 appt.setDescription("clean teeth");


		 if (!appt.getValid()){
		     throw new Exception("Object is not valid but should be");
		 }
		 
		 appt.setStartMonth(-1);
		 appt.setStartDay(-1);
		 appt.setStartMinute(-1);
		 appt.setStartYear(-1);
		 appt.setStartHour(-1);
		 appt.setTitle(null);
		 appt.setDescription(null);


		 if (appt.getValid()){
		     throw new Exception("Object is valid but shouldn't be");
		 }

	 }


	
}
