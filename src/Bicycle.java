public class Bicycle extends Transport {


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return "Велосипед:" + super.toString();
    }


    public void updateTyre() {
        System.out.println("1. Перевернуть веловипед вверх колесами.");
        System.out.println("2. Открутить болты и снять колесо.");
        System.out.println("3. Снять покрышку с колеса, заменить на новую.");
        System.out.println("4. Установить колесо на место, закрепить болты.");
        System.out.println("5. Перевернуть велосипед в исходное положение.");
        System.out.println("6. Проверить давление в шинах, при необходимости накачать колесо.");
        System.out.println("7. ГОТОВО! Можно кататься!");


    }
}
