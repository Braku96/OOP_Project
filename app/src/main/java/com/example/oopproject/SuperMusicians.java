package com.example.oopproject;

public class SuperMusicians extends Musicians{ //Miras kullanılırken ilgili sınıfa extends girip miras alınacak sınıfın ismi yazılır
    //miras alınacak sınıfta constructer var ise miras alan sınıfta da aynı constructer tanımlı olmalıdır.

    public SuperMusicians(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    public String Sing(){
        return "Nothing Else Matters";
    }
}
