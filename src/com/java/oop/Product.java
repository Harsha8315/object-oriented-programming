package com.java.oop;

import java.util.Scanner;

public class Product {
    int id;
    String name;
    float maxRetailPrice, discountPercentage, stateTax, centralTax,finalProductPrice, finalBill, discountAmount, stateTaxAmount, centralTaxAmount, priceAfterDiscount, totalTaxAmount, totalSaved;
    int quantity;
    int shipmentCharges;
    int availableStock;
    //char membership, menu, continueShopping;

    Product(){
        System.out.println("Constructor is Initialized");
    }

    public Product(int id, String name, float maxRetailPrice, float discountPercentage, float stateTax, float centralTax, float finalProductPrice, int shipmentCharges) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.stateTax = stateTax;
        this.centralTax = centralTax;
        this.finalProductPrice = finalProductPrice;
        this.shipmentCharges = shipmentCharges;
    }

    public Product(int id, String name, float maxRetailPrice, float discountPercentage, float stateTax, float centralTax, int shipmentCharges, int availableStock) {
        this.id = id;
        this.name = name;
        this.maxRetailPrice = maxRetailPrice;
        this.discountPercentage = discountPercentage;
        this.stateTax = stateTax;
        this.centralTax = centralTax;
        this.shipmentCharges = shipmentCharges;
        this.availableStock = availableStock;
    }

    void displayProduct(){
        System.out.printf("Id                  : %-2d%n", id);
        System.out.printf("Name                : %-10s%n", name);
        System.out.printf("MRP                 : %-8.2f%n", maxRetailPrice);
        System.out.printf("State Tax           : %-4.2f%%%n", stateTax);
        System.out.printf("Central Tax         : %-4.2f%%%n", centralTax);
        System.out.printf("Discount            : %-4.2f%%%n", discountPercentage);
        System.out.printf("Shipping Charges    : %-4d%n", shipmentCharges);
        System.out.printf("Available Stock     : %-4dn", availableStock);
//        System.out.printf("Final Product Price : %-4.2f%n", finalProductPrice);
    }
    float calculateDiscount() {
        return maxRetailPrice * discountPercentage / 100;
    }
    float getPriceAfterDiscount(){
        return maxRetailPrice - calculateDiscount();
    }
    float calculateStateTax(){
        return getPriceAfterDiscount() * stateTax / 100;
    }
    float calculateCentralTax(){
        return getPriceAfterDiscount() * centralTax / 100;
    }
    float calculateFinalPrice(){
        return getPriceAfterDiscount() + calculateStateTax() + calculateCentralTax() + shipmentCharges;
    }
    int calculateAvailableStock() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Quantity : ");
        quantity = sc.nextInt();
        return availableStock - quantity;
    }
}
