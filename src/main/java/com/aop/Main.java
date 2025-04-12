package com.aop;

//import org.springframework.

import com.aop.service.PaymentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");

        PaymentService paymentObject =  context.getBean("payment", PaymentService.class);

        paymentObject.makePayment();

    }
}