package com.mega.day12.Reflection;

import java.lang.reflect.Field;

class Student1 {

    @CopiedField(newValue = "Vijay")
    public String name;
    public int age;
    public int id;

    public  Student1(String name,int id,int age) {
        this.name=name;
        this.id=id;
        this.age=age;

    }

    
}

class Employee {

    public String name;
    public int age;
    public int id;
}

class StudentObjToEmployeeObj {

    public static void main(String[] args) throws Exception {
        Student1 s = new Student1("Mega",1234,21);
        Employee e = new Employee();
        copyObject(s, e);
        System.out.println("Employee object");
        System.out.println(e.name);
        System.out.println(e.id);
        System.out.println(e.age);
        System.out.println("Assin the annotation value");
        System.out.println(s.name);
    }

    public static void copyObject(Object source, Object target) throws Exception {

        Field[] fields = source.getClass().getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            Field targetField = target.getClass().getDeclaredField(f.getName());
            targetField.setAccessible(true);
            targetField.set(target, f.get(source));

            if (f.isAnnotationPresent(CopiedField.class)) {
                CopiedField ano = f.getAnnotation(CopiedField.class);
                String newVal = ano.newValue();
                f.set(source, newVal);
            }

        }
    }

}
