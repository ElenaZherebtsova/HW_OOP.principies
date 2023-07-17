public abstract class Transport {

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
        System.out.println("Замена колеса.");

    }

    public void service() {
        for (int i = 1; i < this.getWheelsCount() + 1; i++) {
            System.out.println("Меняем колесо № " + i + ":");
            this.updateTyre();
        }

    }


}
