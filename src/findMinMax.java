import java.util.*;
public class findMinMax {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] array=new int[size];
		for(int i=0;i<array.length;i++)
		{
			array[i]=sc.nextInt();
			
		}
		int max=array[0];
		int min=array[0];
		for(int i=1;i<array.length;i++)
		{
			if(max<array[i])
			{
				max=array[i];
			}
			if(min>array[i])
			{
				min=array[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
		sc.close();
		
	}
}
