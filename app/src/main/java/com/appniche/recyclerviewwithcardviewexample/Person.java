package com.appniche.recyclerviewwithcardviewexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JayPrakash on 02-12-2016.
 */

public class Person {

    private String name;
    private String city;

    public Person(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
