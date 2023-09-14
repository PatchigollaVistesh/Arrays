import java.util.*;

public class RepeatingAndMissingNumber {
	public static int[] optimal_RepeatedAndMissingNumber(int[] num) {
		int val1 , val2;
		int sum1 = 0, sumN1 = 0, sum2 = 0 ,sumN2 = 0;
		for(int i=0; i<num.length; i++) {
			sum1 += num[i];
			sum2 += num[i]*num[i];
		}
		sumN1 = ((num.length)*(num.length+1))/2;
		sumN2 = ((num.length)*(num.length+1)*(2*num.length+1))/6;
		//equation1 
		val1 = sum1 - sumN1;
		val2 = sum2 - sumN2;
		
		val2 = val2/val1;
		
		//r-m = val1 and r+m =val2
		//r = (val1+val2)/2
		
		int repeated = (val1+val2)/2;
		int missing = val2 - repeated;
		int ansArray[] = {repeated, missing};
		return ansArray;
	}
	
	public static int[] brute_repeatedAndMissingNum(int[] num, int size) {
		int repeated = -1, missing = -1;
		
		for(int i = 1; i <= size; i++) {
			int count = 0; 
			for(int j = 0; j < size; j++) {
				
				if(i==num[j]) {
					count++;
				}
			}
			if(count == 2)
				repeated = i;
			else if(count == 0)
				missing = i;
			
			if(repeated != -1 && missing != -1)
				break;
		}
		int[] array = {repeated, missing};
		return array;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] num = new int[size];
		for(int i=0; i<size ; i++) {
			num[i]=sc.nextInt();
		}
		
		
		int oAns[] = optimal_RepeatedAndMissingNumber(num);
		System.out.println("repeated:"+oAns[0] +" missing:"+ oAns[1]);

		
//		uncomment for Brute output
//		int bAns[] = brute_repeatedAndMissingNum(num, size);
//		System.out.println("repeated:"+bAns[0] +" missing:"+ bAns[1]);
	}

}
