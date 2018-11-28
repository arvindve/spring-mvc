package com.luv2code.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favouriteLanguage;
    private String [] operatingSystems;

    private LinkedHashMap<String, String> countyOptions;

    public Student() {
        countyOptions = new LinkedHashMap<>();
        countyOptions.put("BR", "Brazil");
        countyOptions.put("IND", "India");
        countyOptions.put("AUS", "Australia");
        countyOptions.put("HK", "Hong Kong");

    }

    public String getFirstName() {
        return firstName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
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

    public LinkedHashMap<String, String> getCountyOptions() {
        return countyOptions;
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public void setCountyOptions(LinkedHashMap<String, String> countyOptions) {
        this.countyOptions = countyOptions;
    }

    public String[] getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(String[] operatingSystems) {
        this.operatingSystems = operatingSystems;
    }
}
