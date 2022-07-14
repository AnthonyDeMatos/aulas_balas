package lista_exercicio_04;

import java.util.Scanner;

public class Exercicio_Estrutura_Repetitiva_For05 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }

        System.out.println(fat);

        sc.close();


    }

}
