public class Bicycle extends WheelsTransport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Bicycle: " + super.toString();
    }

    @Override
    public void updateTyre() {
        for (int i = 0; i < getWheelsCount(); i++) {
            System.out.println("Меняем " + i + " покрышку у велосипеда");
        }
    }

    @Override
    public void service() {
        updateTyre();
    }

}
