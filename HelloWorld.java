package com.company;

public class HelloWorld {
    public static void main(String[] args) {
        int a =9;
        int b = 5;
        double c = (double)a/b;
        String name ="Hello World";
        int[] tablica = {1,2, 3};
        double[] tablica1 = new double[10];
        tablica1[0] = 0.9;
        int[][] f =new int[3][];
        f[0] = new int[5];
        f[1] = new int[3];
        f[2] = new int[2];
        f[1][0] = 1;
        System.out.println(f);
        System.out.println(tablica1[1]);
        System.out.println("Hello World!");
        System.out.println(a++);
        System.out.println(a);
        System.out.println(a != b);
        System.out.println(!(b<a || false));
        System.out.println("-----------------------------------");


    }
}
