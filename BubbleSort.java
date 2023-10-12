package pyramid;
import java.util.*;
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int b[]= new int[n];
		for(int i=0;i<n;i++) b[i]=sc.nextInt();
		bubble_sort(b);
		System.out.println("The Sorted Array is: ");
		for(int i=0;i<n;i++) System.out.print(b[i]+" ");
		
	}
	private static void bubble_sort(int a[])
	{
		int count=0;
		int j=a.length-1;
		while(j!=0)
		{
			int i=0;
			while(i<j)
			{
				if(a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
					count++;
				}
				i++;
			}
			j--;
		}
		System.out.println("The Bubble Sorted Output: ");
		for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
	}
}
