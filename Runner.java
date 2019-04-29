package edu.dmacc.codedsm.hw20;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {

        List<String> animal = Arrays.asList("Dog", "Cat", "Bird", "Monkey", "Donkey");
        List<Integer> nameLength = animal.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(nameLength);
        
        for (String s:animal){

            System.out.print(s.chars().mapToObj(x -> String.valueOf((char) x)).collect(Collectors.toList()));

        }



        System.out.println();


        List<String> animalWithd = animal.stream().filter(s->s.startsWith("D")).collect(Collectors.toList());
        System.out.println(animalWithd);

        Integer sum = animal.stream().map(s -> s.length()).reduce(0, (a, b) -> a + b);
        System.out.println(sum);


    }
}
