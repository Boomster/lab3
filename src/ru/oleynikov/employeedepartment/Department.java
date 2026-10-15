package ru.oleynikov.employeedepartment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Department {
    private String name;
    private Employee head;
    private List<Employee> employees;

    public Department(String name){
        this.name = name;
        this.employees = new ArrayList<>();
    }

    protected String getName() {
        return name;
    }

    public void setHead(Employee head) throws RuntimeException {
        if (head.getDepartment() == this) {
            this.head = head;
        } else throw new RuntimeException("The employee doesn't work at this department.");
    }

    protected Employee getHead() {
        return head;
    }

    public void addEmployee(Employee employee){
        if (employee.getDepartment() == null) {
            employees.add(employee);
            employee.setDepartment(this);
        } else {
            System.out.println("The employee is already working at " + employee.getDepartment().getName() + " department.");
        }
    }

    public void removeEmployee(Employee employee){
        if(this.head == employee){
            System.out.println("Cannot remove head of department.");
        } else {
            this.employees.remove(employee);
            employee.setDepartment(null);
        }
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(this.employees);
    }

    @Override
    public String toString(){
        StringBuilder departmentfull = new StringBuilder();
        departmentfull.append("Отдел: ").append(this.name).append("\n");
        departmentfull.append("Сотрудники:\n");
        for(Employee e : this.employees){
            departmentfull.append(e.getName()).append("\n");
        }
        if (this.head != null) {
            departmentfull.append("Руководитель: ").append(this.head.getName()).append("\n");
        }
        return departmentfull.toString();
    }
}

