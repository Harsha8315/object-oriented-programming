package com.java.oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Product product1;
        Product product2;
        Product product3;
        Product product4;
        product1 = new Product(1,"Lenovo", 48889.9F,5.1F, 2.5F, 2.5F, 700.50F, 70 );
        product1.displayProduct();

       product2 = new Product(2,"Dell", 59999.9F,10.1F, 2.5F, 2.5F, 800.50F, 80);
        System.out.printf("Id                  : %-2d%n", product2.id);
        System.out.printf("Name                : %-10s%n", product2.name);
        System.out.printf("MRP                 : %-8.2f%n", product2.maxRetailPrice);
        System.out.printf("State Tax           : %-4.2f%%%n", product2.stateTax);
        System.out.printf("Central Tax         : %-4.2f%%%n", product2.centralTax);
        System.out.printf("Discount            : %-4.2f%%%n", product2.discountPercentage);
        System.out.printf("Shipping Charges    : %-4d%n", product2.shipmentCharges);
        System.out.printf("Final Product Price : %-4.2f%n", product2.finalProductPrice);

        product3 = new Product(3,"HP", 69999.9F, 15.5F, 2.5F, 2.5F, 59999.9F, 80);
        product3.displayProduct();

        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("%-4s %-12s %-10s %-10s %-12s %-10s %-20s %-12s%n",
                "ID","Name","MRP","StateTax","CentralTax","Discount","Shipping Charges","FinalPrice");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.printf("%-4d %-12s %-10.2f %-10.2f %-12.2f %-10.2f %-20d %-12.2f%n",
                product1.id, product1.name, product1.maxRetailPrice, product1.stateTax, product1.centralTax, product1.discountPercentage, product1.shipmentCharges, product1.finalProductPrice
        );
        System.out.printf("%-4d %-12s %-10.2f %-10.2f %-12.2f %-10.2f %-20d %-12.2f%n",
                product2.id, product2.name, product2.maxRetailPrice, product2.stateTax, product2.centralTax, product2.discountPercentage, product2.shipmentCharges, product2.finalProductPrice
        );
        System.out.printf("%-4d %-12s %-10.2f %-10.2f %-12.2f %-10.2f %-20d %-12.2f%n",
                product3.id, product3.name, product3.maxRetailPrice, product3.stateTax, product3.centralTax, product3.discountPercentage, product3.shipmentCharges, product3.finalProductPrice
        );

        product4 = new Product(4, "Acer", 79999, 15.5F, 2.5F, 2.5F, 90, 50 );
        product4.displayProduct();
        float discount = product4.calculateDiscount();
        System.out.println("Discount : " + discount);
        float finalPrice = product4.calculateFinalPrice();
        System.out.println("Final Price : " + finalPrice);
        int availableQuantity = product4.calculateAvailableStock();
        System.out.println("Available Quantity : " + availableQuantity);

    }
}
