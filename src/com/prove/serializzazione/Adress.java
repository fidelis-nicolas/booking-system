package com.prove.serializzazione;

import java.io.Serializable;

public class Adress implements Serializable {

    // quando si invoca un client dobbiamo creare una serializable
    private static final long serialVersionUID = 1;

    String street;
    String country;
    String prova;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProva() {
        return prova;
    }

    public void setProva(String prova) {
        this.prova = prova;
    }
}
