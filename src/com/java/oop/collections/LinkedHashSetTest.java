package com.java.oop.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LinkedHashSetTest {
    static void main(String[] args) {
        LinkedHashSet<Product> productsSet = new LinkedHashSet<>();
        productsSet.add(new Product("111", "LENOVO", 99999.9));
        productsSet.add(new Product("112", "LENOVO", 89999.9));
        productsSet.add(new Product("113", "DELL", 79999.9));
        productsSet.add(new Product("111", "HP", 99999.9));
        System.out.println(productsSet);
        System.out.println(productsSet.size());
        System.out.println(productsSet.contains(new Product("112", "LENOVO", 89999.9)));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product id :");
        String productId = scanner.next();
        Iterator<Product> iterator = productsSet.iterator();
        while (iterator.hasNext()){
            Product p = iterator.next();
            if(p.getId().equals(productId)){
                iterator.remove();
            }
        }
        System.out.println(productsSet);
        System.out.println(productsSet.isEmpty());
    }
}
