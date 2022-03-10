/**
 * 
 */
package com.example.demos.test.java.wordcount;

import java.util.HashMap;
import java.util.Scanner;

public class WordCount {

    public HashMap<String, Integer> count(String str) {
        Scanner scan = new Scanner(str);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        while (scan.hasNext()) {
            String word = scan.next();
            Integer intCount = hm.get(word);
            if (intCount == null) {
                hm.put(word, new Integer(1));
            }
            else {
                intCount++;
                hm.put(word, intCount);
            }
        }

        return hm;

    }

}
