/**
 * 
 */
package com.example.demos.test.java.workcountusingstreams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author gkovan@us.ibm.com
 *
 */
public class WordCountUsingStreams {

    private List<String> wordList = new ArrayList<String>();
    private Map<String, Integer> wordMap = new HashMap<String, Integer>();

    /**
     * @param str
     */
    public WordCountUsingStreams(String str) {
        // TODO Auto-generated constructor stub

        if (str == null) {
            return;
        }

        StringTokenizer st = new StringTokenizer(str);
        while (st.hasMoreTokens()) {
            wordList.add(st.nextToken());
        }
        wordList.stream().forEach(
                word -> wordMap.put(word, wordMap.get(word) == null ? 1 : wordMap.get(word) + 1));

    }

    /**
     * @return
     */
    public int getNumberOfWordsProcessed() {
        // TODO Auto-generated method stub
        return wordList.size();
    }

    /**
     * @return
     */
    public int getNumOfUniqueWords() {
        // TODO Auto-generated method stub
        // return wordMap.size();
        return wordMap.size();
    }

    /**
     * @param string
     * @return
     */
    public int getNumOfOccurances(String word) {
        // TODO Auto-generated method stub
        return wordMap.get(word);
    }

}
