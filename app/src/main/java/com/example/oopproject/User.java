package com.example.oopproject;

public class User extends People {
    //Properties sınıf özellikleri
    //Sınıflar birden fazla sınıfa extend edilemez ancak arayüze implemente edilir
    String name;
    String job;

    //Constructer oluşumu
    public User(String name, String job) {
        this.name = name;
        this.job = job;
        System.out.println("User Created");
    }
}
