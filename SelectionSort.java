package pyramid;
import java.util.*;
public class SelectionSort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) a[i]=sc.nextInt();
		selection_sort(a);
		System.out.println("The sorted array is: ");
		for(int i=0;i<n;i++)System.out.print(a[i]+" ");
		
	}
	static void selection_sort(int a[])
	{
		int index=0,n=a.length;
		for(int i=0;i<n-1;i++)
		{
			index=i;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]<a[index]) index=j;
			}
			if(index!=i)
			{
				int temp=a[i];
				a[i]=a[index];
				a[index]=temp;
			}
		}
	}
}
