public class Truck extends Transport{

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Грузовик:" + super.toString();
    }

    public void checkTrailer () {
        System.out.println("Проверка трейлера:");
        System.out.println("1. Проверить соединения прицепа к автомобилю.");
        System.out.println("2. Проверить работоспособность задних фонарей.");
        System.out.println("3. Проверить герметичность закрывания двери.");

    }


}
