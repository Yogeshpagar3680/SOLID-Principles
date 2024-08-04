package isp;

/**
 * violating interface segregation principle
 */
public interface Worker {

    void works();
    void managePeople();
    void writeCode();
}

class Manager implements Worker{

    @Override
    public void works() {
        System.out.println("manager is working");
    }

    @Override
    public void managePeople() {
        System.out.println("Manager is managing people");
    }

    @Override
    public void writeCode() {
        System.out.println("This is dummy code..just to make interface happy");
    }
}
class Programmer implements Worker{

    @Override
    public void works() {
        System.out.println("Programmer is working");
    }

    @Override
    public void managePeople() {
        System.out.println("dummy code just to satisfy interface");
    }

    @Override
    public void writeCode() {
        System.out.println("Programmer is writing code");
    }
}

