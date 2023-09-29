package com.arrays;
import java.util.*;


public class CountInversionsUsingMergeSort {
	
	public static int countInversions(int[] array, int low, int high) {
		int count = 0;
		int mid = (low + high) / 2;
		if(low >= high) return count;
		count += countInversions(array, low, mid);
		count += countInversions(array, mid+1, high);
		
		count += merge(array, low, mid, high);
		return count;
	}
	
	public static int merge(int[] array, int low, int mid, int high) {
		int left = low;
		int right = mid+1;
		int count = 0;
		Vector<Integer> temp = new Vector<>();
		
		while(left <= mid && right <= high) {
			if(array[left] > array[right]) {
				count += (mid-left+1);
				temp.add(array[right]);
				right++;
			}
			else {
				temp.add(array[left]);
				left++;
			}
		}
		while( left <= mid) {
			temp.add(array[left]);
			left++;
		}
		while( right <= high) {
			temp.add(array[right]);
			right++;
		}
		
		for(int i=low;i<=high;i++) {
			array[i] = temp.get(i-low);
		}
		return count;
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}

		
		System.out.println(countInversions(array, 0, size - 1));
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
