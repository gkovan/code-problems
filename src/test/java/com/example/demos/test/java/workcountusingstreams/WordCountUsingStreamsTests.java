/**
 * 
 */
package com.example.demos.test.java.workcountusingstreams;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Given a stream of words (assume a String containing words), when processing the stream, get the
 * following info: - Number of words processed - Number of unique words - Number of occurrences of a
 * specific word - Word that occurs the most - Word that occurs the least
 */

public class WordCountUsingStreamsTests {

    @Test
    public void testNumberOfWordsProcessed() {
        // given
        String str = "hello gerry";

        // when
        WordCountUsingStreams wordCount = new WordCountUsingStreams(str);
        int numOfWordsProcessed = wordCount.getNumberOfWordsProcessed();
        // then
        int expected = 2;
        assertEquals(expected, numOfWordsProcessed);
    }

    @Test
    public void testNumberOfWordsProcessedNullString() {
        // given
        String str = null;

        // when
        WordCountUsingStreams wordCount = new WordCountUsingStreams(str);
        int numOfWordsProcessed = wordCount.getNumberOfWordsProcessed();
        // then
        int expected = 0;
        assertEquals(expected, numOfWordsProcessed);
    }

    @Test
    public void testNumberOfWordsProcessedEmptyString() {
        // given
        String str = "";

        // when
        WordCountUsingStreams wordCount = new WordCountUsingStreams(str);
        int numOfWordsProcessed = wordCount.getNumberOfWordsProcessed();
        // then
        int expected = 0;
        assertEquals(expected, numOfWordsProcessed);
    }

    @Test
    public void testNumberOfUniqueWordsNoDups() {
        // given
        String str = "hello gerry";

        // when
        WordCountUsingStreams wordCount = new WordCountUsingStreams(str);
        int numOfUniqueWords = wordCount.getNumOfUniqueWords();

        // then
        int expected = 2;
        assertEquals(expected, numOfUniqueWords);
    }

    @Test
    public void testNumberOfUniqueWordsWithDups() {
        // given
        String str = "hello hello gerry gerry kovan";

        // when
        WordCountUsingStreams wordCount = new WordCountUsingStreams(str);
        int numOfUniqueWords = wordCount.getNumOfUniqueWords();

        // then
        int expected = 3;
        assertEquals(expected, numOfUniqueWords);
    }

    @Test
    public void testNumberOfOccurancesOfAWord() {
        // given
        String str = "hello hello";

        // when
        WordCountUsingStreams wordCount = new WordCountUsingStreams(str);
        int numOfOccurancesOfWord = wordCount.getNumOfOccurances("hello");

        // then
        int expected = 2;
        assertEquals(expected, numOfOccurancesOfWord);
    }

}
