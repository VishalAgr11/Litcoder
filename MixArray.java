/*
Mix the array
Given a 1-indexed array initially filled with zeros and a list of operations, 
perform each operation by adding a value to each element of the array between two given indices (inclusive). 
After performing all operations, find and return the maximum value in the array.

For example, let's consider the following scenario:
q = {[2,4,5],[3,6,3],[1,7,10]}
Initial Array size = 7

Array: [0, 0, 0, 0, 0, 0, 0]

Operations:

Add 5 between indices 2 and 4: [0, 5, 5, 5, 0, 0, 0]
Add 3 between indices 3 and 6: [0, 5, 8, 8, 3, 3, 0]
Add 10 between indices 1 and 7: [10, 15, 18, 18, 13, 13, 10]
In this scenario, the maximum value in the array is 18.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input:

5
3
2 4 3
4 5 9
3 3 11

Output:
14

Note:
Line -1 : array size
Line -2 : query count

Exercise-2

Input:

10
3
3 10 3
4 5 9
2 9 11

Output:
23
*/


import java.util.*;

public class MixArray {
    public static long mixTheArray(long[] arr, int n, int q, int[][] queries) {
        long[] prefixSum = new long[n + 1];

        for (int i = 0; i < q; i++) {
            int left = queries[i][0] - 1;
            int right = queries[i][1] - 1;
            int value = queries[i][2];
            prefixSum[left] += value;
            prefixSum[right + 1] -= value;
        }

        long max = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += prefixSum[i];
            arr[i] += sum;
            max = Math.max(max, arr[i]);
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int q = in.nextInt(); 
        long[] arr = new long[size];
        int[][] queries = new int[q][3];
        for (int i = 0; i <q; i++) {
            for(int j=0;j<3;j++){
                queries[i][j]=in.nextInt();
            }
        }
        long max = mixTheArray(arr, size, q, queries);
        System.out.println(max);
        in.close();
    }
}
