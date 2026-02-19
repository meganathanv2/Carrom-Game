package com.mega.day12.Reflection;

public class EmployeeClass {

    private String name;
    private int age;
    private int id;
    private String city;
   


    public void setName(String name){
        this.name=name;

    }

    public void setAge(int age){
        this.age=age;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setCity(String city){
        this.city=city;
    }
   
    
    

    public void displayEmployee() {
        System.out.println(name + " " + id + " " + age + " " + city);
    }
}
