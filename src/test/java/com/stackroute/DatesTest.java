package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.ParseException;

import static org.junit.Assert.*;

public class DatesTest {
    Dates D;
    @Before
    public void setUp() throws Exception {
        D = new Dates();
    }

    @After
    public void tearDown() throws Exception {
        D=null;
    }

    @Test
    public void getFirstandLastDay_GivenDate_ReturnCorrectOutput() throws ParseException {
        String str = "Mon 09-09-2019\nSun 15-09-2019\n";
        String strDate = "11-09-2019";
        assertEquals("Not Correct",str,D.getFirstandLastDay(strDate));
        str = "Parse Exception Please Enter Date in dd-MM-yyyy format";
        str = "Mon 30-12-2019\n" +
                "Sun 05-01-2020\n";
        strDate = "31-12-2019";
        assertEquals("Not Correct",str,D.getFirstandLastDay(strDate));
    }
    @Test
    public void getFirstandLastDay_GivenDate_ReturnCorrectOutputFailure() throws ParseException {
        String str = "Mon 10-09-2019\nSun 15-09-2019\n";
        String strDate = "11-09-2019";
        assertNotEquals("Not Correct",str,D.getFirstandLastDay(strDate));
    }
    @Test(expected = ParseException.class)
    public void getFirstandLastDay_GivenIncorrectDateFormat_ShouldThrowException() throws ParseException {
        String str = "Mon 09-09-2019\nSun 15-09-2019\n";
        String strDate = "11 September 2019";
        D.getFirstandLastDay(strDate);
    }
}