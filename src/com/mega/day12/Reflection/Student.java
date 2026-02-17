package com.mega.day12.Reflection;

 public class Student {
private String name="Mega";
private int age=21;

    public Student() {
    }
    @Important
 public void display(){
     System.out.println("Displaying the student class method");
 }
 private void privateMethod(){
    System.out.println("Private method is called");
 }
}
