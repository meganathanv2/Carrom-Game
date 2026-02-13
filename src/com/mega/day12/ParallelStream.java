package com.mega.day12;

import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> li=List.of(1,2,3,4,5,6,7);
        li.parallelStream().forEach((n)->{
            System.out.println(Thread.currentThread().getName()+" "+n);
        });
    }
}
