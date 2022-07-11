package lista_exercicio_01;

import java.util.Scanner;

public class Exercicio_Estrutura_Sequencial01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt();
        int i2 = sc.nextInt();

        int soma = i1 + i2;

        System.out.printf("A Soma Total foi: %d", soma);

        sc.close();


    }

}
