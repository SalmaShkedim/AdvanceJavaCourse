package com.sapiensCourses.FirstSpring.ElectricalApplicances;

public class Light implements Switchable {

    @Override
    public void turnOn() {
        System.out.println("Light Turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("Light Turned Off");
    }
}
