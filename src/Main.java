public class Main {

    public static void main(String[] args) {
        Transport car = new Car("car", 4);
        Transport car2 = new Car("car2", 4);

        Transport truck = new Truck("truck", 6);
        Transport truck2 = new Truck("truck 2", 8);

        Transport bicycle = new Bicycle("bicycle", 2);
        Transport bicycle2 = new Bicycle("bicycle 2", 2);


        ServiceStation service = new ServiceStation();
        service.check(car);
        System.out.println();
        service.check(car2);
        System.out.println();
        service.check(truck);
        System.out.println();
        service.check(truck2);
        System.out.println();
        service.check(bicycle);
        System.out.println();
        service.check(bicycle2);

    }
}