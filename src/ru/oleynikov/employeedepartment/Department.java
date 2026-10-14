package ru.oleynikov.employeedepartment;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private Employee head;
    private List<Employee> employees;

    private boolean isEmployee(Employee employee){
        return employees.contains(employee);
    }

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
        }
    }

    protected List<Employee> getEmployees() {
        return employees;
    }

    @Override
    public String toString(){
        StringBuilder departmentfull = new StringBuilder();
        departmentfull.append("Отдел: ").append(this.name).append("\n");
        departmentfull.append("Сотрудники:\n");
        for(Employee e : this.employees){
            departmentfull.append(e.getName()).append("\n");
        }
        departmentfull.append("Руководитель: ").append(this.head.getName()).append("\n");
        return departmentfull.toString();
    }
}

