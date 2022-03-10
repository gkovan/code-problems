/**
 * 
 */
package com.example.demos.test.java.fizzbuzz;

/**
 * @author gkovan@us.ibm.com
 *
 */
public class FizzBuzz {

    /**
     * @param num
     * @return
     */
    public String process(int num) {
        String result = String.valueOf(num);
        if (num % 3 == 0)
            result = "Fizz";
        if (num % 5 == 0)
            result = "Buzz";
        if (num % 3 == 0 && num % 5 == 0)
            result = "Fizz Buzz";
        return result;
    }

    /**
     * @param num
     * @return
     */
    public void process(int[] num) {
        for (int i = 0; i < num.length; i++)
            System.out.println(process(num[i]));
    }

}
