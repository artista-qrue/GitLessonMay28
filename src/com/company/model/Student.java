package com.company.model;

public class Student {
    private String name;
    private String surname;
    private String address;

    private int age;

    private String secondryName;

    public Student() {
    }

    public Student(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(final String address) {
        this.address = address;
    }

    public String getSecondryName() {
        return secondryName;
    }

    public void setSecondryName(final String secondryName) {
        this.secondryName = secondryName;
    }
}
