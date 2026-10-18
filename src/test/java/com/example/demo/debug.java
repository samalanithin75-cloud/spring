
package com.example.demo;

public class debug {

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {

        int x = 10;
        int y = 20;

        int total = add(x, y);

        System.out.println("Total: " + total);
        System.out.println("Program finished");
    }
}
