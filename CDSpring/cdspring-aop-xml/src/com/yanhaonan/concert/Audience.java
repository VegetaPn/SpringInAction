package com.yanhaonan.concert;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by Vegeta on 3/18/17.
 */
@Component
public class Audience {

    public void performance(int n) {}

    public void silenceCellPhones(int n) {
        System.out.println("Silenceing cell phones " + n);
    }

    public void takeSeats(int n) {
        System.out.println("Taking seats");
    }

    public void applause(int n) {
        System.out.println("CLAP CLAP CLAP!!!");
    }

    public void demandRefund(int n) {
        System.out.println("Demanding a refund");
    }

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
