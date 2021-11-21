package com.example.getapidataspringandshowtosuite.entity;

import java.util.Date;
import java.util.Objects;

public class AllCourses extends Ent{
    private int r030;
    private String txt;
    private double rate;
    private String cc;
    private String exchangedate;

    public AllCourses(int r030, String txt, double rate, String cc, String exchangedate) {
        this.r030 = r030;
        this.txt = txt;
        this.rate = rate;
        this.cc = cc;
        this.exchangedate = exchangedate;
    }

    public AllCourses() {
    }

    public int getR030() {
        return r030;
    }

    public void setR030(int r030) {
        this.r030 = r030;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(String exchangedate) {
        this.exchangedate = exchangedate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllCourses that = (AllCourses) o;
        return r030 == that.r030 && Double.compare(that.rate, rate) == 0 && Objects.equals(txt, that.txt) && Objects.equals(cc, that.cc) && Objects.equals(exchangedate, that.exchangedate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(r030, txt, rate, cc, exchangedate);
    }


    @Override
    public String toString() {
        return "AllCourses{" +
                "r030=" + r030 +
                ", txt='" + txt + '\'' +
                ", rate=" + rate +
                ", cc='" + cc + '\'' +
                ", exchangedate='" + exchangedate + '\'' +
                '}';
    }
}
