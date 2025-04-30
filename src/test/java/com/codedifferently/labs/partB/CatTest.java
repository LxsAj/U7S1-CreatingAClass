package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.animals.Cat;

import java.util.Date;

public class CatTest {
    public static void main(String[]args){
        String name = "Bobbie";
        Date birthdate = new Date();
        int id = 0;
        Cat cat = new Cat(name,birthdate,id);

        cat.setName("Bobbie");
        Assertions.assertEquals("Bobbie",cat.getName());
        System.out.println("Test sucessfuly. Cat's Name is: " + cat.getName());

        cat.setBirthDate(birthdate);
        Date date = cat.getBirthDate();
        Assertions.assertEquals(birthdate, cat.getBirthDate());
        System.out.println("Test Successful. Date is: " + date);



        Assertions.assertEquals(name, cat.getName());
        Assertions.assertEquals(birthdate, cat.getBirthDate());
        Assertions.assertEquals(id, cat.getId());
    }

}
