package designPattern.proxy;

public class RealSubjectA implements Subject {

    private static final String name = "Real-Subject-A";

    @Override
    public void doAction() {
        System.out.println("RealSubject: [" + name + "] start do action...\n");
    }
}
