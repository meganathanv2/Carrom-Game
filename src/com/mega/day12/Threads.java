package com.mega.day12;

class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread : " + i);
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread : " + i);
        }
    }
}
