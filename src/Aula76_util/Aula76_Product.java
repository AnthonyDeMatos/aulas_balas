package Aula76_util;

public class Aula76_Product {
    public static String name;
    public static double price;
    public static int quantity;

    public Aula76_Product(String name, double price, int quantity) {
        Aula76_Product.name = name;
        Aula76_Product.price = price;
        Aula76_Product.quantity = quantity;
    }

    public double totalValueInStock() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        Aula76_Product.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        Aula76_Product.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}