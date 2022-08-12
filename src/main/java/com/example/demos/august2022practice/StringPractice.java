package com.example.demos.august2022practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringPractice {

    public static void main(String args[]) {
        System.out.println("String practice");

        String str = "Hello hello HeLLo my mY MY name NAME is Is IS gerry GERRY GeRrY";

        String strArray[] = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(strArray[i]);
        }

        //////////////

        System.out.println("Convert string Array to string List");
        List<String> strList = Arrays.asList(strArray);
        strList.forEach(s -> System.out.println(s));
        
        //////////////

        System.out.println("map and collect to make strings in list all lower case");

        List<String> lowerCaseStrList = strList.stream().map(x -> x.toLowerCase()).collect(Collectors.toList());

        lowerCaseStrList.forEach(s -> System.out.println(s));

        /////////////

        System.out.println("map to lowercase then filter and collect strings that match `gerry`");
        List<String> gerryString = strList.stream().map(s-> s.toLowerCase()).filter(s -> s.equals("gerry")).collect(Collectors.toList());
        gerryString.forEach(s -> System.out.println(s));

        Map<String,Integer> wordCount = new HashMap<>();
        strList.stream().map(s -> s.toLowerCase()).forEach(s -> {
            if (wordCount.get(s) == null) {
                wordCount.put(s,1);
            } else {
                wordCount.put(s, wordCount.get(s) + 1);
            }
        });

        wordCount.forEach( (word, count)-> {
            System.out.println("Word: " + word + "   " + "Count: " + count);
        });
    }

}
