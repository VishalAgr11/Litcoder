/*
Build a wall with lego blocks
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

 */

import java.util.*;

public class WallUsingLegoBlocks {
	int md=1000000007;
	int[][] ways = new int[1001][1001];
	int[][] waysRestrict = new int[1001][1001];
	public WallUsingLegoBlocks(){
		for(int[] w : ways) Arrays.fill(w, -1);
		for(int[] w : waysRestrict) Arrays.fill(w, -1);
	}
	public int solve(int n, int m)
	{
		if (ways[n][m] != -1) return ways[n][m];
		long ans;
		if (m==1) ans = 1;
		else if (n==1){
			if (m<=4) {
				ans = 2*solve(1,m-1);
			}
			else {
				ans = solve(1,m-1);
				ans = (ans + solve(1,m-2))%md;
				ans = (ans + solve(1,m-3))%md;
				ans = (ans + solve(1,m-4))%md;
			}
		}
		else{
			ans = 1; int one = solve(1,m);
			for (int i=0; i<n; i++) ans = (ans * one)%md;
		}
		ways[n][m] = (int)ans;
		return ways[n][m];
	}
	public int solveRestrict(int n, int m)
	{
		if (waysRestrict[n][m] != -1) return waysRestrict[n][m];
		long ans;
		if (m==1) ans = 1;
		else {
			ans = solve(n,m);
			for (int i=1; i<m; i++) {
				long a = solve(n,i);
				a = (a*solveRestrict(n,m-i))%md;
				ans -= a;
				if (ans<0) ans+=md;
			}
		}
		waysRestrict[n][m] = (int)ans;
		return waysRestrict[n][m];
	}
	public static void main (String[] args) {
		WallUsingLegoBlocks o = new WallUsingLegoBlocks();
		Scanner sc = new Scanner(System.in);
		int a, b;
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println(o.solveRestrict(a,b));
		sc.close();
	}
}