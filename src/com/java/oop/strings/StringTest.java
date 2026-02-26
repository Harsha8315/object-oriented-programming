package com.java.oop.strings;

import java.util.Locale;

public class StringTest {
    static void main(String[] args) {
        String username = "Harsha";
        String password = " add123 ";
        String email = "harsha123@gmail.com";
        //charAt, compareTo ,ignore, equals , concat, lowercase , uppercase, string to array , trim, split

        System.out.println(username.charAt(2));
        System.out.println("-----------------------------------------");
        System.out.println(username.compareTo(password));
        System.out.println("-----------------------------------------");
        System.out.println(username.compareToIgnoreCase(email));
        System.out.println("-----------------------------------------");
        //EQUALS
        if (password.equals("add123")){
            System.out.println("Login Successfull");
        } else {
            System.out.println("Invalid Credentials");
        }
        System.out.println("-----------------------------------------");
        //CONCAT
        String str1 = new String(username.concat("Vardhan"));
        System.out.println(str1);
        System.out.println("-----------------------------------------");
        //LOWERCASE
        String lower = new String(username.toLowerCase());
        System.out.println(lower);
        System.out.println("-----------------------------------------");
        //UPPERCASE
        String upper = new String(username.toUpperCase());
        System.out.println(upper);
        System.out.println("-----------------------------------------");
        //STRING TO ARRAY
        char[] chars  = username.toCharArray();
        for(char cr : chars){
            System.out.println("Elements in Array : " + cr);
        }
        System.out.println("-----------------------------------------");
        //TRIM
        System.out.println(password);
        String newPassword = password.trim();
        System.out.println(newPassword);
        System.out.println("-----------------------------------------");
        //SPLIT
        String[] newEmail = email.split("@");
        for(String e : newEmail) {
            System.out.println(e);
        }
    }
}
