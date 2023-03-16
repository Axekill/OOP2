public interface ServiceStation {
    void check(Car car);
    void check(Bicycle bicycle);
    void check(Truck truck);

    void check(Car car, Bicycle bicycle, Truck truck);
}
