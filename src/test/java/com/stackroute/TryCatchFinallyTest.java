package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class TryCatchFinallyTest {
    TryCatchFinally T;
    @Before
    public void setUp() throws Exception {
        T  = new TryCatchFinally();
    }

    @After
    public void tearDown() throws Exception {
        T=null;
    }

    @Test
    public void main_PrintErrorMsgInCatchBlockGoToFinally() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String testStr = "Error Caught in Catch Block\n"+"Now in Finally Block\n";
        assertEquals("check your main",testStr,output.toString());
    }
    @Test
    public void main_PrintErrorMsgInCatchBlockGoToFinallyFailure() {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        String testStr = "Error Caught in Catch Block\n"+"Now in Finally Block Not there\n";
        assertNotEquals("check your main",testStr,output.toString());
    }
}