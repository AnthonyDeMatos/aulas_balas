package lista_exercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Estrutura_Sequencial02 {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        double raio = sc.nextDouble();
        double pi = 3.14159;
        double area;

        area = pi * raio * raio;


        System.out.printf("Valor é: %.4f", area);

        sc.close();







    }

}