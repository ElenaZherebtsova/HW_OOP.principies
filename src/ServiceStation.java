public class ServiceStation {
    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 1; i < car.getWheelsCount()+1; i++) {
                System.out.println("Меняем колесо № "+ i + ":");
                car.updateTyre();
            }
            car.checkEngine();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 1; i < truck.getWheelsCount()+1; i++) {
                System.out.println("Меняем колесо № "+ i + ":");
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 1; i < bicycle.getWheelsCount()+1; i++) {
                System.out.println("Меняем колесо № "+ i + ":");
                bicycle.updateTyre();
            }
        }
    }
}