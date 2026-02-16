package com.mega.day12;
//comparable is used for compara itselt of the class instance object or variable

import java.util.*;

class Student implements Comparable<Student>{
   int age;
   String name;

    public Student(int age,String name) {
        this.age=age;
        this.name=name;
    }

    public int compareTo(Student val){
        return this.age >val.age ?1:-1;
    }
    public String toString(){
        return age+"-"+name;
    }

   
}
public class ComparableExample {
    public static void main(String[] args) {
        List<Student> st=new ArrayList<>();
        st.add(new Student(12,"Mega"));
        st.add(new Student(45,"vijay"));
        st.add(new Student(28,"hari"));
        st.add(new Student(63,"navin"));

        Collections.sort(st);
        for(Student val:st){
            System.out.println(val);
        }

    }
}
