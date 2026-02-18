package com.mega.day12.Reflection;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface CopiedField {
    String newValue() default "";
}
