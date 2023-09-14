import java.util.*;
public class revArray {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] arr1=new int[size];
		int[] arr2=new int[size];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++)
		{
			arr2[size-i-1]=arr1[i];
		}	
		for(int i=0;i<size;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		sc.close();
	}
}
