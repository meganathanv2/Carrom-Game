package com.mega.day12.Reflection;

public class StudentClass {

    @CopiedField(newValue = "Vijay")
    private String name;

    private int age;
    private int id;
    

    @CopiedField(newValue = "Chennai")
    private String city;

   

    public StudentClass(String name, int id, int age, String city) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.city = city;
       
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayStudent() {
        System.out.println(name + " " + id + " " + age + " " + city);
    }
}
