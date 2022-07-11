package lista_exercicio_02;

import java.util.Scanner;

public class Exercicio_Estrutura_Condicional02 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("PAR");

        }
        else {
            System.out.println("IMPAR");

        }

        sc.close();

    }

}
