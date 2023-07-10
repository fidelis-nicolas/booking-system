package com.booking.model;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class Users{

    private String firstName;
    private  String lastName;
    private long userId;
    private String userEmail;
    private long userPhone;
    private List<City> customerCity;
    private LocalDate registrationDate;
    private boolean clientStatus;

    //Constructors

    public Users(){

    }

    public Users(String firstName, String lastName, long userId, String userEmail, long userPhone, List<City> customerCity, LocalDate registrationDate, boolean clientStatus) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userId = userId;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.customerCity = customerCity;
        this.registrationDate = registrationDate;
        this.clientStatus = clientStatus;
    }

    //Constructors
    public Users(LocalDate date){
        this.registrationDate = date;

    }

    //Getters and setters
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }


    public LocalDate getRegistrationDate() {
        return this.registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(boolean clientStatus) {
        this.clientStatus = clientStatus;
    }

    public List<City> getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(List<City> customerCity) {
        this.customerCity = customerCity;
    }

    @Override
    public String toString() {
        return "Users{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone=" + userPhone +
                ", ustomerCity=" + customerCity +
                ", registrationDate=" + registrationDate +
                ", clientStatus=" + clientStatus +
                '}';
    }

    public String newString(){
        return "Users{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
