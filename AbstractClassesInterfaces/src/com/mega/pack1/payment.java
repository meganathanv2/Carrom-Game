package com.mega.pack1;

public interface payment{
    void pay();
    //static method as not inherited
    static  public void test1(){
        System.out.println("Interface was call");
    }
}
