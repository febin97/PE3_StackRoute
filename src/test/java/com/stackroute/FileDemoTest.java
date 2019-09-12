package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class FileDemoTest {
    FilesExtension.FileDemo F;
    @Before
    public void setUp() throws Exception {
        F = new FilesExtension.FileDemo();
    }

    @After
    public void tearDown() throws Exception {
        F = null;
    }

    @Test
    public void freqWords_GivenCorrectFilePath_ReturnCorrectOutput() {
        String filePath = "./files/FileDemo.txt";
        String expStr = "i-3,am-1,a-2,man-1,like-1,to-1,sleep-1,have-1,home-1";
        assertEquals("Check your function",expStr,F.freqWords(filePath));
    }
    @Test
    public void freqWords_GivenCorrectFilePath_ReturnCorrectOutputFailure() {
        String filePath = "./files/FileDemo.txt";
        String expStr = "i-3,am-1,a-2,man-1,like-1,to-1,sleep-1,have-1,home-3";
        assertNotEquals("Check your function",expStr,F.freqWords(filePath));
    }
    @Test(expected = FileNotFoundException.class)
    public void freqWords_GivenInCorrectFilePath_ThrowException(){
        String filePath = "./files/FileDemo1.txt";
        F.freqWords(filePath);
    }
}