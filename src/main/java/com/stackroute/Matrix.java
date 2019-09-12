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
        String str="";
        for(int i=0;i<noOfRows;i++){
            for(int j=0;j<noOfColumns;j++){
                str = str+ elements[i][j]+" ";
            }
            str += "\n";
        }
        return str;
    }

    public Matrix matrixAdd(Matrix B){
        if(noOfColumns!=B.getNoOfColumns() || noOfRows!= B.getNoOfRows())
            return null;
        int[][] S = new int[noOfRows][noOfColumns];
        for(int i=0;i<noOfRows;i++){
            for (int j=0;j<noOfColumns;j++){
                S[i][j] = elements[i][j]+B.getElements()[i][j];
            }
        }
        Matrix temp = new Matrix(noOfRows,noOfColumns,S);
        return temp;
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
