package com.endava.firsttask.seven;

public class UseEmployee {


    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.hours = 10;
        System.out.println(manager.getTariffPerHour());
        System.out.println(manager.getSalary());
    }
}
