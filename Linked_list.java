package pyramid;
import java.util.*;
public class Linked_list 
{
	Node head;
	class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;	
			this.next=null;
		}
	}
	Linked_list(){
		head=null;
	}
	void reverse()
	{
		Node temp=head,prev=null,next=head.next;
		while(temp!=null)
		{
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		while(prev!=null)
		{
			System.out.print(prev.data+"-->");
			prev=prev.next;
		}
		System.out.print("Null");
		System.out.println();
	}
	void Insert_End(int value) 
	{
		Node newnode = new Node(value);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			Node temp=head;
			while(temp.next != null)
			{
				temp=temp.next;
			}
			temp.next=newnode;
		}
	}
	void Insert_Begin(int value) 
	{
		Node newnode = new Node(value);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			newnode.next=head;
			head=newnode;
		}
	}
	void Delete_End()
	{
		if(head!=null)
		{
			if(head.next==null)
			{
				head=null;
			}
			else
			{
				Node temp = head;
				while(temp.next.next!=null)
				{
					temp=temp.next;
				}
				temp.next=null;
			}
		}
	}
	void Delete_Begin()
	{
		if(head!=null)
		{
			head=head.next;
		}
	}
	void Print_List()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" --> ");
			temp=temp.next;
		}
		System.out.print("Null");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Linked_list li=new Linked_list();
		while(true)
		{
			System.out.println("0 - Exit");
			System.out.println("1 - Print List");			
			System.out.println("2 - Insert End");
			System.out.println("3 - Insert Begin");			
			System.out.println("4 - Delete End");			
			System.out.println("5 - Delete Begin");			
			int n=sc.nextInt();
			if(n==0) break;
			else if(n==2)
			{
				int a=sc.nextInt();
				li.Insert_End(a);
			}
			else if(n==1)
			{
				li.Print_List();
			}
			else if(n==3)
			{
				int a=sc.nextInt();
				li.Insert_Begin(a);
			}
			else if(n==4)
			{
				li.Delete_End();
			}
			else if(n==5)
			{
				li.Delete_Begin();
			}
			else if(n==6)
			{
				li.reverse();
			}
		}
	}
}
