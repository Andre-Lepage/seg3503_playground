import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_tc01() {
    Date today = new Date(1700, 6, 20);
    Date expectedTomorrow = new Date(1700, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc02() {
    Date today = new Date(2005, 4, 15);
    Date expectedTomorrow = new Date(2005, 4, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc03() {
    Date today = new Date(1901, 7, 20);
    Date expectedTomorrow = new Date(1901, 7, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc04() {
    Date today = new Date(3456, 3, 27);
    Date expectedTomorrow = new Date(3456, 3, 28);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc05() {
    Date today = new Date(1500, 2, 17);
    Date expectedTomorrow = new Date(1500, 2, 18);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc06() {
    Date today = new Date(1700, 6, 29);
    Date expectedTomorrow = new Date(1700, 6, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc07() {
    Date today = new Date(1800, 11, 29);
    Date expectedTomorrow = new Date(1800, 11, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc08() {
    Date today = new Date(3453, 1, 29);
    Date expectedTomorrow = new Date(3453, 1, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc09() {
    Date today = new Date(444, 2, 29);
    Date expectedTomorrow = new Date(444, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc10() {
    Date today = new Date(2005, 4, 30);
    Date expectedTomorrow = new Date(2005, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc11() {
    Date today = new Date(3453, 1, 30);
    Date expectedTomorrow = new Date(3453, 1, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc12() {
    Date today = new Date(3456, 3, 30);
    Date expectedTomorrow = new Date(3456, 3, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc13() {
    Date today = new Date(1901, 7, 31);
    Date expectedTomorrow = new Date(1901, 8, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc14() {
    Date today = new Date(3453, 1, 31);
    Date expectedTomorrow = new Date(3453, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc15() {
    Date today = new Date(3456, 12, 31);
    Date expectedTomorrow = new Date(3457, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc16() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 31)
    );
  }

  @Test
  void nextDate_invalid_tc17() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 29)
    );
  }

  @Test
  void nextDate_invalid_tc18() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(-1, 10, 20)
    );
  }

  @Test
  void nextDate_invalid_tc19() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1458, 15, 12)
    );
  }

  @Test
  void nextDate_invalid_tc20() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, -50)
    );
  }

  @Test
	  void setDay_DayAbove_31() {
	    assertThrows(
	      IllegalArgumentException.class,
	      () -> new Date(2020, 1, 32)
	    );
	  }
	
	@Test
	  void setDay_DayAbove30_IsThirtyDayMonth() {
	    assertThrows(
	      IllegalArgumentException.class,
	      () -> new Date(2020, 4, 31)
	    );
	  }
	
	@Test
	  void setDay_DayAbove29_IsLeapYear() {
	    assertThrows(
	      IllegalArgumentException.class,
	      () -> new Date(2020, 2, 30)
	    );
	  }
	
	@Test
	  void toString_date() {
	    Date date = new Date(3456, 12, 31);
	    assertEquals("3456/December/31", date.toString());
	  }
	
	@Test
	  void equals_string_false() {
	    Date date = new Date(3456, 12, 31);
	    String string = "hello world";
	    assertFalse(date.equals(string));
	  }
	
	@Test
	  void equals_date_true() {
	    Date date1 = new Date(3456, 12, 31);
	    Date date2 = new Date(3456, 12, 31);
	    assertTrue(date1.equals(date2));
	  }
	
	@Test
	  void equals_date_false_differentYear() {
	    Date date1 = new Date(3456, 12, 31);
	    Date date2 = new Date(3455, 11, 15);
	    assertFalse(date1.equals(date2));
	  }
	
	@Test
	  void equals_date_false_differentMonth() {
	    Date date1 = new Date(3456, 12, 31);
	    Date date2 = new Date(3456, 11, 15);
	    assertFalse(date1.equals(date2));
	  }
	
	@Test
	  void equals_date_false_differentDay() {
	    Date date1 = new Date(3456, 12, 31);
	    Date date2 = new Date(3456, 12, 15);
	    assertFalse(date1.equals(date2));
	  }
	
	@Test
	  void isLeapYear_true_notCentury() {
	    Date date = new Date(2020, 12, 31);
	    assertTrue(date.isLeapYear());
	}
	
	@Test
	  void isLeapYear_true_century() {
	    Date date = new Date(2000, 12, 31);
	    assertTrue(date.isLeapYear());
	}
	
	@Test
	  void setMonth_negative1() {
	    assertThrows(
	  	      IllegalArgumentException.class,
	  	      () -> new Date(3456, -1, 31)
	  	    );
	    
	  }
	
	@Test
	  void nextDate_notLeap_28th() {
	    Date today = new Date(2021, 2, 28);
	    Date expectedTomorrow = new Date(2021, 3, 1);
	    assertEquals(expectedTomorrow, today.nextDate());
	  }
	
	@Test
	  void nextDate_30DayMonth_6() {
	    Date today = new Date(2021, 6, 30);
	    Date expectedTomorrow = new Date(2021, 7, 1);
	    assertEquals(expectedTomorrow, today.nextDate());
	  }
	
	@Test
	  void nextDate_30DayMonth_11() {
	    Date today = new Date(2021, 11, 30);
	    Date expectedTomorrow = new Date(2021, 12, 1);
	    assertEquals(expectedTomorrow, today.nextDate());
	  }
	
	@Test
	  void nextDate_30DayMonth_9() {
	    Date today = new Date(2021, 9, 30);
	    Date expectedTomorrow = new Date(2021, 10, 1);
	    assertEquals(expectedTomorrow, today.nextDate());
	  }
	
	@Test
	  void nextDate_Leap_28() {
	    Date today = new Date(2020, 2, 28);
	    Date expectedTomorrow = new Date(2020, 2, 29);
	    assertEquals(expectedTomorrow, today.nextDate());
	  }

}