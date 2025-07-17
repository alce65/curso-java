package com.cdsb.serial;


import java.time.LocalDate;

import com.fasterxml.jackson.databind.ObjectMapper;


public class JacksonCyclist2 extends JsonTools {

    Cyclist cyclist;
    String pathCyclistJson = "demos-persis/resources/cyclist.json";
    String pathBikesJson = "demos-persis/resources/bikes.json";

    public JacksonCyclist2() {
        cyclist = new Cyclist("Pepe", LocalDate.of(2000, 10, 23));
        addBikes();
        System.out.println(cyclist);
    }

    private void addBikes() {
        Bicycle[] bikes;
        bikes = this.fromJsonFile(pathBikesJson, Bicycle[].class);
        for (int i = 0; i < bikes.length; i++) {
            cyclist.addBike(bikes[i]);
        }
    };

    public void saveCyclist() {
        System.out.println("Saving cyclist...");
        this.toJsonFile(cyclist, pathCyclistJson);
        Cyclist savedCyclist = this.fromJsonFile(pathCyclistJson, Cyclist.class);
        System.out.println("Saved Cyclist: " + savedCyclist);
    }

    public static void main(String[] args) {
        JacksonCyclist2 jCyclist = new JacksonCyclist2();
        jCyclist.saveCyclist();
    }

}
