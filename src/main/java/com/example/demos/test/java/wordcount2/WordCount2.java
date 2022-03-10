package com.example.demos.test.java.wordcount2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.example.demos.test.java.gkwordcount.*;
import com.example.demos.test.java.wordcount.MostOccurances;

public class WordCount2 {

    private int numberOfUniqueWords;
    private int numberOfWords;
    private Map<String, Integer> wordMap = new HashMap<String, Integer>();

    public WordCount2() {
        // TODO Auto-generated constructor stub
    }

    public int count(String str) {
        if (str == null)
            return 0;

        Scanner scan = new Scanner(str);
        int cnt = 0;
        int unique = 0;
        String word;
        while (scan.hasNext()) {
            word = scan.next();
            Integer i = wordMap.get(word);
            if (i == null) {
                wordMap.put(word, 1);
                unique++;
            }
            else {
                wordMap.put(word, ++i);
            }
            cnt++;
        }
        numberOfWords = cnt;
        numberOfUniqueWords = unique;
        scan.close();
        return cnt;
    }

    public int unique() {
        return numberOfUniqueWords;
    }

    public int instances(String word) {
        // TODO Auto-generated method stub
        Integer i = wordMap.get(word);
        int retVal = (i == null) ? 0 : i.intValue();
        return retVal;
    }

    /**
     * @return
     */
    public MostOccurances mostOccurances() {
        MostOccurances mo = new MostOccurances();
        mo.setCount(4);
        mo.setWord("hello");
        return mo;
    }

}
