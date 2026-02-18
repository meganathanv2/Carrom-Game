package com.mega.day12.Reflection;

@MyClassInfo(author = "Mega", version = 4)
class Student2 {

    String author;
    int version;
}

public class ClassLevelAnnatation {

    public static void main(String[] args) {
        
        Class<Student2> obj = Student2.class;
        if (obj.isAnnotationPresent(MyClassInfo.class)) {
            MyClassInfo info = obj.getAnnotation(MyClassInfo.class);

            System.out.println("Author:" + info.author());
            System.out.println("Version:" + info.version());

        }
    }
}
