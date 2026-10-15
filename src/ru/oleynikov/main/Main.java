package ru.oleynikov.main;
import ru.oleynikov.birds.*;
import ru.oleynikov.employeedepartment.*;
import ru.oleynikov.points.*;

import static ru.oleynikov.main.TaskParser.*;

public class Main {
    public static void main(String[] args){
        //1.11
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
        employee1.setDepartment(null);
        hrdepartment.addEmployee(employee1);

        System.out.println(itdepartment);
        System.out.println(hrdepartment);
    }
}
