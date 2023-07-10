package com.prove.serializzazione;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {

        Adress adress = new Adress();
        adress.setStreet("Godoli");
        adress.setCountry("Italy");
        adress.setProva("Done");

        try{
            FileOutputStream fileOutputStream = new FileOutputStream("E:\\GoIT\\Fidelis\\booking-system\\src\\com\\prove\\serializzazione\\adress.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(adress);
            objectOutputStream.close();
            System.out.println("Done");
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
