package designPattern.proxy.staticProxy;

import designPattern.proxy.Subject;

class MyProxy implements Subject {

    private final Subject subject;

    MyProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doAction() {
        System.out.println("Proxy start... " + this);
        subject.doAction();
    }

    @Override
    public String toString() {
        return "(proxy created by yhao3)";
    }
}
