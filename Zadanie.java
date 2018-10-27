package com.company;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
       int a = 0;
       do{      //robi, pozniej sprawdza
           System.out.println(a);
           a++;
       }while(a < 10);
       /*while(a < 10){
           System.out.println(a);
           a++;

       }*/


        System.out.println("Daj liczbe");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        System.out.println("Wybrales "+ liczba);

    }
}
