package com.ldd.design_patterns.CreationalDesignPattern.BuilderDesignPattern;

import lombok.Data;

@Data
public class User {

    // required + optional fields
    private final String name;
    private final int age;
    private final String email;
    private final String phone;
    private final String address;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    // Static Builder class
    public static class Builder {

        private String name;
        private int age;
        private String email;
        private String phone;
        private String address;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}