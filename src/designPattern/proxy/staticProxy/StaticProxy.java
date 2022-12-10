package designPattern.proxy.staticProxy;

import designPattern.proxy.RealSubjectA;
import designPattern.proxy.RealSubjectB;

public class StaticProxy {
    public static void main(String[] args) {
        MyProxy proxyA = new MyProxy(new RealSubjectA());
        proxyA.doAction();

        MyProxy proxyB = new MyProxy(new RealSubjectB());
        proxyB.doAction();
    }
}

