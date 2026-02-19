package com.mega.day12.Reflection;

import java.lang.reflect.*;

public class ObjectConverter {

    public static void copyObject(Object source, Object target) throws Exception {

        Field[] fields = source.getClass().getDeclaredFields();

        for (Field f : fields) {

            String fieldName = f.getName();
            String getterName = "get" + capitalize(fieldName);
            String setterName = "set" + capitalize(fieldName);

            Object value = null;
            try {
                Method getterMethod = source.getClass().getMethod(getterName);
                value = getterMethod.invoke(source);
            } catch (NoSuchMethodException e) {
                f.setAccessible(true);
                value = f.get(source);
            }

            try {
                Method setterMethod = target.getClass().getMethod(setterName, f.getType());
                setterMethod.invoke(target, value);
            } catch (NoSuchMethodException ignored) {
            }

            if (f.isAnnotationPresent(CopiedField.class)) {

                CopiedField annotation = f.getAnnotation(CopiedField.class);
                String newVal = annotation.newValue();

                try {
                    Method sourceSetter = source.getClass().getMethod(setterName, f.getType());
                    sourceSetter.invoke(source, newVal);
                } catch (NoSuchMethodException e) {
                    f.setAccessible(true);
                    f.set(source, newVal);
                }
            }
        }
    }

    private static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
