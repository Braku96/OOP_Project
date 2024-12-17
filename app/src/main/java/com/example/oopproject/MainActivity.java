package com.example.oopproject;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        User myUser = new User("Burak","Engineer");
        myUser.information();

        System.out.println(myUser.information());

        Musicians James = new Musicians("James","Guitar",50); // Encapsulation sınıfa değer girilebilir ancak değiştirilip okunamaz.

        //Inheritance Miras alma
        SuperMusicians Lars = new SuperMusicians("Lars","Guitar",45);
        System.out.println(Lars.Sing());//Musicians içerisindeki özelliklere sahip ve aynı zamanda Supermusicians sınıfındaki sing metoduna da sahip

        James.setAge(60,"Burak"); //setter kullanarak private değeri değiştirebiliriz, Burak şifresini girmeden içeriğin değişmesine izin verilmez.
        System.out.println(James.getAge()); // Getter kullanarak değerin içine ulaşıp okuyabiliyoruz.

        //Polymorphism

        //Static polymorphism
        Mathematics mathematics = new Mathematics();
        System.out.println(mathematics.sum());
        System.out.println(mathematics.sum(5,3));
        System.out.println(mathematics.sum(5,6,8));

        //Dynamic polymorphism

        Animal myAnimal = new Animal();
        myAnimal.sing();  //myAnimal objesi Animal Class yazdırır

        Dog barley = new Dog();
        barley.test(); // barley objesi Animal Class yazdırır
        barley.sing(); // barley objesi Dog Class yazdırır bu duruma Dynamic polymorphism denir

        //Abstract ve Interface kullanımları
        Piano myPiano = new Piano();
        myPiano.brand="Yamaha";
        myPiano.digital=true;
        myPiano.info();

    }



}