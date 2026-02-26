package com.java.oop.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> productsHashSet = new HashSet<>();
        productsHashSet.add("Harsha");
        productsHashSet.add("Vardhan");
        System.out.println(productsHashSet);

        HashSet<Product> productsSet = new HashSet<>();
        productsSet.add(new Product("111","HP",70000.99));
        productsSet.add(new Product("112","Lenovo",69999.99));
        productsSet.add(new Product("113","Dell",69999.99));
        productsSet.add(new Product("114","HP",70000.99));
        productsSet.add(new Product("112","Lenovo",60000.99));

        System.out.println(productsSet.size());

        Iterator<Product> productIterator = productsSet.iterator();
        while (productIterator.hasNext()) {
            Product product = productIterator.next();
            System.out.println(product);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the id : ");
        String id = sc.next();
        Iterator<Product> productIterator1 = productsSet.iterator();
        while (productIterator1.hasNext()) {
            Product product = productIterator1.next();
            if(product.getId().equals(id)){
                productIterator1.remove();
            }
        }
        System.out.println(productsSet);
        sc.close();

//        productsSet.remove(new Product("333", "HP", "15", "16000"));
//        System.out.println(productsSet);

    }
}
