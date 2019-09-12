package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlacesTest {
    Places p;
    @Before
    public void setUp() throws Exception {
        p = new Places();
    }

    @After
    public void tearDown() throws Exception {
        p=null;
    }

    @Test
    public void placesWithoutVowels_CorrectInput_ReturnCorrectOutput() {
        String[] testArr = {"India","United States","Germany","Egypt","czechoslovakia"};
        String[] ansArr = {"Ind","Untd Stts","Grmny","Egypt","czchslvk"};
        assertArrayEquals("Not Correct",ansArr,p.placesWithoutVowels(testArr));
    }
    @Test
    public void placesWithoutVowels_NullInput_ReturnNull(){
        String[] testArr = null;
        assertNull(p.placesWithoutVowels(testArr));
    }
}