public class Car extends MotorTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Car:" + super.toString();
    }

    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем " + i + " покрышку у машины");
        }
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у машины");
    }

    @Override
    public void service() {
        updateTyre();
        checkEngine();
    }
}
