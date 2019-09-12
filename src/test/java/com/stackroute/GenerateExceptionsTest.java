package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class GenerateExceptionsTest {
    GenerateExceptions E;
    @Before
    public void setUp() throws Exception {
        E = new GenerateExceptions();
    }

    @After
    public void tearDown() throws Exception {
        E = null;
    }
    @Rule
    public ExpectedException exception = ExpectedException.none();
    @Test
    public void genNegArrSizeException_CatchException_CheckForMessage() {
        exception.expect(NegativeArraySizeException.class);
        exception.expectMessage("Negative array Size");
        E.genNegArrSizeException();
    }

    @Test
    public void genIndexOutOfBoundsException_CatchException_CheckForMessage() {

        exception.expect(IndexOutOfBoundsException.class);
        exception.expectMessage("Index is out of bounds");
        E.genIndexOutOfBoundsException();
    }
    @Test()
    public void genNullPointerException_CatchException_CheckForMessage() {
        exception.expect(NullPointerException.class);
        exception.expectMessage("Null pointer exception");
        E.genNullPointerException();
    }
}