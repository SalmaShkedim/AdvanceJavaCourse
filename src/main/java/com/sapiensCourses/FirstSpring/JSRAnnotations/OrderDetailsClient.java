package com.sapiensCourses.FirstSpring.JSRAnnotations;

import javax.annotation.Resource;
import java.util.Arrays;

public class OrderDetailsClient {
    @Resource(name="OrderServiceD")
    private OrderDetails orderDetails;

    public void showPendingOrderDetails(){
        for(String orderId : Arrays.asList("60", "120", "180", "240")){
            System.out.println(orderDetails.getOrderDetails(orderId));
        }
    }

}
