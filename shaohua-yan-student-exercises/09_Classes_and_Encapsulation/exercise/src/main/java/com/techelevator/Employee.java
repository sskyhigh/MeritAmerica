package com.techelevator;

public class Employee {
    private final int employeeId;
    private final String firstName;
    private double annualSalary;
    private String lastName;
    private String department;

    public Employee(int employeeID, String firstName, String lastName, double salary) {
        this.employeeId = employeeID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = salary;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void raiseSalary(double percent) {
        double percentageRaised = (100 + percent) / 100;
        annualSalary = annualSalary * percentageRaised;
    }
}
