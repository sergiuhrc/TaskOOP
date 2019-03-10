package com.endava.firsttask.seven;

import com.endava.firsttask.six.Employee;

public class Manager extends Employee {
    @Override
    public double getSalary(){
        double bonus = (50 * (getTariffPerHour()*hours)) /100;
        return ( getTariffPerHour()*hours) +bonus;
    }
}
