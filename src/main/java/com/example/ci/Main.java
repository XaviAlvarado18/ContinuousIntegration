package com.example.ci;

import main.java.com.example.ci.MathUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== DEMO MathUtils ===");

        // Ya puedes usar MathUtils directamente sin prefijo largo
        long n = 7;
        System.out.println("square(" + n + ") = " + MathUtils.square(n));

        int f = 5;
        System.out.println("factorial(" + f + ") = " + MathUtils.factorial(f));

        long p1 = 29, p2 = 30;
        System.out.println(p1 + " es primo? " + MathUtils.isPrime(p1));
        System.out.println(p2 + " es primo? " + MathUtils.isPrime(p2));

        long a = 48, b = 18;
        System.out.println("gcd(" + a + "," + b + ") = " + MathUtils.gcd(a, b));
        System.out.println("lcm(" + a + "," + b + ") = " + MathUtils.lcm(a, b));

        try {
            System.out.println("factorial(21) = " + MathUtils.factorial(21));
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción esperada: " + e.getMessage());
        }

        try {
            System.out.println("gcd(0,0) = " + MathUtils.gcd(0, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción esperada: " + e.getMessage());
        }

        try {
            System.out.println("lcm(0,0) = " + MathUtils.lcm(0, 0));
        } catch (IllegalArgumentException e) {
            System.out.println("Excepción esperada: " + e.getMessage());
        }
    }
}
