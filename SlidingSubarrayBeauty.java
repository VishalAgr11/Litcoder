/*
Sliding Subarray Beauty:
You are given an array of integers arr and an integer k. Your task is to find the given n th position of the smallest integer in each contiguous subarray of size k and print these smallest integers.
A subarray is a contiguous non-empty sequence of elements within the original array.
For each subarray of size k, you need to find the given n th position of the smallest integer within that subarray.
The given n th position of the smallest integer in a subarray is the integer that appears at the given n th position when the subarray is sorted in ascending order.
.
Your task is to return an integer array containing n - k + 1 elements, denoting the beauty of the subarrays in order from the first index in the array.

Exercise-1

Input: 
1 2 3 4 5 6 7 8 9 10
3
2
Note: 
Line 1: input array
Line 2: sub array length
Line 3: position of the smallest value

Output:
2 3 4 5 6 7 8 9
Exercise-2

Input:
1 2 3 4 5 6 7 8 9 10
4
2

Output:
2 3 4 5 6 7 8
 */


import java.util.*;

public class SlidingSubarrayBeauty {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int size=10;
        int arr[]=new int[size];
        for (int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        int k=in.nextInt();
        int n=in.nextInt();
        getSubarrayBeauty(arr,k,n);
        in.close();
    }
    public static void getSubarrayBeauty(int[] arr, int k, int n) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] result = new int[arr.length - k + 1];

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);

            if (pq.size() > k) {
                pq.poll();
            }

            if (i - k + 1 >= 0) {
                if (n <= pq.size()) {
                    result[i - k + 1] = pq.poll();
                } else {
                    result[i - k + 1] = 0;
                }
            }
        }
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
