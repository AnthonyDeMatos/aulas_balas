package lista_exercicio_01;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Estrutura_Sequencial05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1 = sc.nextInt();
        int numero1 = sc.nextInt();
        double valorUnitario1 = sc.nextDouble();

        int codigo2 = sc.nextInt();
        int numero2 = sc.nextInt();
        double valorUnitario2 = sc.nextDouble();

        double pagar = numero1 * valorUnitario1 + numero2 * valorUnitario2;

        System.out.printf("VALOR A PAGAR: R$ %.2f", pagar);

        sc.close();
    }

}
