package com.sapiensCourses.FirstSpring.SetterDI;

public class StaticMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending StaticMQMessaging Service");
    }
}
