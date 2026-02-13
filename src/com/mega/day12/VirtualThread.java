package com.mega.day12;

public class VirtualThread {
    public static void main(String[] args) throws InterruptedException{
        Thread platformThread=new Thread(new Runnable() {
           public void run(){
            System.out.println("Platform thread "+Thread.currentThread());
           }
        });

        platformThread.start();
        Thread virtualThread = Thread.startVirtualThread(()->{
             System.out.println("VirtualThread is executed"+Thread.currentThread());
        });
        virtualThread.join();
        

    }
}
