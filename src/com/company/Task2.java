package com.company;

public class Task2 {
    public static void main(String[] args) {
        int a = 5, b = 25, c = 12;
        if (a > b && b > c) {
            System.out.println("c,b,a");
        } else if (b > a && a > c) {
            System.out.println("c,a,b");
        } else if (c > a && c < b) {
            System.out.println(a + " " + c+ " " + b );
        }
    }
}

