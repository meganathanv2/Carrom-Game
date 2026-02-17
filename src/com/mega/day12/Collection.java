package com.mega.day12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Collection {

    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 1; i < 4; i++) {
            li.add(i);
        }
        li.add(1, 101);
        li.addAll(li);
        li.remove(2);
        System.out.println(li.toString());

        HashSet<String> set = new HashSet<>();
        set.add("Mega");
        set.add("Karthi");
        set.add("Mega");
  
        System.out.println(set.getClass());
        System.out.println(set.toString());
        

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Orange");
        map.put(3, "pinapile");
        map.put(1, "orange");
        map.replace(2, "banana");
        System.out.println(map.toString());
        System.out.println(map.keySet());
        System.out.println();

    }
}
