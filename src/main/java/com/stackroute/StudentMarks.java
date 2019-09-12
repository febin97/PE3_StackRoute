package com.stackroute;

import java.util.Scanner;

public class StudentMarks {
    int numOfStudents;
    int[] stuGrades;

    public boolean checkValidGrades(){
        if(numOfStudents != stuGrades.length)
            return false;
        for(int grade:stuGrades){
            if(grade>100 || grade<0)
                return false;
        }
        return true;
    }
   /** public StudentMarks readInput(){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Number of Students");
        int num = inp.nextInt();
        int[] grades = new int[num];
        setNumOfStudents(num);
        for(int i=0;i<num;i++){
            System.out.println("Enter grades of student "+(i+1));
            grades[i] = inp.nextInt();
        }
        setStuGrades(grades);
        return this;
    }
    **/
    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public int[] getStuGrades() {
        return stuGrades;
    }

    public void setStuGrades(int[] stuGrades) {
        this.stuGrades = stuGrades;
    }
}
