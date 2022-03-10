package com.example.demos.test.java.linkedlistset;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyLinkedListSetTests {

    @Test
    public void givenNothing_whenCreatingASet_ThenIsNotNull() {
        // given

        // when
        MyLinkedListSet mySet = new MyLinkedListSet();

        // then
        assertNotNull(mySet);
    }

    @Test
    public void givenANewSet_whenCheckingSize_ThenIsEqaulToZero() {
        // given
        MyLinkedListSet mySet = new MyLinkedListSet();

        // when
        int size = mySet.size();

        // then
        assertEquals(size, 0);

    }

    @Test
    public void givenAnEmptySet_whenCheckingIfContainsAnElement_ThenReturnsFalse() {
        // given
        MyLinkedListSet mySet = new MyLinkedListSet();

        // when
        boolean contains = mySet.contains(5);

        // then
        assertFalse(contains);
    }

    @Test
    public void givenAnEmptySet_whenAddingAnElement_ThenResultIsTrueSizeIsOneAndContainsIsTrue() {
        // given
        MyLinkedListSet mySet = new MyLinkedListSet();

        // when
        boolean added = mySet.add(5);

        // then
        assertTrue(added);
        assertEquals(mySet.size(), 1);
        assertTrue(mySet.contains(5));
    }

    @Test
    public void givenAnEmptySet_whenAddingTwoElements_ThenResultSizeIsTwoAndContainsIsTrue() {
        // given
        MyLinkedListSet mySet = new MyLinkedListSet();

        // when

        mySet.add(5);
        mySet.add(6);

        // then
        assertEquals(mySet.size(), 2);
        assertTrue(mySet.contains(5));
        assertTrue(mySet.contains(6));

    }

    @Test
    public void givenASetWithOneElement_whenDeletingAnElement_ThenResultIsTrueAndSizeIsZero() {
        // given
        MyLinkedListSet mySet = new MyLinkedListSet();
        mySet.add(5);

        // when
        boolean result = mySet.delete(5);

        // then
        assertTrue(result);
        assertEquals(mySet.size(), 0);
    }

    @Test
    public void givenASetWithTwoElements_whenDeletingAnElement_ThenResultSizeIsOne() {
        // given
        MyLinkedListSet mySet = new MyLinkedListSet();
        mySet.add(5);
        mySet.add(6);

        // when
        mySet.delete(5);

        // then
        assertEquals(mySet.size(), 1);
        assertTrue(mySet.contains(6));
    }
}
