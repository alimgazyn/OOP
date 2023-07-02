package OOP;

public class Mobile implements Device {
    private String model;
    private double cost;

    public Mobile() {
    }

    public Mobile(String model, double cost) {
        this.model = model;
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public void discount(int percent) {
        double res = cost * (100 - percent) / 100;
        setCost(res);

    }

    @Override
    public String toString() {
        return "Mobile{" +
                "model='" + model + '\'' +
                ", cost=" + cost +
                '}';
    }

}
