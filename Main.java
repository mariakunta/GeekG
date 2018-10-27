package com.company;

public class Main {
    public static void main(String[] args) {
        /*Dog reksio = new Dog("Reksio");
        reksio.name = "Reks";
        reksio.szczekaj();

        Dog newDog = new Dog();
        newDog.name = "Nowy Reks";
        System.out.println(newDog);*/

        Dog reksio = new Dog("Reks");
        System.out.println(reksio.getNumberOfLegs());
        reksio.setNumberOfLegs(3);
        System.out.println(reksio.getNumberOfLegs());
        Dog.sayHi();

        Osoba osoba1 = new Osoba("Maria", "Kunta", "ukr", 23 , Plec.FEMALE);
        Osoba osoba2 = new Osoba("Maria", "Kunta", "ukr", 23 , Plec.FEMALE);

        System.out.println(osoba1.equals(osoba2));
    }
}
