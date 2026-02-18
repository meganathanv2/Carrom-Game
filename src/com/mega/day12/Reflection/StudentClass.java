package com.mega.day12.Reflection;

public class StudentClass {

    @CopiedField(newValue = "Vijay")
    private String name;

    private int age;
    private int id;

    @CopiedField(newValue = "Chennai")
    private String city;

    private double marks;

    public StudentClass(String name, int id, int age, String city, double marks) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.city = city;
        this.marks = marks;
    }

    private void displayStudent() {
        System.out.println(name + " " + id + " " + age + " " + city + " " + marks);
    }
}
