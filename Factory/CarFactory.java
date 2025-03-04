public class CarFactory  implements  Factory{
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
