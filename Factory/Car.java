

public class Car implements  Vehicle {
    @Override
    public void wheels() {
        System.out.println("car has 4 wheels");
    }

    @Override
    public void start() {
        System.out.println("the car is started and rolling..");
    }
}
