public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            int n = i+1;
            System.out.println("Меняем покрышку №" + n);
        }
    }
    @Override
    public void doService() {
        System.out.println("Обслуживаем " + this.getModelName());
        updateTyre();
    }
}
