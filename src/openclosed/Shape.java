package openclosed;


/**
 * we can simply enhanced below code by following open closed principle
 * i.e. we can simply add any new shape class and by implementing Shape interface we can override draw() method
 */
public interface Shape {
    void draw();
}

class Triangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }
}
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }
}

class LaunchShape{
    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.draw();

        Circle circle = new Circle();
        circle.draw();
    }
}
