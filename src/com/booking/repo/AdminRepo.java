package com.booking.repo;

import com.booking.model.Users;

import java.util.ArrayList;

public interface AdminRepo {
    public void adminLogin();
    public void viewAllUsers();
    public ArrayList<Users> getUsersFromCity(String city);

}
