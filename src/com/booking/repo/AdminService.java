package com.booking.repo;

import com.booking.model.Users;

import java.util.ArrayList;


public class AdminService implements AdminRepo, UserRepo{

    Users users;
    @Override
    public void adminLogin() {

    }

    @Override
    public void viewAllUsers() {

    }

    @Override
    public ArrayList<Users> getUsersFromCity(String city) {
        return null;
    }

    @Override
    public void userRegistration() {

    }

    @Override
    public void viewProfile() {

    }

    @Override
    public void userLogin() {

    }
}
