package com.example.demos.test.java.gkwordcount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
 * Create a word count feature that has the following capabilities - Number of words processed -
 * Number of unique words - Number of occurances of a specific word - Word that occurs the most -
 * Word that occurs the least
 */

public class GKWordCountTests {

    @Test
    public void givenAStringOFWords_whenCounting_thenReturnWordThatOccursMostOften() {
        // given
        String words = "The word hello hello hello appears most most often";

        // when
        GKWordCount wordCount = new GKWordCount();
        wordCount.count(words);

        // then
        String mostOccurancesWord = wordCount.getMostOccurances();
        assertEquals("hello", mostOccurancesWord);
    }

    @Test
    public void givenAStringOfWords_whenCounting_thenReturnNumberOfWordsProcessed() {
        // given
        String words = "This sentenence has 5 words";

        // when
        GKWordCount wordCount = new GKWordCount();
        int wordsProcessed = wordCount.count(words);

        // then
        assertEquals(wordsProcessed, 5);
    }

    @Test
    public void givenAStringOfWords_whenCounting_thenReturnNumberOfUniqueWords() {
        // given
        String words = "hello hello hello hello hello world";

        // when
        GKWordCount wordCount2 = new GKWordCount();
        wordCount2.count(words);
        int uniqueWords = wordCount2.uniqueWords();
        System.out.println(uniqueWords);

        // then
        assertEquals(uniqueWords, 2);
    }

    @Test
    public void givenAStringOfWords_whenCounting_thenReturnNumberOfOccurancesOfASpecificWord() {
        // given
        String words = "hello hello hello world";

        // when
        GKWordCount wordCount2 = new GKWordCount();
        wordCount2.count(words);

        // then
        int numberOfOccurances = wordCount2.occurances("hello");
        assertEquals(3, numberOfOccurances);
    }

    @Test
    public void testGK() {
        assertEquals(1, 1);
    }

}
