package com.example.mainproject;

public class report {
    String date,rollno,std,marks;

    public report(String date, String rollno, String std, String marks) {
        this.date = date;
        this.rollno = rollno;
        this.std = std;
        this.marks = marks;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getMarks() {
        return marks;
    }

    public void setMarks(String marks) {
        this.marks = marks;
    }
}
