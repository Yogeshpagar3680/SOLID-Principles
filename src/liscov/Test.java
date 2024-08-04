package liscov;

public class Test {

    public static void makeBirdFly(Bird bird){
        bird.fly();
    }

    public static void main(String[] args) {

        Penguine penguine = new Penguine();
        Sparrow sparrow = new Sparrow();

        //not valid i.e. parent object(bird object) is irreplacable by child object(penguine object)
        //so we are overriding fly() method
        makeBirdFly(penguine);
        makeBirdFly(sparrow);
    }
}
