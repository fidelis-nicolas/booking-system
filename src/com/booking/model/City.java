package com.booking.model;

public class City {

    //Global fields
    private String cityName;
    private int postCode;
    private String region;


    public City(String cityName, int postCode, String region){//Local fields of the constructor
        this.cityName = cityName;
        this.postCode = postCode;
        this.region = region;
    }
    public City(){

    }
    public City(String cityName){
        this.cityName = cityName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPostCode() {
        return postCode;
    }

    public void setPostCode(int postCode) {
        this.postCode = postCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public String toString() {
        return "City{" +
                "cityName='" + cityName + '\'' +
                ", postCode=" + postCode +
                ", region='" + region + '\'' +
                '}';
    }
}
