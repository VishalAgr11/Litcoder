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

package Litcoder;
import java.util.Scanner;
public class M1L1_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num =in.nextInt();
        int arr[]=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=in.nextInt();
        }
        findsub(arr,num);
        in.close();
    }
    
    public static void findsub(int arr[], int n) {
        int sum=0;
        int maxsize=-1, startidx=0, endidx=0;
        
        for(int i=0;i<n-1;i++){
            sum=(arr[i]==0)?-1:1;
            for(int j=i+1;j<n;j++){
                if(arr[j]==0){
                    sum+=-1;
                }
                else{
                    sum+=1;
                }
                if(sum==0 &&maxsize<j-i+1){
                    maxsize=j-i+1;
                    startidx=i;
                }
            }
        }
        endidx = startidx+maxsize-1;
        if(maxsize==-1){
            System.out.println("0");
        }
        else{
            System.out.println(endidx-startidx+1);
        }
    }
}
