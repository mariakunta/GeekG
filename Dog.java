package com.company;

public class Dog {
    private String name;
    private int numberOfLegs = 4 ;



    public Dog(){
        this.numberOfLegs = 4;
    }

    public Dog(String name) {
        this();// wylowuje domyslny konstruktor
        this.name = name;


    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void szczekaj(){
        System.out.println("Hau hau");
    }
    public static void sayHi(){  //statyczna umowa, wykonuje sie dla calej klasy
        System.out.println("hau");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", numberOfLegs=" + numberOfLegs +
                '}';
    }
}
