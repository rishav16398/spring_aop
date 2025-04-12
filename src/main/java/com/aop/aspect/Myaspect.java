package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Myaspect {

    @Before("execution(* com.aop.service.PaymentServiceImpl.makePayment())")
    public void printBefore() {
        System.out.println("Payment is being processed ...");
    }

    @After("execution(* com.aop.service.PaymentServiceImpl.makePayment())")
    public void printAfter() {
        System.out.println("Payment is being processed ...");
    }
}
