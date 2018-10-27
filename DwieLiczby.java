package com.company;

import java.util.Scanner;

public class DwieLiczby {
    public static void main(String[] args) {
        System.out.println("Daj liczbe 1");
        Scanner scanner1 = new Scanner(System.in);
        int liczba1 = scanner1.nextInt();
        System.out.println("Liczba 1: "+ liczba1);

        System.out.println("Daj liczbe 2");

        int liczba2 = scanner1.nextInt();
        System.out.println("Liczba 2 :"+ liczba2);

        if(liczba2 == 0){
            System.out.println("Nie! Podaj inna liczbe!");
        } else{
            double d = liczba1 / (double) liczba2;
            System.out.println("Wynik: "+ d);
        }
    }

}
