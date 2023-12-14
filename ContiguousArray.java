/*
 Contiguous Array
Given a binary array 'nums', you are required to find the maximum length of a contiguous subarray that contains an equal number of 0s and 1s.

Explanation:

A binary array is an array that contains only 0s and 1s.
A subarray is any subset of the indices of the original array.
A contiguous subarray is a subarray in which all the elements are consecutive, i.e., any element between the first and last element of the subarray is also part of it.
Examples:
Input :nums = [0, 1]
Output : 2
Explanation: The longest contiguous subarray with an equal number of 0s and 1s is [0, 1] with a length of 2.
Input : nums = [0, 1, 0]
Output : 2
Explanation: The longest contiguous subarray with an equal number of 0s and 1s is either [0, 1] or [1, 0], both with a length of 2.
Input : nums = [0, 0, 0, 1, 1, 1]
Output : 6
Explanation: The longest contiguous subarray with an equal number of 0s and 1s is [0, 0, 0, 1, 1, 1] with a length of 6.
The problem requires finding the maximum length of a contiguous subarray in the binary array 'nums' that contains an equal number of 0s and 1s.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input : 
0 0 0 1 1 1 1 0

Output :
8
Exercise-2

Input:
1 0 0 1 1 1 1 0

Output:
4
 */

import java.util.*;

public class ContiguousArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        int result = findMaxLength(nums);
        System.out.println(result);
    }

    public static int findMaxLength(int[] nums) {
        int maxLength = 0;
        int sum = 0;
        Map<Integer, Integer> sumToIndex = new HashMap<>();
        sumToIndex.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0) ? -1 : 1;

            if (sumToIndex.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - sumToIndex.get(sum));
            } else {
                sumToIndex.put(sum, i);
            }
        }

        return maxLength;
    }
}
