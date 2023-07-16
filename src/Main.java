public class Main {
    public static void main(String[] args) {

        Bicycle stern = new Bicycle("Stern", 2);
        Car audi = new Car("Ауди", 4);
        Truck scania = new Truck("Scania", 6);

        ServiceStation station = new ServiceStation();
        System.out.println();
        station.check(audi);
        System.out.println();
        station.check(stern);
        System.out.println();
        station.check(scania);

    }
}