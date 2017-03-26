package com.yanhaonan.concert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

/**
 * Created by Vegeta on 3/24/17.
 */
@ContextConfiguration(locations = "classpath:/spring.xml")
public class PerformanceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private Performance performance;

    @Test
    public void testPerform() throws Exception {
        performance.perform(1);
    }

    @Test
    public void testPerformEncore() throws Exception {
        Encoreable encoreable = (Encoreable) performance;
        encoreable.performEncore();
    }

}