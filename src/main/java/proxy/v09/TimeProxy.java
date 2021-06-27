package proxy.v09;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeProxy implements InvocationHandler {
    Movable movable;

    public TimeProxy(Movable movable) {
        this.movable = movable;
    }

    public void  before() {
        System.out.println("method start..");
    }

    public void after() {
        System.out.println("method end...");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object o = method.invoke(movable, args);
        after();
        return o;
    }
}
