package com.sapiensCourses.FirstSpring.ElectricalApplicances;

public class Tv implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Tv Turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv Turned Off");
    }
}
