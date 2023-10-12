package pyramid;
import java.util.*;
public class InsertionSort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		insertion_sort(a);
		System.out.println("The sorted array is: ");
		for(int i=0;i<n;i++)System.out.print(a[i]+" ");
	}

	static void insertion_sort(int[] a) 
	{
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i],j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		
	}
}
