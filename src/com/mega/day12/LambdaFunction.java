package com.mega.day12;

interface Lambda{
  public void show();
}

public class LambdaFunction {
    public static void main(String[] args) {
        int i=8;
        Lambda l=()->{
            System.out.println("Hii"+i);
        };
        l.show();
        i++;
    }
}
