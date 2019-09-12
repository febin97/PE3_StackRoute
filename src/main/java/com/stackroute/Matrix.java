package com.stackroute;

import java.util.Arrays;

public class Matrix {
    int noOfRows;
    int noOfColumns;
    int[][] elements;

    public Matrix(int noOfRows, int noOfColumns, int[][] elements) {
        this.noOfRows = noOfRows;
        this.noOfColumns = noOfColumns;
        this.elements = elements;
    }

    public Matrix() {

    }

    @Override
    public String toString() {
        return null;
    }

    public Matrix matrixAdd(Matrix B){
        return null;
    }

    public int[][] getElements() {
        return elements;
    }

    public void setElements(int[][] elements) {
        this.elements = elements;
    }

    public int getNoOfRows() {
        return noOfRows;
    }

    public void setNoOfRows(int noOfRows) {
        this.noOfRows = noOfRows;
    }

    public int getNoOfColumns() {
        return noOfColumns;
    }

    public void setNoOfColumns(int noOfColumns) {
        this.noOfColumns = noOfColumns;
    }
}
