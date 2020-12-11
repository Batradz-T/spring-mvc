package web.model;

public class Car {
    private String fuel;
    private String transmission;
    private String model;


    public Car(String fuel, String transmission, String model) {
        this.fuel = fuel;
        this.transmission = transmission;
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "fuel='" + fuel + '\'' +
                ", transmission='" + transmission + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
