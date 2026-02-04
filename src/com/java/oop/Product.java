package com.java.oop;

public class Product {
    int id;
    String name;
    float maxRetailPrice, discountPercentage, stateTax, centralTax,finalProductPrice; // discountAmount, stateTaxAmount, centralTaxAmount, priceAfterDiscount, totalTaxAmount,  finalBill, totalSaved;
    //int quantity;
    int shipmentCharges;
    //int availableStock;
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

    void displayProduct(){
        System.out.printf("Id                  : %-2d%n", id);
        System.out.printf("Name                : %-10s%n", name);
        System.out.printf("MRP                 : %-8.2f%n", maxRetailPrice);
        System.out.printf("State Tax           : %-4.2f%%%n", stateTax);
        System.out.printf("Central Tax         : %-4.2f%%%n", centralTax);
        System.out.printf("Discount            : %-4.2f%%%n", discountPercentage);
        System.out.printf("Shipping Charges    : %-4d%n", shipmentCharges);
        System.out.printf("Final Product Price : %-4.2f%n", finalProductPrice);
    }
}
