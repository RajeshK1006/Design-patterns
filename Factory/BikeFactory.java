public class BikeFactory implements Factory {
    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
}
