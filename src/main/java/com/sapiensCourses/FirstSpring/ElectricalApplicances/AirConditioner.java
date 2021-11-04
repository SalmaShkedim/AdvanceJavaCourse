package com.sapiensCourses.FirstSpring.ElectricalApplicances;

public class AirConditioner implements Switchable {
    @Override
    public void turnOn() {
        System.out.println("AirConditioner Turned On");
    }

    @Override
    public void turnOff() {
        System.out.println("AirConditioner Turned Off");
    }

}
