package com.yanhaonan.concert;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by Vegeta on 3/26/17.
 */
@Aspect
@Component
public class EncoreableIntroducer {
    @DeclareParents(value = "com.yanhaonan.concert.Performance+", defaultImpl = DefaultEncoreableImpl.class)
    public static Encoreable encoreable;
}
