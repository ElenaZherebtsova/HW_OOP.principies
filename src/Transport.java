public class Transport {

    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return this.modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public String toString() {
        return " " + modelName + ", количество колес = " + wheelsCount + " шт.";
    }

    public void updateTyre() {
        System.out.println("1. Установить автомобиль на стояночный тормоз.");
        System.out.println("2. Установить домкрат и поднять автомобиль на домкрате.");
        System.out.println("3. Открутить болты и снять колесо.");
        System.out.println("4. Заменить покрышку.");
        System.out.println("5. Установить колесо на место и закрутить болты.");
        System.out.println("6. Опустить автомобиль на землю и убрать домкрат.");
        System.out.println("7. Проверить давление в шине и при необходимости подкачать  колесо.");
        System.out.println("8. ГОТОВО!");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель:");
        System.out.println("1. Проверить наличие следов рабочих жидкостей.");
        System.out.println("2. Проверить масло.");
        System.out.println("3. Проверить работу мотора на посторонние шумы.");
        System.out.println("4. Осуществить  проверку вибрации.");
        System.out.println("5. Проверить подушки крепления.");
        System.out.println("6. Проверить выхлопную систему.");
        System.out.println("7. Проверить систему питания.");
        System.out.println("8. ГОТОВО! Двигатель исправен!");
    }
}
