package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import partB.animals.Cat;

import partB.storage.CatHouse;

import java.util.ArrayList;
import java.util.Date;

public class CatHouseTest {

    @BeforeEach
    public void setUp(){
        CatHouse.clear();
    }
    @Test
    public void add(){
        String name = "MeowMeow";
        Date birthdate = new Date();
        Integer id = 1;
        Cat cat = new Cat(name,birthdate,id);

        CatHouse.add(cat);
        Cat retrievedCat = CatHouse.getCatById(id);

        Assertions.assertEquals(cat.getName(),retrievedCat.getName());
        Assertions.assertEquals(cat.getBirthDate(),retrievedCat.getBirthDate());
        Assertions.assertEquals(cat.getId(),retrievedCat.getId());

        System.out.println("Test is Successful. We've retrieved: " + name + ". Their birthdate: " + birthdate + ". And ID: " + id);
    }
    @Test
    public void removeCat(){
        String name = "MeowMeow";
        Date birthdate = new Date();
        Integer id = 1;
        Cat cat = new Cat(name,birthdate,id);

        CatHouse.remove(cat);
        CatHouse.remove(1);
        Cat retrievedCat = CatHouse.getCatById(id);
        Assertions.assertNull(retrievedCat);

        System.out.println("Test Successful. Meow Meow's been E L I M I N A T E D");
    }
    @Test
    public void removeID(){
        String name = "MeowMeow";
        Date birthdate = new Date();
        Integer id = 1;
        Cat cat = new Cat(name,birthdate,id);

        CatHouse.add(cat);
        CatHouse.remove(id);
        Cat retrievedCat = CatHouse.getCatById(id);
        Assertions.assertNull(retrievedCat);

        System.out.println("Test a success. ID removed");
    }
    @Test
    public void getCatById(){
        String name = "MeowMeow";
        Date birthdate = new Date();
        Integer id = 1;
        Cat cat = new Cat(name,birthdate,id);

        CatHouse.add(cat);
        Cat retrievedCat = CatHouse.getCatById(id);
        Assertions.assertEquals(cat.getId(),retrievedCat.getId());

        System.out.println("Test completed Retrieved ID is: " + id);
    }
    @Test
    public void getNumberOfCats(){
        String name = "Dre";
        Date birthdate = new Date();
        Integer id = 2;

        String name2 = "Sammy";
        Date birthdate2 = new Date();
        Integer id2 = 3;

        Cat cat2 = new Cat(name,birthdate,id);

        Cat cat3 = new Cat(name2,birthdate2,id2);

        CatHouse.add(cat2);
        CatHouse.add(cat3);

        int numofCats = CatHouse.getNumberOfCats();
        Assertions.assertEquals(2,numofCats);

        System.out.println("Test Sucess. There are: " + numofCats +" cats." + "Newly added cats are: " + name + " And " + name2);
    }
}