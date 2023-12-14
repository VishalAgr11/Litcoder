/*
 Query Kth Smallest Trimmed Number:
Given a list of strings nums, where each string has equal length and consists of only digits, 
and a 2D array queries containing queries in the form of [ki, trimi], you are required to perform the following steps for each query:
Trim each number in nums to its right most trimi digits by removing the left most digits until only trimi digits remain.
Determine the index of the kth smallest trimmed number in the modified nums.
If two trimmed numbers are equal, consider the number with the lower index to be smaller.
Reset each number in nums to its original length.
Store the answers to each query in an array answer, where answer[i] is the answer to the ith query.

Constraints:

The input strings in nums are of equal length and consist of digits only.
The queries in the 2D array queries are 0-indexed and represented as [ki, trimi].
Trimming to the rightmost x digits means keeping only the last x digits of each number, 
removing the leftmost digits until only x digits remain.
The input strings in nums may contain leading zeros.
Example:

given input is 113 933 231 719,
Take first query 1 1 (here first 1 is position , second is selecting a digit from right) 
So each digit we need to take one digit value form right - 113 is 3, 933 is 3 231 is 1 719 is 9 [ 3 3 1 9 ] 
so the first smallest value is 1 , then the index value of 1 is 2.
Second query 2 2 So each digit we need to take two digit value form right.So we get [ 13 33 31 19 ] Second smallest value 19 , then the index value of 19 is 3.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input : 
113 933 231 719
4
1 1 
2 2
4 2
1 3

Note:
Line 1: input values
Line 2 : Queries count
From line 3 : query pair[ position, decimal length from right]

Output :
2 3 1 0
Exercise-2

Input:
123 456 246 369
4
1 1 
2 2
4 2
1 3

Output:
0 2 3 0
 */

import java.util.*;

public class QueryKthSmallestTrimmedNumber {
    public static void smallestTrimmed(String[] nums, int[][] queries) {
        int[] result = new int[queries.length];
        int strLen = nums[0].length();
        int[] index = new int[1];
		
        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
            for (int i = index[0]; i < strLen; i++) {
                if (nums[a].charAt(i) != nums[b].charAt(i))
                    return nums[b].charAt(i) - nums[a].charAt(i);
            }

            return b - a;
        });

        for (int i = 0; i < queries.length; i++) {
            index[0] = strLen - queries[i][1];
            queue.clear();

            for (int j = 0; j < nums.length; j++) {
                queue.add(j);
                if (queue.size() > queries[i][0])
                    queue.poll();
            }

            result[i] = queue.poll();
        }
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+" ");
        }
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num_size=4;
        String[] nums = new String[num_size];
        for(int i=0;i<num_size;i++){
            nums[i]=in.next();
        }
        int size = in.nextInt();
        int[][] queries = new int[size][2];
        for(int i=0;i<num_size;i++){
            for(int j=0;j<2;j++){
                queries[i][j]=in.nextInt();
            }
        }
        smallestTrimmed(nums, queries);
        in.close();
    }
}
