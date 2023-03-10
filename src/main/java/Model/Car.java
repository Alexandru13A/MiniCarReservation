package Model;

public class Car {

    private int id;
    private String producer;
    private String model;
    private double price;

    public Car() {

    }

    public Car(int id, String producer, String model, double price) {
        this.id = id;
        this.producer = producer;
        this.model = model;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n" + "Car: " +
                "id=" + id +
                ", producer='" + producer +
                ", model='" + model +
                ", price= $" + price;
    }
}
