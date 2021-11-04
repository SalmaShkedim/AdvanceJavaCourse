package com.sapiensCourses.FirstSpring.JSRAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class AppRunner {

    @Bean(name = "OrderServiceA")
    public OrderDetails orderdetailsByProvider1(){
        return new OrderDetailsImpl1();
    }

    @Bean(name = "OrderServiceB")
    public OrderDetails orderDetailsByProvider2(){
        return new OrderDetailsImpl2();
    }
    @Bean(name = "OrderServiceC")
    public OrderDetails orderdetailsByProvider3(){
        return new OrderDetailsImpl3();
    }

    @Bean(name = "OrderServiceD")
    public OrderDetails orderDetailsByProvider4(){
        return new OrderDetailsImpl4();
    }

    @Bean(name = "OrderServiceE")
    public OrderDetails orderDetailsByProvider5(){
        return new OrderDetailsImpl5();
    }

    @Bean
    public OrderDetailsClient createClient(){
        return new OrderDetailsClient ();
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppRunner.class);
        OrderDetailsClient bean = context.getBean(OrderDetailsClient.class);
        bean.showPendingOrderDetails();
    }
}

