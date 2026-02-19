package com.mega.day12.Reflection;

import java.lang.reflect.Field;

public class StudentObjToEmployeeObj {

    public static void main(String[] args) throws Exception {

        StudentClass s = new StudentClass("Mega", 101, 21, "Salem");
        EmployeeClass e = new EmployeeClass();

        ObjectConverter.copyObject(s, e);
        System.out.println("-- Employee Object");
        printObject(e);
        System.out.println("-- Student Object");
        printObject(s);
        e.displayEmployee();
    }

    private static void printObject(Object obj) throws Exception {

        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field f : fields) {
            f.setAccessible(true);
            System.out.println(f.getName() + ": " + f.get(obj));
        }

    }
}
