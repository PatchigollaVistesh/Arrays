package com.arrays;

import java.util.Scanner;

public class UniquePathsUsingCombinations {
	
	public static double uniquePaths(int m, int n) {
		int N = m-1 + n-1; //Number of steps needed to reach destination
		int r = m-1;
		double res = 1;
		
		for(int i=1;i<=r;i++) {
			res *= (N-r+i)/i;
		}
		
		return (int)res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		System.out.println(uniquePaths(m, n));
	}

}
