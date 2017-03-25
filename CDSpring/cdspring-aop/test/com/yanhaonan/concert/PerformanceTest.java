package com.yanhaonan.concert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by Vegeta on 3/24/17.
 */
@ContextConfiguration(classes = com.yanhaonan.config.SpringConfig.class)
public class PerformanceTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private Performance performance;

    @Test
    public void testPerform() throws Exception {
        performance.perform(1);
    }

}