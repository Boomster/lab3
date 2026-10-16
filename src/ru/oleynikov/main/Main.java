package ru.oleynikov.main;

import ru.oleynikov.birds.*;
import ru.oleynikov.employeedepartment.*;
import ru.oleynikov.node.Node;
import ru.oleynikov.points.*;
import ru.oleynikov.time.Time;

import static ru.oleynikov.inputs.ArgsPow.myPow;
import static ru.oleynikov.inputs.TaskParser.*;

public class Main {
    public static void main(String[] args){
        //1.2+
        System.out.println("1.2");
        Time time = new Time(checkInputIntPos("Time"));
        System.out.println(time);
        Time time1 = new Time(checkInputIntPos("Hours"), checkInputIntMaxPos("Minutes", 60), checkInputIntMaxPos("Seconds", 60));
        System.out.println(time1.getHours());

        //1.11 different branch

        //2.4+
        System.out.println("2.4");
        Node binarynode = new Node();
        System.out.println("Binary tree:");
        binarynode.addValue(checkInputInt("Add number"));
        binarynode.addValue(checkInputInt("Add number"));
        binarynode.addValue(checkInputInt("Add number"));
        binarynode.addValue(checkInputInt("Add number"));
        binarynode.addValue(checkInputInt("Add number"));
        binarynode.addValue(checkInputInt("Add number"));
        System.out.println(binarynode);
        System.out.println(binarynode.checkValue(checkInputInt("Check number")));
        binarynode.deleteValue(checkInputInt("Delete number"));
        binarynode.deleteValue(checkInputInt("Delete number"));
        binarynode.deleteValue(checkInputInt("Delete number"));
        System.out.println(binarynode);
        System.out.println(binarynode.checkValue(checkInputInt("Check number")));


        //3.5+
        System.out.println("3.5");
        Dot3 test = new Dot3(checkInputDouble("x"), checkInputDouble("y"), checkInputDouble("z"));
        System.out.println(test);

        //4.3+
        /*
        System.out.println("4.3");
        Bird bird1 = new Cuckoo();
        Bird bird2 = new Sparrow();
        Bird bird3 = new Parrot(checkInputString("Bird text"));
        bird1.sing();
        bird2.sing();
        bird3.sing();
        System.out.println(bird1);
        System.out.println(bird3);
        //5.2+ in branch birdspackage rookery is in the same package as birds
        System.out.println("5.2");
        Rookery rookery = new Rookery();
        rookery.add(bird2);
        rookery.add(bird1);
        rookery.add(new Sparrow());
        rookery.add(bird3);
        rookery.add(new Cuckoo());
        rookery.add(new Parrot(checkInputString("Bird text")));
        rookery.add(new Cuckoo());
        rookery.add(new Sparrow());
        rookery.add(new Sparrow());
        rookery.callBirds();
        System.out.println(rookery);

         */

        //6.2+
        System.out.println("6.2");
        System.out.println("Point 1");
        Dot2 point1 = new Dot2(checkInputDouble("x"), checkInputDouble("y"));
        System.out.println("Point 2");
        Dot2 point2 = new Dot2(checkInputDouble("x"), checkInputDouble("y"));
        System.out.println("Point 3");
        Dot2 point3 = new Dot2(checkInputDouble("x"), checkInputDouble("y"));
        System.out.println("Points 1 and 2 are equal is: " + point1.equals(point2));
        System.out.println("Points 1 and 3 are equal is: " + point1.equals(point3));
        System.out.println("Points 2 and 3 are equal is: " + point3.equals(point2));

        //7.1+ readme
        //7.2+ in branch birdspackage rookery is in the same package as birds
        //7.3+
        System.out.println("7.3");
        try {
            System.out.println(myPow(args));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }


        //8.1+
        System.out.println("8.1");
        Employee employee1, employee2,employee3, employee4;
        employee1 = new Employee(checkInputString("Employee name"));
        employee2 = new Employee(checkInputString("Employee name"));
        employee3 = new Employee(checkInputString("Employee name"));
        employee4 = new Employee(checkInputString("Employee name"));
        Department itdepartment = new Department(checkInputString("Department name"));
        Department hrdepartment = new Department(checkInputString("Department name"));
        itdepartment.addEmployee(employee1);
        itdepartment.addEmployee(employee2);
        itdepartment.addEmployee(employee3);
        hrdepartment.addEmployee(employee4);
        try {
            itdepartment.setHead(employee2);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        for (Employee e : employee1.getColleagues()){
            System.out.println(e.toString());
        }

        try {
            hrdepartment.setHead(employee1);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        hrdepartment.addEmployee(employee2);

        System.out.println(itdepartment);
        System.out.println(hrdepartment);

        hrdepartment.addEmployee(employee1);
        itdepartment.removeEmployee(employee1);
        itdepartment.removeEmployee(employee2);
        hrdepartment.addEmployee(employee1);

        System.out.println(itdepartment);
        System.out.println(hrdepartment);
    }
}
