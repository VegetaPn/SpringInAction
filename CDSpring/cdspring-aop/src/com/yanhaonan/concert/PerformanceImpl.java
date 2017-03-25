package com.yanhaonan.concert;

import org.springframework.stereotype.Component;

/**
 * Created by Vegeta on 3/24/17.
 */
@Component
public class PerformanceImpl implements Performance {
    @Override
    public void perform(int n) {
        System.out.println("Performing... " + n);
    }
}
