/**
 * @author pilzhere
 * @created 10/09/2021 - 5:50 PM
 * @project stodgrupp
 */
public class Main {
    public static void main (String[] args) {
        Truck truck = new Truck("Volvo");
        truck.load();
        System.out.println("hej");
    }

    public static void nain(String[] args) {

        double h = 10.0;
        h  = (float)h;

        float j = 10.0f;
        //j = (double)j;

        float[] fVekt = new float[5];
        int tal = 35;
        int tal2 = 0;

        add(tal);
        tal2 = fill(fVekt);

        System.out.printf("%d\n%d\n", tal2, tal);
        for (int i = fVekt.length - 1; i >= 0; i--)
            System.out.printf("%.3f finns på plats %d\n", fVekt[i], i);

    }

    public static int fill(float[] a) {
        for (int i = 0; i < a.length; i++)
            a[i] = i * 20 / 100 + 3;
        return 15;
    }

    public static void add(int tal) {
        tal *= 10;
    }


}
