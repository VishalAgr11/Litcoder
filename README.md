# Litcoder
 Litcoder questiions - CS JAVA
<br>

This repository contains all working codes for VIT Litcoder questions for CSE 

# Description of questions' topics - 

## String Analysis
You are given a string that represents an email address: "My e-mail: eMail_Address321@anymail.com". Your task is to analyze the composition of the characters in the string and determine the percentage of uppercase letters, lowercase letters, digits, and other characters such as symbols (#$., etc).

To accomplish this, you need to break down the string and calculate the percentage for each category. The results are as follows:

Uppercase letters: 7.5%
Lowercase letters: 65%
Digits: 7.5%
Other characters (symbols): 20%

Exercise-1

Input :
Support1@litwork.in
Output :
5.263%
78.947%
5.263%
10.526%

Exercise-2

Input:
Client.1234@litwork.in
Output:
4.545%
63.636%
18.182%
13.636%


## Contiguous Array
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


## Sudoku Board Validation Algorithm
You have been tasked with developing an algorithm to validate a 9 x 9 Sudoku board. Your algorithm needs to verify the validity of the filled cells on the board, adhering to the following conditions:

Every row should contain the numbers 1-9 exactly once, without repetition.
Every column should contain the numbers 1-9 exactly once, without repetition.
Each of the nine 3 x 3 sub-boxes within the grid should contain the numbers 1-9 exactly once, without repetition.

Can you outline an algorithm or a step-by-step approach to determine if the given Sudoku board configuration is valid based on these conditions?

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input :

9
5 3 . . 7 . . . .
6 . . 1 9 5 . . .
. 9 8 . . . . 6 .
8 . . . 6 . . . 3
4 . . 8 . 3 . . 1
7 . . . 2 . . . 6
. 6 . . . . 2 8 .
. . . 4 1 9 . . 5
. . . . 8 . . 7 9

Output :

YES

Exercise-2

Input:

9
5 3 . . 7 . . . .
5 . . 1 9 5 . . .
. 9 8 . . . . 6 .
8 . . . 6 . . . 3
4 . . 8 . 3 . . 1
7 . . . 2 . . . 6
. 6 . . . . 2 8 .
. . . 4 1 9 . . 5
. . . . 8 . . 7 9

Output:
NO


## Queue using two stacks
Write a program to implement a custom queue using two stacks. The queue should support the following three types of queries:
Enqueue: This query type is denoted by "1 x", where x is an element to be enqueued. It means that you need to insert element x at the end of the queue.
Dequeue: This query type is denoted by "2". It indicates that you should remove the element at the front of the queue.
Print Front: This query type is denoted by "3". It instructs you to print the element at the front of the queue without removing it.

Exercise-1

input:
1 42,2,1 14,3
output:
14

Exercise-2

input:
1 23,2,1 14,3,2,1 78,3
Output:
14
78


## Longest Substring
You are tasked with developing a function that finds the length of the longest substring without repeating characters in a given string s. Consider different scenarios involving various characters in the input string.

Scenario: String with No Repeating Characters
Input: "abcdef"
Expected Output: 6
Explanation: In this scenario, the input string contains no repeating characters, so the entire string itself is the longest substring without repeating characters.

Scenario: String with Repeating Characters
Input: "abccba"
Expected Output: 3
Explanation: In this case, the longest substring without repeating characters is "abc" with a length of 3. The characters 'c' and 'b' are repeated, so the substring ends at the first occurrence of the repeated character

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


## Create a text editor using commands
You are developing a text editor that allows users to perform various operations on the text using the "CustomStack" class. The class supports the following operations:

insert(value): Inserts a string of characters at the current cursor position in the text.
delete(value): Deletes the last value characters from the text starting from the current cursor position.
get(value): Retrieves the character at index value from the text and displays it.
undo(): Reverts the last executed command on the text.
Each command is represented by a string in the following format:

1.Command 1: '1 value' - Inserts the string value at the current cursor position in the text.
2.Command 2: '2 value' - Deletes the last value characters from the text starting from the current cursor position.
3.Command 3: '3 value' - Retrieves the character at index value from the text and displays it.
4.Command 4: '4' - Reverts the last executed command on the text.

Consider a scenario where you have a text editor with a "CustomStack" class that implements the required operations. Assume the initial text is empty.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1
input:
1 abc,3 3,2 2,3 1 Here
1 abc -> command and input text
3 3 -> command and index of the stack
Output:
c
a

Exercise-2

Input:
1 zxy,3 3,2 2,1 def,3 2
Output:
y
d


## Sum of Numbers With Units Digit K
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


## Build a wall with lego blocks
How many different ways can you build a wall of height 'n' and width 'm' using an infinite number of Lego bricks of four types, each with different dimensions (depth x height x width)? The types of Lego bricks available are:

Depth: 1, Height: 1, Width: 1
Depth: 1, Height: 1, Width: 2
Depth: 1, Height: 1, Width: 3
Depth: 1, Height: 1, Width: 4
The wall should satisfy the following conditions:

There should be no holes in the wall.
The wall should be a single solid structure without a straight vertical break across all rows of bricks.
The bricks must be laid horizontally.
Provide the number of ways to build the wall, considering that the result should be output modulo 1000000007.

Example:

For n = 2 and m = 2, the output should be legoWall(n, m) = 3.
For n = 3 and m = 2, the output should be legoWall(n, m) = 7.
For n = 2 and m = 3, the output should be legoWall(n, m) = 9.

Input/Output:

1.The input consists of two integers: n and m, representing the desired height and width of the wall, respectively.
2.The output is a long integer representing the number of ways to build the wall, modulo 1000000007.

Exercise-1

Input:
2
2
Here
First row - n value
Second row - m value
Output:
3

Exercise-2

Input:
4
4
Output:
3375


## Maximize Subsequences in String
You are given two strings, **text** and **pattern**, both consisting of only lowercase English letters. The objective is to modify the text by adding either pattern[0] or pattern[1] exactly once at any position. After the modification, you need to determine the maximum number of times the pattern can occur as a subsequence in the modified text.
A subsequence is a sequence of characters obtained by deleting some or no characters from the original sequence without changing the order of the remaining characters.

Important Note:
Ensure that you save your solution before progressing to the next question and before submitting your answer.

Example with Explanation
Input text is “abdcdbc”. Input Pattern is “ac”.
When inserting 'a' as Pattern [0] between text [1] and text [2], the resulting string is "abadcdbc." After deleting “bd” in the newly created text, we will get “aacc”. In this modified string, the subsequence "ac" appears four times.

Some other combinations are,
aabdcdbc -> aacc -> Four times
abdacdbc -> aacc-> Four times
abdcadbc -> acac -> Three times
abdccdbc -> accc -> Three times
abdcdbcc -> accc -> Three times

Input and Output format:

Exercise-1

Input: 
ababc
ab
Output:
5


Exercise-2

Input: 
ababab
ab
Output:
9


## Candies
You have a collection of candies, and each candy has a certain sweetness value. Your goal is to combine the candies to create new candies until you reach a specific target sweetness level. Find how many steps need to reach candies sweetness target.

To achieve this, you can select any two candies with the least sweetness and combine them into a new candy with sweetness calculated as follows:

sweetness = (least sweet candy + 2 * second least sweet candy)

For example, consider the following scenario:

You are given a target sweetness level of 12, and you have the following candies: [2, 8, 3, 7, 4, 6]. To reach the target sweetness of 12.

you can perform the following steps:
Ascending order = 2,3,4,6,7,8

Combine the two least sweet candies: 2 + 2*3 = 8. Updated candies: [ 8, 4, 6, 7, 8].
Combine the two least sweet candies: 4 + 2*6 = 16. Updated candies: [8, 16, 7, 8].
Combine the two least sweet candies: 7 + 2*8 = 23. Updated candies: [8,16,23].
Combine the two least sweet candies: 8 + 2*16 = 17. Updated candies: [40,23].
The sweetness of the first candy in the updated candies array is now 40, which exceeds the target sweetness of 12.

Exercise-1

Input:
7
1 2 3 4 5
Note:
Line 1 : Target of the sweetness
Line 2 Each candies sweetness
output:
3

Exercise-2

input:
11
2 5 3 7 6 1
output:
4


## Sliding Subarray Beauty:
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


## Check string prefix
You are given a list of passwords, where each password consists of lowercase letters from 'a' to 'z' inclusive. The set of passwords is said to be a 'GOOD PASSWORD' if no password is a prefix of another password in the set, except for identical passwords (which are considered prefixes of each other). In this case, print 'GOOD PASSWORD'. Otherwise, print 'BAD PASSWORD' on the first line, followed by the first pair of passwords where one password is a prefix of the other.
Consider the following list of words: ['apple', 'banana', 'application', 'bananas'].
In this case, the word 'banana' is a prefix of 'bananas'.

So we would print: 'BAD PASSWORD'

Now let's take another example with a different set of words: ['cat', 'dog', 'elephant']. In this scenario, none of the strings are prefixes of each other.

Therefore, we can conclude that: GOOD PASSWORD

Exercise-1

Input:
abc zxy pqr
Output:
GOOD PASSWORD

Exercise-2

Input:
abc abczxy abcpqr
Output:
BAD PASSWORD


## Clumsy Factorial
The clumsy factorial of a positive integer n is obtained by applying a fixed rotation of operations,
including multiplication '*', division '/', addition '+', and subtraction '-', to the integers in decreasing order. 
The operations are applied according to the usual order of operations in arithmetic, where multiplication and division are done before addition and subtraction.
For example, the clumsy factorial of n = 10 is calculated as follows:
clumsy(10) = 10 x 9 / 8 + 7 - 6 x 5 / 4 + 3 - 2 x 1.
We use floor division for the division operation, meaning the result is rounded down to the nearest integer.
Your task is to implement a function that takes a positive integer n as input and returns the clumsy factorial of n.

Important Note:
Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input : 
5

Output :
7
Exercise-2

Input:
10

Output:
11


## Mix the array
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


## Query Kth Smallest Trimmed Number:
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


## Egyptian Fraction
You are an ancient Egyptian mathematician, and you have been tasked with representing the fraction 6/14 as a sum of unique unit fractions. 
You know that a unit fraction is a fraction with a numerator of 1 and a denominator of a positive integer.
 You also know that the sum of any number of unit fractions is always a rational number.

Example:

The first step is to find the largest possible unit fraction that is less than or equal to 6/14. This fraction is 1/3. The remaining fraction is 6/14 - 1/3 = 4/42. The largest possible unit fraction that is less than or equal to 4/42 is 1/11. The remaining fraction is 4/42 - 1/11 = 1/231.

Therefore, the Egyptian fraction representation of 6/14 is 1/3 + 1/11 + 1/231.

Exercise-1

Input:
6
14

Output:
3
11
231

Exercise-2

Input:
3
4

Output:
2
4


## Task Scheduling
There are N tasks of varying durations, represented by an array A of size N. K workers are available, and each worker takes 1 unit of time to complete 1 unit of work. The goal is to find the minimum time required to complete all the tasks, with the constraint that each worker can only work on a continuous sequence of tasks.
To solve this problem, we can use the binary search algorithm to find the minimum time required..
e.g., with 4 tasks of 10,20,30 & 40 time duration and 2 workers, min time is 60 mins.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

INPUT :
4
10 20 30 40
2

First line => Number of tasks
Second line => task durations
Third line => Number of workers

OUTPUT :
60

Exercise-2

Input:
4
60 20 40 50
2

Output:
90


## Merge two sorted linked lists
Suppose we have two sorted linked lists, represented by the pointers headA and headB. Our task is to merge these two lists into a single sorted linked list. It's possible for either headX or headY to be null, indicating that the corresponding list is empty.

For example, consider the following linked lists:

headX refers to 2 -> 4 -> 6 -> 8 -> NULL
headY refers to 1 -> 3 -> 5 -> NULL

We need to merge these two lists into a new list, where the elements are sorted in ascending order. After merging, the resulting linked list would be:

1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 8 -> NULL

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1
input:
3
1
3
7
2
1
2

output:
1
1
2
3
7

Here the first value is the count of the first link node, and the fifth value is the count of the second link node.

Exercise-2
input:
3
2
3
4
2
1
7
Output:
1
2
3
4
7


## Connecting a network
In a geographical region, there are N cities labeled from 1 to N. These cities are interconnected using various transportation routes forming a network. The city connectivity is represented by a list of connections between cities in the form of a 2D array route[][]. Each row (city1, city2) denotes a direct transportation route between city1 and city2.

Your task is to ensure that all cities are connected either directly or indirectly. To achieve this, you can perform the following operations:

Remove any existing transportation route between two cities.
Add a new transportation route between two disconnected cities.
Your goal is to find the minimum number of operations required to achieve full connectivity of all cities in the region.

Return the minimum number of times you need to do this in order to make all the cities connected. If it is not possible, return -1.

Example
Input: N = 6,

routes[][] = {{1, 2}, {2, 3}, {3, 5}, {4, 5}, {5, 6}}

Output:
1

Exercise-1

Input : 
6
5
0 1
0 2
0 3
1 2
1 3

Note:
Line 1: Available cities
Line 2 : No of routes
From line 3 : connected cities pair

Output :
2
Exercise-2

Input:
5
5
0 1
0 2
0 3
1 2
2 3

Output:
1


## Is Graph Bipartite?
You have an undirected graph with n nodes, each represented by a number between 0 and n - 1. The graph is described by a 2D array graph, where graph[u] is an array containing nodes adjacent to node u. In other words, there is an undirected edge between node u and each node v present in graph[u]. The graph satisfies the following conditions:

There are no self-edges, meaning that node u is not present in graph[u].
There are no parallel edges, implying that each node appears only once in the adjacency list.
The graph is undirected, so if node v is adjacent to node u, then node u is also adjacent to node v (i.e., an edge between u and v implies an edge between v and u).
The graph may not be fully connected, so there can be two nodes u and v such that there is no direct path between them.
The task is to determine whether the given graph is bipartite or not. A graph is considered bipartite if its nodes can be partitioned into two independent sets, denoted as set A and set B, such that each edge connects a node from set A to a node from set B.
Example:

Input: [[1, 2, 3], [0, 2], [0, 1, 3], [0, 2]]
Output : false

0 -- 1
| |
3 -- 2

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input : 
4
1 2 3
0 2
0 1 3
0 2

Output :
false
Exercise-2

Input:
4
1 2 3
0 2
0 1
0

Output:
false
Exercise-3

Input:
4
1 3
0 2
1 3
0 2

Output:
true


## Distance of Elements
How can I determine if an array, possibly unsorted and containing duplicates, has duplicate elements within a specific distance "k" from each other? To provide further context, imagine you have an array of elements where the order is not important, and there may be duplicates present. For example, [5, 2, 3, 2, 4, 1]. You need to determine if there are any duplicate elements that are within a distance of "k" from each other. The distance "k" represents the number of indices between two elements in the array. If there are any duplicates within this distance, the function should return Yes; otherwise, it should return No.

Additionally, let's consider a scenario where you are given an array such as [7, 4, 5, 9, 2, 4, 1] and a number "k" that is smaller than the size of the array. For example, if "k" is 3, it means we need to check if there are any duplicate elements within a distance of 3 indices. In this case, the function should return true because the array contains duplicates within the specified distance.

e.g. If input is

1 2 3 4 1
5
return Yes

9 5 2 4 2 5 7 => input values
1 => k distance

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input :

9 5 2 4 2 5 7
1

Output :

No

Exercise-2

Input:

9 5 2 4 2 5 7
3

Output:

Yes


## Close the brackets
You are given a set of strings, each consisting of brackets (, ), {, }, [, or ]. A bracket is considered an opening bracket if it is one of (, {, or [, and it is considered a closing bracket if it is one of ), }, or ].

A string of brackets is considered balanced if it meets the following conditions:

It contains no unmatched brackets.
For every opening bracket, there is a corresponding closing bracket of the same type, and the brackets are properly nested.

Your task is to determine, for each given string, whether it is balanced or not. If a string is balanced, output "YES"; otherwise, output "NO".

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1
input:
{[()]},{[(])},{{[[(())]]}}

Output:
YES
NO
YES

Exercise-2
input:
[],{},(),[}
Output:
YES
YES
YES
NO


## Keeping a Secret
On the first day, one person discovers a secret.

You are given two integers, delay and forget. Each person will share the secret with a new person every day, starting from delay days after discovering the secret. Additionally, each person will forget the secret days after discovering it. It means they cannot share the secret on the same day they forget it or on any day afterward.

Your task is to find the number of people who know the secret at the end of day n.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Example

INPUT
6
2
4

Note: 
Line 1 :  number of days secret get spread
Line 2: delay day
Line 3 : forgetting day

OUTPUT
5
Exercise-1

Input : 
4
1
3

Output:
6
Exercise-2

Input:
3
2
3

Output:
2


## Common Child String
Let's consider a different scenario with two strings, s1='XYZA' and s2='XAYZ'. We want to find the longest string that can be formed by removing characters from both strings without rearranging any letters. In this case, the strings have two children with a maximum length of 2: 'XY' and 'YZ'. These children can be obtained by eliminating either the 'A' or 'Z' character from both strings. The desired result for this scenario would be 2, indicating the length of the longest common child string.

Important Note: Ensure that you save your solution before progressing to the next question and before submitting your answer.

Exercise-1

Input:
pqrs
opqs

Output:

3

Exercise-2

Input:

pacb
opqs

Output:
1