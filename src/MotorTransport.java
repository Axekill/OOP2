public abstract class MotorTransport extends WheelsTransport {
    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    public abstract void checkEngine();
}
