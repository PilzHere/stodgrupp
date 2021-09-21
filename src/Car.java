public abstract class Car {
    protected static String GPS_SATTERITE = "Conrad";

    protected String brand;
    private int tires;
    private boolean isDriving;

    public Car (String brand) {
        this.brand = brand;
    }

    public Car (String brand, int tires) {
        this(brand);
        this.tires = tires;
    }

    public boolean isDriving () {
        return isDriving;
    }

    public void setDriving (boolean driving) {
        isDriving = driving;
    }

    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }
}
