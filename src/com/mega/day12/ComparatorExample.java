package com.mega.day12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return age + "-" + name;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {
        Comparator<Student> comp = (s1, s2)-> {
                if (s1.age > s2.age) {
                    return 1;
                } else if (s1.age < s2.age) {
                    return -1;
                } else {
                    return 0;
                }

            };
       
        List<Student> st = new ArrayList<>();
        st.add(new Student(12, "Mega"));
        st.add(new Student(45, "vijay"));
        st.add(new Student(28, "hari"));
        st.add(new Student(63, "navin"));

        Collections.sort(st, comp);
        for (Student s : st) {
            System.out.println(s);
        }
    }
}
