package com.ldd.design_patterns.BuilderDesignPattern;

public class BuilderClient {

    public static void main(String[] args) {

        User user = new User.Builder()
                .name("Shilpa")
                .age(32)
                .email("shilpa@test.com")
                .phone("9999999999")
                .address("Delhi")
                .build();

        System.out.println("User Details:");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone: " + user.getPhone());
        System.out.println("Address: " + user.getAddress());
    }
}