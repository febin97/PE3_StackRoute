package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks student;
    @Before
    public void setUp() throws Exception {
        student = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        student = null;
    }

    @Test
    public void checkValidGrades_CorrectInput_ReturnBool() {
        student.setNumOfStudents(4);
        int[] testArr = {2,3,1,1};
        student.setStuGrades(testArr);
        assertEquals("Not Correct",true,student.checkValidGrades());
        testArr = new int[]{101,102,12,2};
        student.setStuGrades(testArr);
        assertEquals("Not Correct",false,student.checkValidGrades());
    }
    @Test
    public void checkValidGrades_CorrectInput_ReturnBoolFailure() {
        student.setNumOfStudents(4);
        int[] testArr = {2,3,1,1};
        student.setStuGrades(testArr);
        assertNotEquals("Not Correct",false,student.checkValidGrades());
        testArr = new int[]{101,102,12,2};
        student.setStuGrades(testArr);
        assertNotEquals("Not Correct",true,student.checkValidGrades());
    }
    @Test
    public void checkVaildGrades_InCorrectInput_ReturnNull(){
        student.setNumOfStudents(3);
        int[] testArr = {2,3,1,1};
        student.setStuGrades(testArr);
        assertNull(student.checkValidGrades());
    }
}