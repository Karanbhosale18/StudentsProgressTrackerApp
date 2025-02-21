package com.example.mainproject;

public class noticedata {
    String DATE,NOTICE;

    public noticedata(String DATE, String NOTICE) {
        this.DATE = DATE;
        this.NOTICE = NOTICE;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getNOTICE() {
        return NOTICE;
    }

    public void setNOTICE(String NOTICE) {
        this.NOTICE = NOTICE;
    }
}
