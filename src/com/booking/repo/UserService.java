package com.booking.repo;

import com.booking.model.Users;
import com.booking.view.View;

import java.util.ArrayList;

public class UserService implements UserRepo{
    ArrayList<Users> database;

    Users users;
    public View view;

    public UserService(View v){
        this.view = v;
        users = new Users();
        database = new ArrayList<>();
    }
    @Override
    public void userRegistration() {
       users.setFirstName(view.getFirstName());
       users.setLastName(view.getLastName());

       database.add(new Users(users.getFirstName()),users.getLastName(),)

    }

    @Override
    public void viewProfile() {

    }

    @Override
    public void userLogin() {

    }


}
