package org.example;

public class VerificadorFibonacci {

    public static void main(String[] args) {
        int numero = 21;

        if (pertenceFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean pertenceFibonacci(int num) {
        if (num < 0) return false;
        int a = 0, b = 1;
        while (b < num) {
            int temp = a;
            a = b;
            b = temp + b;
        }

        return b == num;
    }
}
