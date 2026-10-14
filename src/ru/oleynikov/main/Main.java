package ru.oleynikov.main;
import ru.oleynikov.birds.*;
import ru.oleynikov.employeedepartment.Department;
import ru.oleynikov.employeedepartment.Employee;
import ru.oleynikov.node.Node;
import ru.oleynikov.points.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //1.2+
        //1.11+
        //2.4+
        /*
        Node binarynode = new Node();
        binarynode.addValue(3);
        binarynode.addValue(5);
        binarynode.addValue(4);
        binarynode.addValue(7);
        binarynode.addValue(1);
        binarynode.addValue(2);
        System.out.println(binarynode.toString());
        System.out.println(binarynode.checkValue(5));
        binarynode.deleteValue(5);
        binarynode.deleteValue(8);
        binarynode.deleteValue(5);
        System.out.println(binarynode.toString());
        System.out.println(binarynode.checkValue(5));
        */
        //3.5+
        /*
        Dot3 test = new Dot3(2., 3.5, -1.4);
        System.out.println(test.toString());
        */
        //4.3+
        /*
        Rookery rookery = new Rookery();
        rookery.add(new Sparrow());
        rookery.add(new Cuckoo());
        rookery.add(new Sparrow());
        rookery.add(new Parrot("Chaka Chaka"));
        rookery.add(new Cuckoo());
        rookery.add(new Parrot("BOOM!!!"));
        rookery.add(new Cuckoo());
        rookery.add(new Sparrow());
        rookery.add(new Sparrow());
        //5.2+
        rookery.callBirds();
        */

        //6.2+

        //7.1+
        //7.2+
        //7.3+
        /*
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = IntParser.checkInputInt(sc, "x");
        y = IntParser.checkInputInt(sc, "y");
        System.out.println(Math.pow(x, y));
        */
        //8.1
        Employee employee1, employee2,employee3, employee4;
        employee1 = new Employee("Петров");
        employee2 = new Employee("Козлов");
        employee3 = new Employee("Сидоров");
        employee4 = new Employee("Иванов");
        Department itdepartment = new Department("IT");
        Department hrdepartment = new Department("HR");
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
    }
}
