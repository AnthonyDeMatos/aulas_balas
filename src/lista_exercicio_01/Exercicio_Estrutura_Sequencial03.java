package lista_exercicio_01;

import java.util.Scanner;

public class Exercicio_Estrutura_Sequencial03 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int v1 = sc.nextInt();
        int v2 = sc.nextInt();
        int v3 = sc.nextInt();
        int v4 = sc.nextInt();

        int total1 = v1 * v2;
        int total2 = v3 * v4;

        int resultado = total1 - total2;

        System.out.printf("DIFERENCA É: %d", resultado);

        sc.close();

    }

}
