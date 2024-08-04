package liscov;

public class Bird {
    public void fly()
    {
        System.out.println("Bird is flying");
    }
}
class Penguine extends Bird{
    public void fly()
    {
        System.out.println("i am penguine. i can't fly");
    }
}
class Sparrow extends Bird{
    public void fly()
    {

    }
}
