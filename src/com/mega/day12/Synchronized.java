package com.mega.day12;

class Example{
    //synchronized is created a one lock if one thread is execute the method fully completed the current thread then moving to the next thread
     synchronized void increment(int n){
        for(int i=n;i<=n+5;i++){
   System.out.println(i);
   try {
       Thread.sleep(2000);
   } catch (Exception e) {
   }
        }
    }
}
public class Synchronized {
    public static void main(String[] args) {
        Example e=new Example();

        Thread t1=new Thread(()->{
            e.increment(5);
        });
         Thread t2=new Thread(()->{
            e.increment(15);
        });
        t1.start();
        t2.start();
    }
}
