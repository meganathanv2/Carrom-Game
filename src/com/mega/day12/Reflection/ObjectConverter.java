package com.mega.day12.Reflection;

import java.lang.reflect.Field;

public class ObjectConverter {

    public static void copyObject(Object source, Object target) throws Exception {

        Field[] fields = source.getClass().getDeclaredFields();

        for (Field f : fields) {

            f.setAccessible(true);
            Field targetField = target.getClass().getDeclaredField(f.getName());
            targetField.setAccessible(true);

            targetField.set(target, f.get(source));

            if (f.isAnnotationPresent(CopiedField.class)) {

                CopiedField annotation = f.getAnnotation(CopiedField.class);
                String newVal = annotation.newValue();
               
                    f.set(source, newVal);
            }
        }
    }
}
