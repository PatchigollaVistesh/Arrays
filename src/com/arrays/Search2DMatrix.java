package com.arrays;
import java.util.*;;


public class Search2DMatrix {
	public static boolean searchingInMatrix(int[][] matrix, int target) {
		int n = matrix.length;
        int m = matrix[0].length;

        int left = 0, right = (n*m)-1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(matrix[mid/m][mid%m] == target)
            return true;
            else if(matrix[mid/m][mid%m] < target)
            left = mid + 1;
            else
            right = mid - 1;
        }
        return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] matrix = new int[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int target = sc.nextInt();
		System.out.println(searchingInMatrix(matrix, target));
	}

}
