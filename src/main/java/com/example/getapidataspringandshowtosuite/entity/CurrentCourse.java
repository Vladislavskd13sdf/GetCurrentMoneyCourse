package com.example.getapidataspringandshowtosuite.entity;

import java.util.Objects;

public class CurrentCourse extends Ent{
    String ccy;
    String base_ccy;
    double buy;
    double sale;

    public CurrentCourse(String ccy, String base_ccy, double buy, double sale) {
        this.ccy = ccy;
        this.base_ccy = base_ccy;
        this.buy = buy;
        this.sale = sale;
    }

    public CurrentCourse() {
    }

    public String getCcy() {
        return ccy;
    }

    public void setCcy(String ccy) {
        this.ccy = ccy;
    }

    public String getBase_ccy() {
        return base_ccy;
    }

    public void setBase_ccy(String base_ccy) {
        this.base_ccy = base_ccy;
    }

    public double getBuy() {
        return buy;
    }

    public void setBuy(double buy) {
        this.buy = buy;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentCourse that = (CurrentCourse) o;
        return Double.compare(that.buy, buy) == 0 && Double.compare(that.sale, sale) == 0 && Objects.equals(ccy, that.ccy) && Objects.equals(base_ccy, that.base_ccy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ccy, base_ccy, buy, sale);
    }

    @Override
    public String toString() {
        return "CurrentCourse{" +
                "ccy='" + ccy + '\'' +
                ", base_ccy='" + base_ccy + '\'' +
                ", buy=" + buy +
                ", sale=" + sale +
                '}';
    }
}
