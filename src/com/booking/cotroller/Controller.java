package com.booking.cotroller;

import com.booking.repo.AdminRepo;
import com.booking.repo.UserRepo;

public class Controller {
    UserRepo repo;
    AdminRepo adminRepo;


    public Controller(UserRepo repo){
        this.repo = repo;
//        this.adminRepo = adminRepo;

    }
    public void registration(){
        repo.userRegistration();
    }
    public void viewProfile(){
        repo.viewProfile();
    }


}
