package com.sapiensCourses.FirstSpring.SetterDI;

public class ActiveMQMessaging implements Messaging {
    @Override
    public void sendMessage() {
        System.out.println("Sending ActiveMQMessaging Service");
    }

}
