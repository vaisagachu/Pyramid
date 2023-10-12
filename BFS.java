package pyramid;
import java.util.*;
public class BFS 
{
	static class Orange
	{
		int i,j;
		Orange(int i, int j)
		{
			this.i=i;
			this.j=j;
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		Queue<Orange> q=new LinkedList<>(); 
		while(t-->0)
		{
			int n=sc.nextInt(),i,j,day=0;
			int mat[][]=new int[n][n];
			for(i=0;i<n;i++)
			{
				String str=sc.next();
				for(j=0;j<n;j++)
				{
					mat[i][j]=(str.charAt(j)-48);
					if(mat[i][j] == 2)
					{
						q.add(new Orange(i,j));
					}
				}
			}
			while(!q.isEmpty())
			{
				int size=q.size();
				for(int k=0;k<size;k++)
				{
					Orange temp = q.poll();
					i = temp.i;
					j = temp.j;
					if(j-1 >= 0 && mat[i][j-1] == 1)
					{
						mat[i][j-1]=2;
						q.add(new Orange(i,j-1));
					}
					if(j+1 < n && mat[i][j+1] == 1)
					{
						mat[i][j+1]=2;
						q.add(new Orange(i,j+1));
					}
					if(i-1 >= 0 && mat[i-1][j] == 1)
					{
						mat[i-1][j]=2;
						q.add(new Orange(i-1,j));
					}
					if(i+1 < n && mat[i+1][j] == 1)
					{
						mat[i+1][j]=2;
						q.add(new Orange(i+1,j));
					}
				}
				day++;
			}
			boolean flag = true;
			for(i=0;i<n;i++)
			{
				for(j=0;j<n;j++)
				{
					if(mat[i][j]==1) 
					{
						flag = false;
						break;
					}
				}
			}
			if(flag) System.out.println(day);
			else System.out.println("-1");
			
		}
	}
}
