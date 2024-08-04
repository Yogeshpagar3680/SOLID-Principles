package isp.modify;

/**
 * segregating interfaces
 */
public interface Manager {

    public void work();
    public void manage();
}
interface Programmer{
    public void work();
    public void code();
}

class ManagerImp implements Manager{

    @Override
    public void work() {
        System.out.println("manager is working");
    }

    @Override
    public void manage() {
        System.out.println("Manager is managing people");
    }
}

class ProgrammerImpl implements Programmer{

    @Override
    public void work() {
        System.out.println("Programmer is working");
    }

    @Override
    public void code() {
        System.out.println("programmer is coding");
    }
}