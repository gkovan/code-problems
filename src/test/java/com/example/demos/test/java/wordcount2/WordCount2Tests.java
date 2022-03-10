package com.example.demos.test.java.wordcount2;

import org.junit.jupiter.api.Test;

import com.example.demos.test.java.wordcount.MostOccurances;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Given a stream of words (assume a String containing words), when processing the stream, get the
 * following info: - Number of words processed - Number of unique words - Number of occurrences of a
 * specific word - Word that occurs the most - Word that occurs the least
 */

public class WordCount2Tests {

    @Test
    public void givenStringOfOneWord_whenInvokingWordCount_thenReturnOne() {
        // given
        String str = "hello";

        // when
        WordCount2 wordCount = new WordCount2();

        // then
        int count = wordCount.count(str);
        assertEquals(1, count);
    }

    @Test
    public void givenStringOfManyWords_whenInvokingWordCount_thenReturnNumberOfWords() {
        // given
        String str = "hello this is a test";

        // when
        WordCount2 wordCount = new WordCount2();

        // then
        int count = wordCount.count(str);
        assertEquals(5, count);
    }

    @Test
    public void givenStringWithZeroWords_whenInvokingWordCount_thenReturnZero() {
        // given
        String str = "";

        // when
        WordCount2 wordCount = new WordCount2();

        // then
        int count = wordCount.count(str);
        assertEquals(0, count);
    }

    @Test
    public void givenNullString_whenInvokingWordCount_thenReturnZero() {
        // given
        String str = null;

        // when
        WordCount2 wordCount = new WordCount2();

        // then
        int count = wordCount.count(str);
        assertEquals(0, count);
    }

    @Test
    public void givenStringOfWords_whenInvokingWordCountAndUniqueWords_thenReturnNumberOfUniqueWords() {
        // given
        String str = "hello world hello world";

        // when
        WordCount2 wordCount = new WordCount2();
        wordCount.count(str);
        int unique = wordCount.unique();

        // then
        assertEquals(2, unique);
    }

    @Test
    public void givenStringOfWords_whenInvokingInstancesOfWord_thenReturnsNumberOfInstances() {
        // given
        String str = "hello world hello world";

        // when
        WordCount2 wordCount = new WordCount2();
        wordCount.count(str);
        int instances = wordCount.instances("hello");

        // then
        assertEquals(2, instances);
    }

    @Test
    public void givenStringOfWords_whenInvokingMostOccurances_thenReturnsTheWordThatAppearsTheMost() {
        // given
        String str = "hello hello hello world hello world";

        // when
        WordCount2 wordCount = new WordCount2();
        wordCount.count(str);
        MostOccurances mo = wordCount.mostOccurances();

        // then
        assertEquals("hello", mo.getWord());
        assertEquals(new Integer(4), mo.getCount());

    }

}
