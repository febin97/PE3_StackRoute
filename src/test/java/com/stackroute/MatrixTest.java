package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MatrixTest {

    Matrix A,B;
    @Before
    public void setUp() throws Exception {
        A = new Matrix();
        B = new Matrix();
    }

    @After
    public void tearDown() throws Exception {
        A=null;
        B=null;
    }

    @Test
    public void matrixAdd_CorrectInput_ReturnCorrectOutput() {
        int[][] m= {{1,2}};
        int rowNo = 1;
        int colNo = 2;
        A = new Matrix(rowNo,colNo,m);
        m= new int[][]{{2, 3}};
        B = new Matrix(rowNo,colNo,m);
        m = new int[][]{{3,5}};
        Matrix test = new Matrix(rowNo,colNo,m);
        assertEquals("Check your function addition not done properly",test.toString() ,A.matrixAdd(B).toString());

        m= new int[][]{{1,2,3},{2,3,4},{3,4,3}};
        rowNo = 3;
        colNo = 3;
        A = new Matrix(rowNo,colNo,m);
        m= new int[][]{{1,1,1},{1,1,1},{1,1,1}};
        B = new Matrix(rowNo,colNo,m);
        m = new int[][]{{2,3,4},{3,4,5},{4,5,4}};
        test = new Matrix(rowNo,colNo,m);
        assertEquals("Check your function addition not done properly",test.toString() ,A.matrixAdd(B).toString());
        assertNotNull(A.matrixAdd(B));
    }
    @Test
    public void matrixAdd_CorrectInput_ReturnCorrectOutputFailure(){
        int[][] m= {{1,2}};
        int rowNo = 1;
        int colNo = 2;
        A = new Matrix(rowNo,colNo,m);
        m= new int[][]{{2, 3}};
        B = new Matrix(rowNo,colNo,m);
        m = new int[][]{{5,5}};
        Matrix test = new Matrix(rowNo,colNo,m);
        assertNotEquals("Check your function addition not done properly",test.toString() ,A.matrixAdd(B).toString());
    }
    @Test
    public void matrixAdd_InCorrectInput_ReturnNull(){
        int[][] m= new int[][]{{1,2,3},{2,3,4},{3,4,3}};
        int rowNo = 3;
        int colNo = 3;
        A = new Matrix(rowNo,colNo,m);
        m= new int[][]{{1,1,1},{1,1,1}};
        B = new Matrix(2,3,m);
        assertNull(A.matrixAdd(B));
    }
}