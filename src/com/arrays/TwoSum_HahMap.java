package com.arrays;

import java.util.*;

public class TwoSum_HahMap {

	public static int[] twoSum(int[] array, int target) {
		HashMap<Integer, Integer> checkTarget = new HashMap<>();
		int[] ans = new int[2];
		ans[0]=-1;
		ans[1]=-1;
		for(int i=0;i<array.length;i++) {
			int remainingTarget = target - array[i];
			if(checkTarget.containsKey(remainingTarget)) {
				ans[0] = checkTarget.get(remainingTarget);
				ans[1] = i;
				return ans;
			}
			checkTarget.put(array[i], i);
		}
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int ans[] = twoSum(array, target);
		System.out.println(ans[0] + "," + ans[1]);
		
	}

}
