package com.arrays;
import java.util.*;

public class fourSum {
	
	    public  static List<List<Integer>> fourSum_Pointers(int[] array, int target) {
	        int n = array.length;
	        List<List<Integer>> list = new ArrayList<>();
	        Arrays.sort(array);

	        for(int i=0;i<n;i++){
	            if( i>0 && array[i]==array[i-1]) continue;
	                for(int j=i+1;j<n;j++){
	                // avoiding duplicates
	                if(j>i+1 && array[j]==array[j-1]) continue;
	                int left=j+1, right=n-1;
	                    while(left < right){
	                    long sum = array[i] + array[j];
	                    sum += array[left];
	                    sum += array[right];
	                        if(sum == target){
	                        List<Integer> temp = new ArrayList<>();
	                        temp.add(array[i]);
	                        temp.add(array[j]);
	                        temp.add(array[left]);
	                        temp.add(array[right]);
	                        list.add(temp);
	                        left++;
	                        right--;

	                        while(left < right && array[left] == array[left-1]) left++;
	                        while(left < right && array[right] == array[right+1]) right--;
	                        }
	                    else if(sum < target) left++;
	                    else right--;
	                    }
	                
	                }      
	        }
	        return list;
	    }


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] array = new int[size];
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		int target = sc.nextInt();
		List<List<Integer>> ans = fourSum_Pointers(array, target);
		System.out.println(ans);
	}


}
