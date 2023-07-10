package com.booking.model;

import java.time.LocalDate;
import java.util.Date;

public class BusinessUsers extends Users{
    private String company;

    public BusinessUsers(LocalDate date, String company) {
        super(date);
        this.company = company;
    }


}
