package com.sapiensCourses.FirstSpring.ElectricalApplicances;

public class Refrigerator implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("Refrigerator Turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("Refrigerator Turned Off");
    }
}
