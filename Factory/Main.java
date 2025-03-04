public class Main {
    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        Vehicle honda = cf.createVehicle();
        honda.wheels();
        honda.start();


    }
}