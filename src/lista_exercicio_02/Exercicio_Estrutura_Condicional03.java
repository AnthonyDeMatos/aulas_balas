package lista_exercicio_02;

import java.util.Scanner;

public class Exercicio_Estrutura_Condicional03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0|| b % a == 0) {
            System.out.println("SAO MULTIPLOS");
        }
        else {
            System.out.println("NAO SAO MULTIPLOS");
        }


        sc.close();

    }

}
