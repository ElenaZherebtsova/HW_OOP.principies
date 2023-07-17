public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Грузовик:" + super.toString();
    }

    public void checkTrailer() {
        System.out.println("Проверка трейлера.");
    }

    public void service() {
        super.service();
        checkTrailer();
    }

}
