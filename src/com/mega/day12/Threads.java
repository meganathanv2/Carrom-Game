package com.mega.day12;
//if i put this extends we cannat do the multiple inheritence
class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {

            try {
                Thread.sleep(2000);
                System.out.println("Child thread : " + i);
            } catch (Exception e) {
            }
        }
    }
}

class SecondThread extends Thread {

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Second Thread");
        }
    }
}

public class Threads {

    public static void main(String[] args) {
        Runnable t = new MyRunnable();
        SecondThread r = new SecondThread();
        Thread v=new Thread(t);

        v.start();
        r.start();
        v.setName("FirstThread");
        System.out.println(v.getName());
        if (r.isAlive()) {
            System.out.println("secondThread is Alive");
        }
        try {
            r.join();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if (r.isAlive()) {
            System.out.println("secondThread is Alive");
        }

        System.out.println("Program finished");
    }
}
