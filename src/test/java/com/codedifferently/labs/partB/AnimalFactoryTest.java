package com.codedifferently.labs.partB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.animals.Cat;
import partB.animals.Dog;
import partB.factories.AnimalFactory;

import java.util.Date;

public class AnimalFactoryTest {
    @Test
    public void dogCreateTest(){
        String name = "Reacher";
        Date birthDate = new Date();

        Dog dawg = AnimalFactory.createDog(name,birthDate);

        Assertions.assertEquals(name, dawg.getName());
        Assertions.assertEquals(dawg.getBirthDate(),birthDate);

        System.out.println("Tests Successful");
        System.out.println("Dog's name is: " + name);
        System.out.println("Birth Date is: " + birthDate);

    }

    @Test
    public void catCreateTest(){
        String name = "Bobbie";
        Date birthDate = new Date();

        Cat cat = AnimalFactory.createCat(name,birthDate);

        Assertions.assertEquals(name, cat.getName());
        Assertions.assertEquals(cat.getBirthDate(),birthDate);

        System.out.println("Tests Successful");
        System.out.println("Cat's name is: " + name);
        System.out.println("Birth Date is: " + birthDate);

    }
}