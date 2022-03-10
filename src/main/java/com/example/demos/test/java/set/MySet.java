/**
 * 
 */
package com.example.demos.test.java.set;

import java.util.Arrays;

/**
 * @author gkovan@us.ibm.com
 *
 */
public class MySet {

    private int setArray[] = new int[1000];
    private int size = 0;
    private final int FILLER_VALUE = 999;

    public MySet() {
        Arrays.fill(setArray, FILLER_VALUE);
    }

    public int size() {
        return size;
    }

    public boolean contains(int value) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (setArray[i] == value) {
                result = true;
                break;
            }
        }

        return result;
    }

    public boolean add(int value) {
        if (contains(value) == true) {
            return false;
        }

        setArray[size] = value;
        size++;
        return true;
    }

    // returns true if the value was removed
    public boolean remove(int value) {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if (setArray[i] == value) {
                setArray[i] = FILLER_VALUE;
                size--;
                result = true;
            }
        }
        return result;
    }

}
