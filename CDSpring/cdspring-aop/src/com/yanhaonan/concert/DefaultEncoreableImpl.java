package com.yanhaonan.concert;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by Vegeta on 3/26/17.
 */
public class DefaultEncoreableImpl implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("perform encore.");
    }
}
