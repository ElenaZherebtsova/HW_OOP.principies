public class Main {
    public static void main(String[] args) {

        Bicycle stern = new Bicycle("Stern", 2);
        Car audi = new Car("Ауди", 4);
        Truck scania = new Truck("Scania", 6);
//        System.out.println(stern);
//        stern.updateTyre();
//        System.out.println();

//        System.out.println(audi);
//        audi.updateTyre();
//        System.out.println();
//        audi.checkEngine();

//        System.out.println();
//        System.out.println(scania);


        ServiceStation station = new ServiceStation();
        System.out.println();
       station.check(audi, null, null);
        System.out.println();
        station.check(null, stern, null);
        System.out.println();
        station.check(null, null, scania);

    }
}