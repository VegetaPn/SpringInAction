package com.yanhaonan.concert;

import org.springframework.stereotype.Component;

/**
 * Created by Vegeta on 3/26/17.
 */
@Component
public class DefaultEncoreableImpl implements Encoreable {
    @Override
    public void performEncore() {
        System.out.println("perform encore.");
    }
}
