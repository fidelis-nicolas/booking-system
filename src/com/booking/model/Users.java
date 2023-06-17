package com.booking.model;

import java.util.Date;
import java.util.List;

public class Users {

    private String firstName;
    private  String lastName;
    private long userId;
    private String userEmail;
    private long userPhone;
    private List<City> customerCity;
    private Date registrationDate;
    private boolean clientStatus;

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

    public List<City> getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(List<City> customerCity) {
        this.customerCity = customerCity;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    public boolean isClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(boolean clientStatus) {
        this.clientStatus = clientStatus;
    }

    @Override
    public String toString() {
        return "Users{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userId=" + userId +
                ", userEmail='" + userEmail + '\'' +
                ", userPhone=" + userPhone +
                ", customerCity=" + customerCity +
                ", registrationDate=" + registrationDate +
                ", clientStatus=" + clientStatus +
                '}';
    }
}
