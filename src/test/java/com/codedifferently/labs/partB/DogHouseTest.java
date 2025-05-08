package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import partB.animals.Cat;
import partB.animals.Dog;
import partB.storage.CatHouse;
import partB.storage.DogHouse;

import java.util.Date;

public class DogHouseTest {
    @BeforeEach
    public void setup(){
        DogHouse.clear();
    }
    @Test
    public void add(){
        String name = "Reacher";
        Date birthdate = new Date();
        Integer id = 1;
        Dog dawg = new Dog(name,birthdate,id);

        DogHouse.add(dawg);
        Dog retrievedDog = DogHouse.getDogById(id);

        Assertions.assertEquals(dawg.getName(),retrievedDog.getName());
        Assertions.assertEquals(dawg.getBirthDate(),retrievedDog.getBirthDate());
        Assertions.assertEquals(dawg.getId(),retrievedDog.getId());

        System.out.println("Test is Successful. We've retrieved: " + name + ". Their birthdate: " + birthdate + ". And ID: " + id);
    }
    @Test
    public void removeDog(){
        String name = "Reacher";
        Date birthdate = new Date();
        Integer id = 1;
        Dog dawg = new Dog(name,birthdate,id);

        DogHouse.remove(dawg);
        DogHouse.remove(1);
        Dog retrievedDog =DogHouse.getDogById(id);
        Assertions.assertNull(retrievedDog);

        System.out.println("Test Successful. Reacher's been E L I M I N A T E D");
    }
    @Test
    public void removeDogID(){
        String name = "Reacher";
        Date birthdate = new Date();
        Integer id = 1;
        Dog dawg = new Dog(name,birthdate,id);

        DogHouse.add(dawg);
        DogHouse.remove(id);
        Dog retrievedDog = DogHouse.getDogById(id);
        Assertions.assertNull(retrievedDog);

        System.out.println("Test a success. ID removed");
    }
    @Test
    public void getDogById(){
        String name = "Reacher";
        Date birthdate = new Date();
        Integer id = 1;
        Dog dawg = new Dog(name,birthdate,id);

        DogHouse.add(dawg);
        Dog retrievedDog = DogHouse.getDogById(id);
        Assertions.assertEquals(dawg.getId(),retrievedDog.getId());

        System.out.println("Test completed Retrieved ID is: " + id);
    }
    @Test
    public void getNumberOfDogs() {
        String name = "K-9";
        Date birthdate = new Date();
        Integer id = 2;

        String name2 = "Kypto";
        Date birthdate2 = new Date();
        Integer id2 = 3;

        Dog dawg2 = new Dog(name, birthdate, id);

        Dog dawg3 = new Dog(name2, birthdate2, id2);

        DogHouse.add(dawg2);
        DogHouse.add(dawg3);

        int numofDogs = DogHouse.getNumberOfDogs();
        Assertions.assertEquals(2, numofDogs);

        System.out.println("Test Success. There are: " + numofDogs + " cats." + "Newly added Dogs are: " + name + " And " + name2);
    }
}
