/**
 * 
 */
package com.example.demos.test.java.romannumerals;

import java.util.HashMap;
import java.util.Map;

/**
 * @author gkovan@us.ibm.com
 *
 */
public class RomanNumeralCalc {

    Map<String, Integer> romanNumeralToBase10Map = new HashMap<String, Integer>();

    public RomanNumeralCalc() {
        romanNumeralToBase10Map.put("I", 1);
        romanNumeralToBase10Map.put("V", 5);
        romanNumeralToBase10Map.put("X", 10);
        romanNumeralToBase10Map.put("L", 50);
        romanNumeralToBase10Map.put("C", 100);
        romanNumeralToBase10Map.put("D", 500);
        romanNumeralToBase10Map.put("M", 1000);
    }

    /**
     * @param romanNumeral
     * @return
     */
    public int rnToBase10(String romanNumeral) {

        int sum = 0;

        int prevIndex = 0;
        int prevNumber = 0;
        for (int i = 0; i < romanNumeral.length(); i++) {
            String str = romanNumeral.substring(prevIndex, i + 1);
            int currNumber = romanNumeralToBase10Map.get(str);

            if (currNumber == prevNumber)
                sum = sum + currNumber;
            else if (prevNumber < currNumber)
                sum = (sum - prevNumber) + (currNumber - prevNumber);
            else
                sum = sum + currNumber;

            prevIndex++;
            prevNumber = romanNumeralToBase10Map.get(str);
        }
        return sum;
    }

    /**
     * @param romNum1
     * @param romNum2
     * @return
     */
    public int add(String romNum1, String romNum2) {
        return rnToBase10(romNum1) + rnToBase10(romNum2);
    }
}
