package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SeriesTest {
    Series S;
    @Before
    public void setUp() throws Exception {
        S = new Series();
    }

    @After
    public void tearDown() throws Exception {
        S = null;
    }

    @Test
    public void isConsecutive_CorrectInput_ReturnBool() {
        String testStr = "54,53,52,51,50,49,48";
        assertEquals("check your function",true,S.isConsecutive(testStr));
        testStr = "1,2,3,4,5,6,6";
        assertEquals("check your function",false,S.isConsecutive(testStr));
    }
    @Test
    public void isConsecutive_CorrectInput_ReturnBoolFailure() {
        String testStr = "54,53,52,51,50,49,48";
        assertNotEquals("check your function",false,S.isConsecutive(testStr));
        testStr = "1,2,3,4,5,6,6";
        assertNotEquals("check your function",true,S.isConsecutive(testStr));
    }
    @Test
    public void isConsecutive_NullInput_ReturnNull(){
        String testStr = "";
        assertNull(S.isConsecutive(testStr));
    }
}