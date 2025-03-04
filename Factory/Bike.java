public class Bike implements Vehicle {
    @Override 
    public void wheels() {
        System.out.println("bike has 2 wheels lol...");
    }

    @Override
    public void start() {
        System.out.println("the bike is started and wheeling..");
    }
}
