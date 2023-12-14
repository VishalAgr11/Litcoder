/*
 Longest Substring
You are tasked with developing a function that finds the length of the longest substring without repeating characters in a given string s. Consider different scenarios involving various characters in the input string.

Scenario: String with No Repeating Characters
Input: "abcdef"
Expected Output: 6
Explanation: In this scenario, the input string contains no repeating characters, so the entire string itself is the longest substring without repeating characters.

Scenario: String with Repeating Characters
Input: "abccba"
Expected Output: 3
Explanation: In this case, the longest substring without repeating characters is "abc" with a length of 3. The characters 'c' and 'b' are repeated, so the substring ends at the first occurrence of the repeated character

Important Note:
Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1
Input :
pqrsstu

Output :
4

Exercise-2

Input:
abbedfgi

Output:
6
 */

import java.util.*;

public class LongestSubstring {
    public static String findLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int n = s.length();
        int start = 0, maxLength = 0, maxStart = 0;
        HashMap<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= start) {
                start = charIndexMap.get(currentChar) + 1;
            }

            charIndexMap.put(currentChar, end);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }

        return s.substring(maxStart, maxStart + maxLength);
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input = in.next();
        String longestSubstring = findLongestSubstring(input);
        System.out.println(longestSubstring.length());
        in.close();
    }
}
                                                                                                                            

