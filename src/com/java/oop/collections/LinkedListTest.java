package com.java.oop.collections;

import java.util.LinkedList;

public class LinkedListTest {
    static void main(String[] args) {
        LinkedList<Product> products = new LinkedList<>();
        products.add(new Product("111","DELL",99999.9));
        products.add(new Product("112","HP",89999.9));
        products.add(new Product("113","LENOVO",79999.9));
        products.add(new Product("112","HP",89999.9));
        System.out.println(products);
        System.out.println(products.size());
        System.out.println(products.get(2));
        System.out.println(products);
        products.add(2, new Product("115","ACER",69999));
        System.out.println(products.get(2));
        System.out.println(products);
        System.out.println(products.size());
        products.remove(3);
        System.out.println(products);
        products.set(2,new Product("116","MAC", 99999.9));
        System.out.println(products);
    }
}
