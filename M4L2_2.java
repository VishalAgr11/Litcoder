/*
 Egyptian Fraction
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
 */
package Litcoder;
import java.util.*;

public class M4L2_2 {
	static void printEgyptian(int nr, int dr)
	{
		if (dr == 0 || nr == 0) {
			return;
		}

		if (dr % nr == 0) {
			System.out.println(dr / nr);
			return;
		}

		if (nr % dr == 0) {
			//System.out.println(nr / dr);
			return;
		}
		if (nr > dr) {
			//System.out.print(nr / dr + " + ");
			printEgyptian(nr % dr, dr);
			return;
		}

		int n = dr / nr + 1;
		System.out.println(n);
		printEgyptian(nr * n - dr, dr * n);
	}

	public static void main(String[] args)
	{
        Scanner in=new Scanner(System.in);
		int nr = in.nextInt(), dr = in.nextInt();
		printEgyptian(nr, dr);
        in.close();
	}
}
