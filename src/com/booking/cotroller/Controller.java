package com.booking.cotroller;

import com.booking.repo.AdminRepo;
import com.booking.repo.UserRepo;

public class Controller {
    UserRepo userRepo;
    AdminRepo adminRepo;


    public Controller(UserRepo userRepo){
        this.userRepo = userRepo;
//        this.adminRepo = adminRepo;

    }
    public void registration(){
        userRepo.userRegistration();
    }
    public void viewProfile(){
        userRepo.viewProfile();
    }


}
