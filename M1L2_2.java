/*
 Problem Statement
Queue
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
 */
package Litcoder;
import java.util.*;

public class M1L2_2 {
    static class Queue {
        static Stack<Integer> s1 = new Stack<Integer>();
        static Stack<Integer> s2 = new Stack<Integer>();

        static void enQueue(int x) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(x);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        static int deQueue() {
            if (s1.isEmpty()) {
                return -1; // Queue is empty
            }

            int x = s1.peek();
            s1.pop();
            return x;
        }

        static int front() {
            if (s1.isEmpty()) {
                return -1; // Queue is empty
            }

            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue q = new Queue();

        //Enter queries (1 x, 2, 3) separated by commas:
        String[] queries = scanner.nextLine().split(",");

        for (String query : queries) {
            String[] parts = query.trim().split(" ");
            int type = Integer.parseInt(parts[0]);

            switch (type) {
                case 1:
                    int x = Integer.parseInt(parts[1]);
                    q.enQueue(x);
                    break;
                case 2:
                    q.deQueue();
                    break;
                case 3:
                    System.out.println(q.front());
                    break;
            }
        }
        
        scanner.close();
    }
}
                                                                                                                            
