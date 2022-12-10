package designPattern.proxy;

public class RealSubjectB implements Subject {

    private static final String name = "Real-Subject-B";

    @Override
    public void doAction() {
        System.out.println("RealSubject: [" + name + "] start do action...\n");
    }
}
