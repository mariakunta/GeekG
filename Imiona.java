package com.company;

public class Imiona {
    public static void main(String[] args) {
        String[] tablica = {"Moni" +
                "ka", "Ola", "Ala"};
        int sum = 0;
        for(int i=0; i<tablica.length; i++ ){
            System.out.println(tablica[i].toLowerCase());
            System.out.println(tablica[i].length());
            sum += tablica[i].length();

        }
        System.out.println(sum);
    }
}
