package com.ldd.design_patterns.CreationalDesignPattern.PrototypePattern;

public class PrototypeClient {
    public static void main(String[] args) {
        Employee employeeTemplate=new Employee(100,"IT","Software Engineer");
        Employee e101=employeeTemplate.clone();
        e101.setId(101);
        System.out.println(e101.toString());
    }
}
