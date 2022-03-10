package com.example.demos.test.java.set;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MySetTests {

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    public static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void givenNothing_whenCreatingASet_ThenIsNotNull() {
        // given

        // when
        MySet mySet = new MySet();

        //
        assertNotNull(mySet);
    }

    @Test
    public void givenANewSet_whenCheckingSize_ThenIsEqaulToZero() {
        // given
        MySet mySet = new MySet();

        // when
        int size = mySet.size();

        // then
        assertEquals(size, 0);
    }

    @Test
    public void givenAnEmptySet_whenCheckingIfContainsAnElement_ThenReturnsFalse() {
        // given
        MySet mySet = new MySet();

        // when
        boolean contains = mySet.contains(5);

        // then
        assertFalse(contains);
    }

    @Test
    public void givenAnEmptySet_whenAddingAnElement_ThenResultIsTrueSizeIsOneAndContainsIsTrue() {
        // given
        MySet mySet = new MySet();

        // when
        boolean added = mySet.add(5);

        // then
        assertTrue(added);
        assertEquals(mySet.size(), 1);
        assertTrue(mySet.contains(5));

    }

    @Test
    public void givenASetWithAnElementInIt_wheRemovingTheElement_ThenResultIsTrueContainsIsFalseAndSizeIsDecremeted() {
        // given
        MySet mySet = new MySet();
        mySet.add(5);
        int initialSize = mySet.size();

        // when
        boolean removed = mySet.remove(5);
        int afterSize = mySet.size();

        // then
        assertTrue(removed);
        assertFalse(mySet.contains(5));
        assertEquals(initialSize, afterSize + 1);
    }

}
