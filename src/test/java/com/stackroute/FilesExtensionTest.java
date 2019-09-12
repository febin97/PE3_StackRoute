package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FilesExtensionTest {
    FilesExtension F;
    @Before
    public void setUp() throws Exception {
        F = new FilesExtension();
    }

    @After
    public void tearDown() throws Exception {
        F=null;
    }

    @Test
    public void testFileExtension() {
        String folderPath = "./files";
        String extension = ".txt";
        byte[] testFileContent;
        String str = "i am a man ,\n" +
                "i like to sleep ,\n" +
                "i have a home.";
        str = str+"Hello, How are you?";
        testFileContent = str.getBytes();
        assertArrayEquals("Check your function",testFileContent,F.getByteArray(folderPath,extension));
        assertNull("Function not returning null when required",F.getByteArray(folderPath,".jpg"));
    }
    @Test
    public void testFileExtensionFailure(){
        String folderPath = "./files";
        String extension = ".txt";
        assertNotNull("Function returning null when NOT required",F.getByteArray(folderPath,".txt"));
    }
}