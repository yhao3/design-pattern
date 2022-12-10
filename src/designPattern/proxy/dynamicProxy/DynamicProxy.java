package designPattern.proxy.dynamicProxy;

import designPattern.proxy.RealSubjectA;
import designPattern.proxy.RealSubjectB;
import designPattern.proxy.Subject;

import java.lang.reflect.Proxy;

public class DynamicProxy {

    public static void main(String[] args) {
        // Dynamic proxy for real subject A
        RealSubjectA realSubjectA = new RealSubjectA();
        Subject proxyA = (Subject) Proxy.newProxyInstance(
                realSubjectA.getClass().getClassLoader(),
                realSubjectA.getClass().getInterfaces(),
                (proxy, method, args1) -> {
                    System.out.println("Proxy start... (proxy created by reflection)");
                    return method.invoke(realSubjectA, args1);
                });

        proxyA.doAction();

        // Dynamic proxy for real subject B
        RealSubjectB realSubjectB = new RealSubjectB();
        Subject proxyB = (Subject) Proxy.newProxyInstance(
                realSubjectB.getClass().getClassLoader(),
                realSubjectB.getClass().getInterfaces(),
                (proxy, method, args12) -> {
                    System.out.println("Proxy start... (proxy created by reflection)");
                    return method.invoke(realSubjectB, args12);
                });

        proxyB.doAction();
    }
}
