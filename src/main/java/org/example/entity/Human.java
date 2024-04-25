package org.example.entity;

import java.util.Scanner;

public class Human {
    Scanner scanner = new Scanner(System.in);
    public String Name;
    public String Surname;
    public int ID;
    public int age;

    public Human(String name, String surname, int ID, int age) {
        Name = name;
        Surname = surname;
        this.ID = ID;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Name:'" + Name + '\'' +
                ", Surname:'" + Surname + '\'' +
                ", ID:" + ID +
                ", age:" + age +
                '}';
    }
}