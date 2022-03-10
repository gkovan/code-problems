/**
 * 
 */
package com.example.demos.test.java.romannumerals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author gkovan@us.ibm.com
 *
 */

// As a Roman Bookkeeper I want to add Roman numbers because doing it manually is too tedious.
// ” Given the Roman numerals, (IVXLCDM which means one, five, ten, fifty, hundred, fivehundred and
// a thousand respectively),
// create two numbers and add them. As we are in Rome there is no such thing as decimals or int, we
// need to do this with the strings.
// An example would be “XIV” + “LX” = “LXXIV”
//
// There are some rules to a Roman number:
//
// Numerals can be concatenated to form a larger numeral (“XX” + “II” = “XXII”)
// If a lesser numeral is put before a bigger it means subtraction of the lesser from the bigger
// (“IV” means four, “CM” means ninehundred)
// If the numeral is I, X or C you can’t have more than three (“II” + “II” = “IV”)
// If the numeral is V, L or D you can’t have more than one (“D” + “D” = “M”)

public class RomanNumeralCalculatorTests {

    @Test
    public void convertBase10ToRomanNumber() {

    }

    @Test
    public void IIplusXVShouldBe15() {
        // given
        String romNum1 = "II";
        String romNum2 = "XV";

        // when
        RomanNumeralCalc rmc = new RomanNumeralCalc();
        int addResult = rmc.add(romNum1, romNum2);

        // then
        int expected = 17;
        assertEquals(expected, addResult);
    }

    @Test
    public void IIshouldBe2() {
        // given "II"
        String romanNumeral = "II";

        // when
        RomanNumeralCalc rmc = new RomanNumeralCalc();
        int base10 = rmc.rnToBase10(romanNumeral);

        // then
        int expected = 2;
        assertEquals(expected, base10);
    }

    @Test
    public void VVVshouldBe15() {
        // given "VVV"
        String romanNumeral = "VVV";

        // when
        RomanNumeralCalc rmc = new RomanNumeralCalc();
        int base10 = rmc.rnToBase10(romanNumeral);

        // then
        int expected = 15;
        assertEquals(expected, base10);
    }

    @Test
    public void IVShouldBe4() {
        // given
        String romanNumeral = "IV";

        // when
        RomanNumeralCalc rmc = new RomanNumeralCalc();
        int base10 = rmc.rnToBase10(romanNumeral);

        // then
        int expected = 4;
        assertEquals(expected, base10);
    }

    @Test
    public void IVVShouldBe9() {
        // given
        String romanNumeral = "IVV";

        // when
        RomanNumeralCalc rmc = new RomanNumeralCalc();
        int base10 = rmc.rnToBase10(romanNumeral);

        // then
        int expected = 9;
        assertEquals(expected, base10);
    }

    @Test
    public void XVShouldBe15() {
        // given
        String romanNumeral = "XV";

        // when
        RomanNumeralCalc rmc = new RomanNumeralCalc();
        int base10 = rmc.rnToBase10(romanNumeral);

        // then
        int expected = 15;
        assertEquals(expected, base10);
    }

    @Test
    public void VIXShouldBe14() {
        // given
        String romanNumeral = "VIX";

        // when
        RomanNumeralCalc rmc = new RomanNumeralCalc();
        int base10 = rmc.rnToBase10(romanNumeral);

        // then
        int expected = 14;
        assertEquals(expected, base10);
    }

    @Test
    public void IXIXIShouldBe19() {
        // given
        String romanNumeral = "IXIXI";

        // when
        RomanNumeralCalc rmc = new RomanNumeralCalc();
        int base10 = rmc.rnToBase10(romanNumeral);

        // then
        int expected = 19;
        assertEquals(expected, base10);
    }

    @Test
    public void convertRomanNumeralToBase10NumberIVXCDMShouldBe1_5_10_100_500_1000() {
        // given Roman Numeral I
        String romanNumeralI = "I";
        String romanNumeralV = "V";
        String romanNumeralX = "X";
        String romanNumeralL = "L";
        String romanNumeralC = "C";
        String romanNumeralD = "D";
        String romanNumeralM = "M";

        // when
        RomanNumeralCalc rmc = new RomanNumeralCalc();
        int base10I = rmc.rnToBase10(romanNumeralI);
        int base10V = rmc.rnToBase10(romanNumeralV);
        int base10X = rmc.rnToBase10(romanNumeralX);
        int base10L = rmc.rnToBase10(romanNumeralL);
        int base10C = rmc.rnToBase10(romanNumeralC);
        int base10D = rmc.rnToBase10(romanNumeralD);
        int base10M = rmc.rnToBase10(romanNumeralM);

        // then
        assertEquals(1, base10I);
        assertEquals(5, base10V);
        assertEquals(10, base10X);
        assertEquals(50, base10L);
        assertEquals(100, base10C);
        assertEquals(500, base10D);
        assertEquals(1000, base10M);
    }

}
