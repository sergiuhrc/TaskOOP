package com.endava;

import com.endava.firsttask.two.Circle;
import com.endava.firsttask.one.Square;
import com.endava.firsttask.three.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Square s = new Square(4);
        System.out.println("Square area: "+s.calcArea());
        System.out.println("Square perimeter: "+s.calcPerimeter());

        Circle c = new Circle(5);
        System.out.println("Circle area: "+c.calcPerimeter());
        System.out.println("Circle perimeter: "+c.calcArea());

        Student s1 = new Student();
        s1.setData("Sergiu",23);
        Student s2 = new Student();
        s2.setData("Sandu",11);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(s1.getAge());
        list.add(s2.getAge());
        System.out.println("Average age: "+getAverageAge(list));

    }
    public static int getAverageAge(ArrayList<Integer> list){
        int container=0;
        for (int i = 0; i <list.size() ; i++) {
            container+=list.get(i);
        }
        int averageAge = container/list.size();
        return averageAge;
    }
}
