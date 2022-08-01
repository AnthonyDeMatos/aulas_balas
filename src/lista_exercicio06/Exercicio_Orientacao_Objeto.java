package lista_exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Orientacao_Objeto {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double cotacaoDollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double comprarDollar = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(comprarDollar, cotacaoDollar);
        System.out.printf("Amount to be paid in reais = %.2f%n", result);


        sc.close();

    }

}
