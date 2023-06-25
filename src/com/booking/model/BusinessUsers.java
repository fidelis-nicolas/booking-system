package com.booking.model;

import java.util.Date;

public class BusinessUsers extends Users{
    private String company;

    public BusinessUsers(Date date, String company) {
        super(date);
        this.company = company;
    }


}
