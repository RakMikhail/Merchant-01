package app;

import java.util.Scanner;

public class App {

    static String merchantName;
    static String email;
    static String phone;
    static String productName;
    static int quantity;
    static double price;
    static String roundBonus;
    static ProductA product;
    static MerchantA merchantA;
    static String infoMerchant;
    static String infoProduct;

    public static void main(String[] args) {
        doInputs();
        showData(processData());

    }

    private static void doInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter merchant name: ");
        merchantName = scanner.nextLine();
        System.out.print("Enter merchant phone: ");
        phone = scanner.nextLine();
        System.out.print("Enter merchant email: ");
        email = scanner.nextLine();
        System.out.print("Enter product name: ");
        productName = scanner.nextLine();
        System.out.print("Enter product quantity: ");
        quantity = scanner.nextInt();
        System.out.print("Enter product price: ");
        price = scanner.nextDouble();
    }

    private static String processData() {
        merchantA = new MerchantA(merchantName, phone, email);
        infoMerchant = merchantA.infoMerchant();
        product = new ProductA(productName, quantity, price);
        infoProduct = product.infoProduct();
        double sales = product.calcSales(quantity, price);
        roundBonus = Rounder.roundValue(merchantA.calcBonus(sales));
        return infoMerchant + infoProduct + "\nBonus (USD): " + roundBonus;
    }

    private static void showData(String output) {
        System.out.println(output);
    }
}
