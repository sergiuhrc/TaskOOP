package com.endava.secondtask;


public class SavingsAccount {
    private static double annualInterestRate=5;
    private static double annualIoanRate=4;
    private  double savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest(){


        if(savingsBalance <0){
            double monthlyInterest = (savingsBalance*annualIoanRate)/12;
            savingsBalance += monthlyInterest;
        }else {
                double monthlyInterest = (savingsBalance*annualInterestRate)/12;
                savingsBalance += monthlyInterest;
        }

    }


    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "savingsBalance=" + savingsBalance +
                '}';
    }
}
