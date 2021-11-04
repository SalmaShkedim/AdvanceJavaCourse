package com.sapiensCourses.FirstSpring.ElectricalApplicances;

public class Cooler implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Cooler Turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("Cooler Turned Off");
    }
}
