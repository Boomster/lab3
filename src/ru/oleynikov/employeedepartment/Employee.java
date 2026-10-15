package ru.oleynikov.employeedepartment;

import java.util.List;

public class Employee {
    private String name;
    private Department department;

    public Employee(String name){
        this.name = name;
    }

    public void nullDepartment(){
        Department olddepartment = this.department;
        if (olddepartment != null){
            if(olddepartment.getHead() != this){
                this.department = null;
                if (olddepartment.isEmployee(this)) olddepartment.removeEmployee(this);
            } else {
                System.out.println("Cannot remove head of department.");
            }
        } else {
            System.out.println("Employee wasn't a part of any department to begin with.");
        }
    }

    public void setDepartment(Department department) {
        if(department == null){
            this.nullDepartment();
        }else if (this.department == null) {
            this.department = department;
            if(!this.department.isEmployee(this)){
                this.department.addEmployee(this);
            }
        } else {
            System.out.println("Employee is already working at " + this.department.getName() + " department.");
        }
    }

    public Department getDepartment() {
        return department;
    }

    public List<Employee> getColleagues(){
        return this.department.getEmployees();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder emplyeeinfo = new StringBuilder();
        if(this == this.department.getHead()){
            emplyeeinfo.append(this.name).append(" начальник отдела ").append(this.department.getName()).append("\n");
        } else {
            emplyeeinfo.append(this.name).append(" работает в отделе ").append(this.department.getName()).append(", начальник которого ").append(this.department.getHead().getName()).append("\n");
        }
        return emplyeeinfo.toString();
    }
}
