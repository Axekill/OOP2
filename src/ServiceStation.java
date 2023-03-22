public class ServiceStation  {
    public void check(Transport transport) {
        System.out.println("Обслуживаем: "+ transport);
        transport.service();

    }
    }
   /* public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        car.updateTyre();
        car.checkEngine();
    }
    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        truck.updateTyre();
        truck.checkEngine();
        truck.checkTrailer();
    }
    public void check(Bicycle bicycle) {
        System.out.println("Обслуживаем " + bicycle.getModelName());
        bicycle.updateTyre();
    }*/


