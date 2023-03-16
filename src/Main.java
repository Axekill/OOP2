public class Main {
    private static void printCheck(Car car, Car car2, Truck truck, Truck truck2, Bicycle bicycle, Bicycle bicycle2, ServiceStation serviceStationForTransport) {
        serviceStationForTransport.check(car);
        serviceStationForTransport.check(car2);
        serviceStationForTransport.check(bicycle);
        serviceStationForTransport.check(bicycle2);
        serviceStationForTransport.check(truck);
        serviceStationForTransport.check(truck2);
    }

    public static void main(String[] args) {
        Car car = new Car("car", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck", 6);
        Truck truck2 = new Truck("truck 2", 8);

        Bicycle bicycle = new Bicycle("bicycle", 2);
        Bicycle bicycle2 = new Bicycle("bicycle 2", 2);


        ServiceStation serviceStationForTransport = new ServiceStationImpl();
        printCheck(car, car2, truck, truck2, bicycle, bicycle2, serviceStationForTransport);
    }
}