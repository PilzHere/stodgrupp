/**
 * @author pilzhere
 * @created 10/09/2021 - 5:44 PM
 * @project stodgrupp
 */
public class Truck extends Car implements ITruck {
    public Truck (String brand) {
        super(brand);
    }

    public void doSoemthing() {
        brand = "Mercedez";

        GPS_SATTERITE = "hejsan";
    }

    @Override
    public String getBrand () {
        return super.getBrand();
    }

    public void load () {
        System.out.println("Loading");
    }

    @Override
    public void useEngine () {
        // skriv kod för hur motorn fungerar...
    }
}
