package com.company;

import java.util.Scanner;

public class RunDicer {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe");
        Scanner scanner = new Scanner(System.in);//int
        Dicer d1 = new Dicer(scanner.nextInt());

        int[] kostki = d1.rzucamyKostki();

        int sum = d1.dodajWartosci(kostki);
        System.out.println("Sum "+sum);
    }
}
