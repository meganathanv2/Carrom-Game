package com.mega.day12;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalType {

    public static Optional<String> findPlayer(boolean available){
        if(available){
            return Optional.of("Mega");
        }
        else{
            return Optional.empty();
        }
    }
    public static void main(String[] args) {
        Optional<String> player1=findPlayer(true);
        System.out.println(player1.orElse("No player"));

        Optional<String> player2=findPlayer(false);
        System.out.println(player2.orElse("No player"));

        List<String> li=Arrays.asList("Mega","vijay","leo");
        Optional<String> res=li.stream().filter(n->n.startsWith("M")).findFirst();
         res.ifPresent(System.out::println);
 

    }
}
