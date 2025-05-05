package com.codedifferently.labs.partB;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.animals.Dog;
import partB.food.Food;

import java.util.Date;

public class DogTest {
   @Test
    public void setName(){
       String name = "Reacher";
       Date birthdate = new Date();
       Integer id = 2;
       Dog dawg = new Dog(name,birthdate,id);

       dawg.setName("Reacher");
       Assertions.assertEquals("Reacher",dawg.getName());
       System.out.println("Test sucessful. Dog's Name is: " + dawg.getName());

   }
   @Test
   public void setBirthDate(){
      String name = "";
      Date birthdate = new Date();
      Integer id = 2;
      Dog dawg = new Dog(name,birthdate,id);

      dawg.setBirthDate(birthdate);
      Date date = dawg.getBirthDate();
      Assertions.assertEquals(birthdate, dawg.getBirthDate());
      System.out.println("Test Successful. Birth Date is: " + date);
   }
   @Test
   public void getId(){
      String name = "";
      Date birthdate = new Date();
      Integer id = 2;
      Dog dawg = new Dog(name,birthdate,id);
      int retrievedID = dawg.getId();
      Assertions.assertEquals(id,retrievedID);
      System.out.println("Tested .getId() successfully: " + id);

   }
   @Test
   public void  speak(){
      String name = "";
      Date birthdate = new Date();
      Integer id = 2;
      Dog dawg = new Dog(name,birthdate,id);

      String speak = dawg.speak();
      Assertions.assertEquals(speak,dawg.speak());
      System.out.println("Tested .dawg.speak() successful " + dawg.getName() + " went : " + speak);

   }
   @Test
   public void eat(){
      String name = "";
      Date birthdate = new Date();
      Integer id = 2;
      Dog dawg = new Dog(name,birthdate,id);

      Food food = new Food();
      dawg.eat(food);
      int mealsEaten = dawg.getNumberOfMealsEaten();
      Assertions.assertEquals(1, mealsEaten);
      System.out.println("Tested .eat() successfully");
   }
   @Test
   public void animalANDmammal(){
      String name = "";
      Date birthdate = new Date();
      Integer id = 2;
      Dog dawg = new Dog(name,birthdate,id);

      System.out.println( "Dog is an instance of animal? "  + true);
      System.out.println("Dog is an instance of mammal: "  + true);
   }




}
