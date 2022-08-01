package lista_exercicio06;

public class CurrencyConverter {

        public static double IOF = 0.06;

        public static double dollarToReal (double comprarDollar, double cotacaoDollar) {
            return comprarDollar * cotacaoDollar * (1.0 + IOF);
        }


}
