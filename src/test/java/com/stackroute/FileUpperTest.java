package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class FileUpperTest {
    FileUpper F;
    @Before
    public void setUp() throws Exception {
        F = new FileUpper();
    }

    @After
    public void tearDown() throws Exception {
        F = null;
    }

    @Test
    public void getFile_GivenFilePath_ReturnContentOfFile() {
        String testStr = "HELLO, HOW ARE YOU?"+"19";
        String fileName = "./files/FileDemo2.txt";   //Change file path according to yor requirement
        assertEquals("check your function",testStr,F.getFile(fileName));
    }
    @Test
    public void getFile_GivenFilePath_ReturnContentOfFileFailure() {
        String testStr = "HELLO, HOW ARE YOU?"+"23";
        String fileName = "./files/FileDemo1.txt";
        assertNotEquals("check your function",testStr,F.getFile(fileName));
    }
    @Test(expected = FileNotFoundException.class)
    public void getFile_GivenFilePath_ThrowException(){
        String testStr = "HELLO, HOW ARE YOU?"+"23";
        String fileName = "./files/FileDemo5.txt";
        assertNotEquals("check your function",testStr,F.getFile(fileName));
    }
}