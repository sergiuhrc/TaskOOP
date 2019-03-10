package com.endava.firsttask.six;

public class UseEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.hours = 10;
        System.out.println(employee.getTariffPerHour());
        System.out.println(employee.getSalary());
    }
}
