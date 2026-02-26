package com.java.oop.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("111","DELL",99999.9));
        products.add(new Product("112","HP",89999.9));
        products.add(new Product("113","LENOVO",79999.9));
        products.add(new Product("112","HP",89999.9));
        System.out.println(products);
        System.out.println(products.size());
        System.out.println(products.get(2));
        products.add(2, new Product("115","ACER",69999));
        System.out.println(products);
        System.out.println(products.size());
        products.remove(4);
        System.out.println(products);
        products.set(2,new Product("116","MAC", 99999.9));
        System.out.println(products);
        for (Product product : products){
            System.out.println(product);
        };
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()){
            Product p = iterator.next();
            System.out.println(p);
        }

    }
}
