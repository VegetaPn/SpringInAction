package com.yanhaonan;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by Vegeta on 3/18/17.
 */
@Aspect
@Component
public class Audience {

    @Pointcut("execution(* concert.Performance.perform(..))")
    public void performance() {}

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silenceing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking setas");
    }

    @AfterReturning("performance()")
    public void applause() {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
