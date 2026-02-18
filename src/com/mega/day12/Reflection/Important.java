package com.mega.day12.Reflection;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Important {
}
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface CopiedField{
    String newValue() default "";
}

