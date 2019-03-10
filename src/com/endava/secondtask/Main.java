package com.endava.secondtask;

public class Main {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(-2000);
        SavingsAccount saver2 = new SavingsAccount(3000);
        SavingsAccount.modifyInterestRate(3);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println(saver1);
        System.out.println(saver2);
        saver1.setSavingsBalance(-2008.33);
        saver1.calculateMonthlyInterest();
        System.out.println(saver1);
        saver1.setSavingsBalance(-1016.69);
        saver1.calculateMonthlyInterest();
        SavingsAccount.modifyInterestRate(4);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println(saver1);
        System.out.println(saver2);
    }
}
