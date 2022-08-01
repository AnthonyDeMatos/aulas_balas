import Aula71_util.Aula71_Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Aula71_Codigo_2 {


    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        System.out.println(" ");

        double c = Aula71_Calculator.circumference(radius);

        double v = Aula71_Calculator.volume(radius);

        System.out.printf("Circumference %.2f%n", c);
        System.out.printf("Volume %.2f%n", v);
        System.out.printf("PI value:  %.2f%n", Aula71_Calculator.PI);


        sc.close();
    }

}
