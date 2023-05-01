public class LitersToGallon {
    public static void main (String [] args) {

        double gallons = 1.0;

        for (int i = 0; i < 24; i++) {
                System.out.printf("%.2f", gallons * 3.79);
                System.out.print(" Liters = ");
                System.out.print(gallons);

                if (gallons == 1.0) {
                System.out.println(" Gallon");
                } else {
                    System.out.println(" Gallons");
                }

                gallons += 4;

                if ((i + 1) % 4 == 0) {
                    System.out.println();
                }
        }
    }
}
