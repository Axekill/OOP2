public abstract class WheelsTransport implements Transport {
    private String modelName;
    private int wheelsCount;

    public WheelsTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public String toString() {
        return "Модель: " + modelName +
                ", Колес:" + wheelsCount;
    }

    public abstract void updateTyre() ;

}
