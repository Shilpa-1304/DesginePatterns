package com.ldd.design_patterns.CreationalDesignPattern.PrototypePattern;

public class Employee implements Prototype{

    private int id;
    private String designation;
    private String department;

    public Employee(int id,String dept,String designation){
        this.id=id;
        this.designation=designation;
        this.department=dept;
    }
    public void setId(int id){
        this.id=id;
    }
    @Override
    public Employee clone() {
        return new Employee(this.id,this.department,this.designation);
    }
    @Override
    public String toString(){
        return "ID: "+this.id+" @ Designation: "+this.designation +" from department "+ this.department;
    }
}
