package com.mega.day12;

import java.util.Arrays;
import java.util.List;

public class Stream {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("adam", "Eva", "romeo");
        List<String> fliterName =names.stream().filter((name)->name.startsWith("E")).toList();
        System.out.println(fliterName);

         List<String> names2 = Arrays.asList("adam", "Eva", "romeo");
         List<String> map=names2.stream().map(String :: toUpperCase).toList();
         System.out.println(map);
    }
}
