package com.yanhaonan.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Vegeta on 3/18/17.
 */
@Aspect
@Component
public class Audience {

    @Pointcut("execution(* Performance.perform(int)) && args(n)")
    public void performance(int n) {}

    @Before(value = "performance(n)", argNames = "n")
    public void silenceCellPhones(int n) {
        System.out.println("Silenceing cell phones " + n);
    }

    @Before("performance(n)")
    public void takeSeats(int n) {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance(n)")
    public void applause(int n) {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance(n)")
    public void demandRefund(int n) {
        System.out.println("Demanding a refund");
    }

    @Around("performance(n)")
    public void watchPerformance(ProceedingJoinPoint jp, int n) {
        try {
            System.out.println("Silencing cell phones");
            System.out.println("Taking seats");
            jp.proceed();
            System.out.println("CLAP CLAP CLAP!!! " + n);
        } catch (Throwable e) {
            System.out.println("Demanding a refund");
        }
    }
}
