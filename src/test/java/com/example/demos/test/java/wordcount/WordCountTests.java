package com.example.demos.test.java.wordcount;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WordCountTests {

    @Test
    public void givenAStringOfWords_whenCountingWords_thenReturnAHashMapNotNull() {
        // given
        String str = "This is a string of words that that contains many words";

        // when
        WordCount wordCount = new WordCount();
        HashMap<String, Integer> hm = wordCount.count(str);

        // then
        assertNotNull(hm);
    }

    @Test
    public void givenAStringOfWords_whenCountingWords_thenReturnAHashMapThatContainsThatWithCountOfTwo() {
        // given
        String str = "This is a string of words that that contains many words";

        // when
        WordCount wordCount = new WordCount();
        HashMap<String, Integer> hm = wordCount.count(str);

        // then
        assertEquals(hm.get("that"), new Integer(2));

    }

}
