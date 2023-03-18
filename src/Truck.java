public class Truck extends MotorTransport {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Truck:" + super.toString();
    }

    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем " + i + " покрышку у грузовика");
        }
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
        checkTrailer();
    }
}
