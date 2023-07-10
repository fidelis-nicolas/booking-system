package com.booking.view;

import com.booking.cotroller.Controller;
import com.booking.model.City;
import com.booking.repo.UserService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class View {

    private String firstName;
    private  String lastName;
    private long userId;
    private String userEmail;
    private long userPhone;
    private List<City> customerCity;
    private LocalDate registrationDate;
    private boolean clientStatus;

    private String userCity;
    Random random = new Random();
    UserService service;
    Controller controller;
    public View (){
        service = new UserService(this);
        controller = new Controller(service);
        registrationDate = LocalDate.now();
        this.userId = random.nextLong(1000000000000l);
        customerCity = new ArrayList<>();
        this.customerCity.add(new City(userCity));
    }

    public void mainMenu(){
        while (true){
            System.out.println("Enter 1 to login  ");
            System.out.println("Enter 2 to register  ");
            System.out.println("Enter 3 to view information  ");
            System.out.println("Prese 0 to exit");
            int userOption = In.nextInt();
            if(userOption == 1 ){
                System.out.println("Login not availible yet");

            }
            else if(userOption == 2){
                registerForm();
            }
            else if(userOption == 0){
                System.out.println("thank you");
                break;
            } else if (userOption == 3) {
                controller.viewProfile();


            }
        }
    }

    public void registerForm(){
        System.out.println("Fill the forms below");
        System.out.print("First Name: ");
        this.firstName = In.nextLine();
        System.out.print("Last Name: ");
        this.lastName = In.nextLine();
        System.out.print("Email: ");
        this.userEmail = In.nextLine();
        System.out.print("Phone: ");
        this.userPhone = In.nextInt();
        System.out.print("Enter city: ");
        this.userCity = In.nextLine();
        this.clientStatus = false;

        controller.registration();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public LocalDate getRegistrationDate() {
        return registrationDate;
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
}
