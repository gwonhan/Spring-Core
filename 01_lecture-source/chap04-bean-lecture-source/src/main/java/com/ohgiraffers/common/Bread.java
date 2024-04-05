package com.ohgiraffers.common;

import javax.xml.crypto.Data;
import java.util.Date;

public class Bread extends Product {

    private Date breakDate; // 만든 시간

    public Bread(String name, int price, Date breakDate) {
        super(name, price);
        this.breakDate = breakDate;

    }

    public Date getBreakDate() {
        return breakDate;
    }

    public void setBreakDate(Date breakDate) {
        this.breakDate = breakDate;
    }

    @Override
    public String toString() {
        return super.toString() +" " + this.breakDate;

    }
}
