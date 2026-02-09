package com.mega.service;

public class Calculator<T extends Number> {

    public double square(T num) {
        return num.doubleValue() * num.doubleValue();
    }
}
