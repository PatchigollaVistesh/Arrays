package com.arrays;
import java.util.*;

public class UniquePathsUsingRecursion {
	public  static int uniquePaths(int i, int j, int m, int n) {
		if (i == m - 1 && j == n - 1)
			return 1;
		else if (i > m - 1 || j > n - 1)
			return 0;
		else
			return uniquePaths(i + 1, j, m, n) + uniquePaths(i, j + 1, m, n);
	}

	public static int uniquePaths(int m, int n) {
		return uniquePaths(0, 0, m, n);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(uniquePaths(m,n));
	}

}
