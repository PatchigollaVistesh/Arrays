package com.arrays;

import java.util.*;

/* INPUT 
   4 4
   1 1 1 1
   1 0 0 1
   1 0 0 1
   1 1 1 1
   OUTPUT
   1 0 0 1  
   0 0 0 0  
   0 0 0 0  
   1 0 0 1  */

public class ZeroMatrix {

	public void zeroMatrix(int[][] matrix, int m, int n) {
		int col = 1;

		// marking the rows and cols which has to be marked zero at 0th row and 0th col
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (matrix[i][j] == 0 && j != 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
				if (matrix[i][j] == 0 && j == 0) {
					matrix[i][0] = 0;
					col = 0;
				}
			}
		}
		
		// otherthan 0th row and 0th column mark zeros
		for (int i = 1; i < m; i++) {
			for(int j = 1; j < n; j++) {
				if(matrix[i][0]==0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		
		//marking 0th row
		if(matrix[0][0] == 0) {
			for(int i = 0; i < n ; i++) {
				matrix[0][i] = 0;
			}
		}
		
		//marking 0th column
		if( col == 0) {
			for( int i = 0; i < m ; i++) {
				matrix[i][0] = 0;
			}
		}
		
		//output matrix
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]+" " );
			}
			System.out.println(" ");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input for row size and col size
		int row = sc.nextInt(), col = sc.nextInt();

		// declaring 2D array
		int[][] matrix = new int[row][col];

		// input for 2D array
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		ZeroMatrix object = new ZeroMatrix();
		object.zeroMatrix(matrix, row, col);

	}

}
