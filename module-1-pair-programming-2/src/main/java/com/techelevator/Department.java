package com.techelevator;

public class Department {
    private int departmentId;
    private String name;

    public Department(String name, int departmentId) {
        this.departmentId = departmentId; this.name = name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public String toString(){
        return this.name;
    }
}
