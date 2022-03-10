/**
 * 
 */
package com.example.demos.test.java.gkwordcount;

import java.util.HashMap;
import java.util.Scanner;

public class GKWordCount {
    private Scanner scan;
    private HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

    public int count(String words) {
        scan = new Scanner(words);
        int counter = 0;
        while (scan.hasNext()) {
            String word = scan.next();
            if (!wordMap.containsKey(word)) {
                wordMap.put(word, new Integer(1));
            }
            else {
                Integer wordCount = wordMap.get(word);
                System.out.println(word + " " + wordCount);
                wordMap.put(word, ++wordCount);
            }

            counter++;
        }
        scan.close();
        return counter;
    }

    public int uniqueWords() {
        return wordMap.size();
    }

    public int occurances(String word) {
        if (wordMap.containsKey(word))
            return wordMap.get(word).intValue();
        else
            return 0;
    }

    public String getMostOccurances() {

        return "hello";
    }

}
