package com.booking.repo;

import com.booking.model.Users;
import com.booking.view.View;

import java.util.ArrayList;

public class UserService implements UserRepo{
    ArrayList<Users> database;

    public String viewAllInfoProfile(){
        String userInfo = users.toString();
        return userInfo;
    }
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
        users.setUserEmail(view.getUserEmail());
        users.setUserId(view.getUserId());
        users.setCustomerCity(view.getCustomerCity());
        users.setRegistrationDate(view.getRegistrationDate());
        users.setUserPhone(view.getUserPhone());

      database.add(new Users(users.getFirstName(),users.getLastName(),users.getUserId(), users.getUserEmail(),
              users.getUserPhone(), users.getCustomerCity(), users.getRegistrationDate(),false));

        System.out.println("You have been registered");
    }

    @Override
    public void viewProfile() {
       //users.toString();
        //System.out.println(users.toString());
        for (Users user : database){
            System.out.println(user.getFirstName() + " " +  user.getLastName());
        }

        }


    @Override
    public void userLogin() {

    }


}
