package com.mega.day12;

public class ImmutableMainClass {

    public static void main(String[] args) {
        ImmutableClass coinobj = new ImmutableClass(1, "red", 5);
        System.out.print(coinobj.getPoints());
    }

}
