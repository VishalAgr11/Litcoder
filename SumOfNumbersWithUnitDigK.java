/*
Sum of Numbers With Units Digit K

You are given two integers, num and k. You need to find the minimum possible size of a set of positive integers with the following properties:

Each integer in the set has the unit digit equal to k.
The sum of all the integers in the set equals num.
If such a set exists, return its minimum size. Otherwise, if no set satisfies the conditions, return -1.

Note:
The set can contain multiple instances of the same integer, and if the set is empty, its sum is considered to be 0.
The unit digit of a number refers to its rightmost digit.
Consider the input:

num = 58
k = 9

The function should return 2 because there exists a valid set with two positive integers, both having the units digit 9, and their sum is equal to 58.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input :
56
9

Output :
4

Exercise-2

Input:
53

Output:
-1
 */

import java.util.*;

public class SumOfNumbersWithUnitDigK {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int k = input.nextInt();
        int ret = calcMin(num,k);        
        System.out.println(ret);
        input.close();
    }
    
    public static int calcMin(int num, int k) {
        if (num == 0) {
            return 0;
        }
        int un=num%10;
        if(num<k){
            return -1;
        }
        for (int i = 1; i <= 10; ++i) {
            int res=(k*i)%10;
            if (res==un) {
                if((k*i)>num){
                    return -1;
                }
                return i;
            }
        }
        return -1;
    }
}

