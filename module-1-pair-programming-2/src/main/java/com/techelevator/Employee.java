package com.techelevator;

public class Employee {
    private final double FINAL_SALARY = 60000;
    private long employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private double salary = FINAL_SALARY;
    private Department department;
    private String hireDate;

    // first constructor doesn't have salary
    public Employee(long employeeId, String firstName, String lastName, String email,
                    Department department, String hireDate) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.department = department;
        this.hireDate = hireDate;
    }

    // second constructor
    public Employee() {
        this.salary = FINAL_SALARY;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }

    // putting something here for now
    // if this is wrong, we'll come back to it
    public double raiseSalary(double percent) {
        return salary += (salary * percent/100);
    }
}
