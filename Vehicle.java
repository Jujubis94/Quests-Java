public abstract class Vehicle {
    private String brand;
    private int kilometers;

    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public abstract String doStuff();

    String getBrand() {
        return this.brand;
    }

    int getKilometers() {
        return this.kilometers;
    }

    void setBrand(String brand) {
     this.brand = brand;
    }

    void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
}
