package com.arrays;
import java.util.*;

public class RemovingDuplicatesFromSorteddArray {
	public static void removingDuplicates(int[] arr) {
		int pointer = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[pointer] != arr[i]) {
				pointer++;
				arr[pointer]=arr[i];
			}
		}
		for(int i=0; i<= pointer; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		removingDuplicates(arr);
	}

}
