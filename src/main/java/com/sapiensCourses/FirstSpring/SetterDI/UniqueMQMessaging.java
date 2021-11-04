package com.sapiensCourses.FirstSpring.SetterDI;

public class UniqueMQMessaging implements Messaging {
    @Override
    public void sendMessage() {
        System.out.println("Sending UniqueMQMessaging Service");
    }

}
