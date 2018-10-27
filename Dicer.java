package com.company;

public class Dicer {
    private int iloscKostek;


    public Dicer(int iloscKostek) {
        this.iloscKostek = iloscKostek;
    }

    public int getIloscKostek() {
        return iloscKostek;
    }

    public void setIloscKostek(int iloscKostek) {
        this.iloscKostek = iloscKostek;
    }

    public int[] rzucamyKostki(){
        int[] wartosci = new int[this.iloscKostek];
        for(int i=0; i<iloscKostek; i++){
           wartosci[i] = (int)(1+Math.random()*6);
            System.out.println("Kostka "+ wartosci[i]);
        }
        return wartosci;

    }



    public int dodajWartosci(int[] wartosci){
        int sum = 0;

        for(int i=0; i < wartosci.length; i++){
            sum += wartosci[i];
        }
        return sum;
    }


}
