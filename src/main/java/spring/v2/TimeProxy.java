package spring.v2;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

public class TimeProxy {

    @Before("execution(void spring.v1.Tank.move())")
    public void before() {
        System.out.println("method start..." + System.currentTimeMillis());
    }

    @After("execution(void spring.v1.Tank.move())")
    public void after() {
        System.out.println("method end..." + System.currentTimeMillis());
    }
}
