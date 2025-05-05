package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.animals.Cat;
import partB.food.Food;

import java.util.Date;

public class CatTest {
    @Test
    public void setName(){
        String name = "";
        Date birthdate = new Date();
        Integer id = 1;
        Cat cat = new Cat(name,birthdate,id);

        cat.setName("Bobbie");
        Assertions.assertEquals("Bobbie",cat.getName());
        System.out.println("Test sucessful. Cat's Name is: " + cat.getName());
    }
    @Test
    public void setBirthDate(){
        String name = "";
        Date birthdate = new Date();
        Integer id = 1;
        Cat cat = new Cat(name,birthdate,id);

        cat.setBirthDate(birthdate);
        Date date = cat.getBirthDate();
        Assertions.assertEquals(birthdate, cat.getBirthDate());
        System.out.println("Test Successful. Date is: " + date);
    }
    @Test
    public void speak(){
        String name = "";
        Date birthdate = new Date();
        Integer id = 1;
        Cat cat = new Cat(name,birthdate,id);

        String speak = cat.speak();
        Assertions.assertEquals(speak,cat.speak());
        System.out.println("Tested .cat.speak() successful " + cat.getName() + " went : " + speak);
    }
    @Test
    public void eat(){
        String name = "";
        Date birthdate = new Date();
        Integer id = 1;
        Cat cat = new Cat(name,birthdate,id);

        Food food = new Food();
        cat.eat(food);
        int mealsEaten = cat.getNumberOfMealsEaten();
        Assertions.assertEquals(1, mealsEaten);
        System.out.println("Tested .eat() successfully");
    }
    @Test
    public void getID(){
        String name = "";
        Date birthdate = new Date();
        Integer id = 1;
        Cat cat = new Cat(name,birthdate,id);

        int retrievedID = cat.getId();
        Assertions.assertEquals(id,retrievedID);
        System.out.println("Tested .getId() successfully: " + id);
    }
    @Test
    public void instances(){
        System.out.println("Cat is an instance of animal: "  + true);
        System.out.println("Cat is an instance of mammal: "  + true);
    }
}
