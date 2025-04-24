package com.codedifferently.labs.partA.ex01;

import partA.ex01.CheckingAccount;

public class CheckingAccountTest {
    public static void main(String[] args){
        CheckingAccount User = new CheckingAccount();
        User.balance = 600.00;
        User.name = "User";

        System.out.println(User.balance);

        User.deposit(50);

        System.out.println(User.balance);
        System.out.println(User.name);
    }

}
