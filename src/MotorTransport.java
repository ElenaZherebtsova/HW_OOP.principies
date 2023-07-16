public abstract class MotorTransport extends Transport {

    public MotorTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверка двигателя.");

    }

    public void service() {
        super.service();
        checkEngine();
    }
}
