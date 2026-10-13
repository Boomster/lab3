public class Employee {
    private String name;
    private Department department;

    public Employee(String name, Department department){
        this.name = name;
        department.addEmployee(this);
    }

    public Employee(String name){
        this.name = name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public String getColleagues(){
        return this.department.toString();
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
