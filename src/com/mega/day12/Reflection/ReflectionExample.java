package com.mega.day12.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {

    public static void main(String[] args) {
        try {
            Class<?> cls = Class.forName("com.mega.day12.Reflection.Student");
            System.out.println(cls.getSimpleName());

            Object obj = cls.getDeclaredConstructor().newInstance();
           Method[] m= cls.getDeclaredMethods();
          for(Method a:m){
            if(a.isAnnotationPresent(Important.class)){
                System.out.print("Important annotation is there");
            }
            System.out.println(a.getName());
          }
          Field f1=cls.getDeclaredField("name");
          f1.setAccessible(true);
          System.out.println(f1.get(obj));
          f1.set(obj, "Meganathan");
          System.out.println(f1.get(obj));

          m[0].setAccessible(true);
          m[0].invoke(obj);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
