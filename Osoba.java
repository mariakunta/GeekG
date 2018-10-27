package com.company;

import java.util.Objects;

public class Osoba {
    private String name;
    private String surname;
    private String obywatelstwo;
    private int age;
    private Plec plec;

    public Osoba(String name, String surname, String obywatelstwo, int age, Plec plec) {
        this.name = name;
        this.surname = surname;
        this.obywatelstwo = obywatelstwo;
        this.age = age;
        this.plec = plec;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getObywatelstwo() {
        return obywatelstwo;
    }

    public Plec getPlec() {
        return plec;
    }

    public void setPlec(Plec plec) {
        this.plec = plec;
    }

    public void setObywatelstwo(String obywatelstwo) {
        this.obywatelstwo = obywatelstwo;
    }
    public void jeszSniadania(){
        System.out.println("");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object other){
        Osoba otherPerson = (Osoba) other;
        return this.name.equals(otherPerson.name) &&
                this.age == (otherPerson.age) &&
                this.obywatelstwo.equals(otherPerson.obywatelstwo) &&
                this.plec == otherPerson.plec &&
                this.surname.equals(otherPerson.surname);

    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname(), getObywatelstwo(), getAge(), getPlec());
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", obywatelstwo='" + obywatelstwo + '\'' +
                ", age=" + age +
                ", plec=" + plec +
                '}';
    }
}
/*git init   stworzyc
git clone
git add
 git commit
 git push
 git pull
 git status
 git log
 git merge
 git checkout(-b)
git stash
 */