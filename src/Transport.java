public abstract class Transport implements Servicable {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
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

