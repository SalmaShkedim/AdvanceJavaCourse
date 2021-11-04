package com.sapiensCourses.FirstSpring.ElectricalApplicances;

public class ElectricPowerSwitch implements Switch {
    public Switchable client;
    public boolean on;

    public ElectricPowerSwitch(Switchable client) {
        this.client = client;
        this.on = true;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();
        if(checkOn){
            client.turnOff();
            this.on = false;
        }else{
            client.turnOn();
            this.on = true;
        }
    }

    public static void main(String[] args) {
        System.out.println("----Tv Switcher-----");
        Switchable switchableTv = new Tv();
        Switch tvPowerSwitch = new ElectricPowerSwitch(switchableTv);
        tvPowerSwitch.press();
        tvPowerSwitch.press();

        System.out.println("\n----Refrigerator Switcher-----");
        Switchable switchableRefrigerator = new Refrigerator();
        Switch refrigeratorPowerSwitch = new ElectricPowerSwitch(switchableRefrigerator);
        refrigeratorPowerSwitch.press();
        refrigeratorPowerSwitch.press();

        System.out.println("\n----Cooler Switcher-----");
        Switchable switchableCooler = new Cooler();
        Switch coolerPowerSwitch = new ElectricPowerSwitch(switchableCooler);
        coolerPowerSwitch.press();
        coolerPowerSwitch.press();

        System.out.println("\n----AirConditioner Switcher-----");
        Switchable switchableAirConditioner = new AirConditioner();
        Switch airConditionerPowerSwitch = new ElectricPowerSwitch(switchableAirConditioner);
        airConditionerPowerSwitch.press();
        airConditionerPowerSwitch.press();

        System.out.println("\n----Light Switcher-----");
        Switchable switchableLight = new Light();
        Switch lightPowerSwitch = new ElectricPowerSwitch(switchableLight);
        lightPowerSwitch.press();
        lightPowerSwitch.press();

    }

}
