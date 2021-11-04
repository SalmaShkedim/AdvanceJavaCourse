package com.sapiensCourses.FirstSpring.SetterDI;

public class DynamicMQMessaging implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("Sending DynamicMQMessaging Service");
    }
}
