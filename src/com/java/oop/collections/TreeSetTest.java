package com.java.oop.collections;

import java.util.TreeSet;

public class TreeSetTest {
    static void main(String[] args) {
        TreeSet<Product> productsSet = new TreeSet<>();
        productsSet.add(new Product("111", "LENOVO", 99999.9));
        productsSet.add(new Product("113", "DELL", 79999.9));
        productsSet.add(new Product("112", "HP", 89999.9));
        productsSet.add(new Product("111", "LENOVO", 99999.9));
        System.out.println(productsSet);
    }
}
