package pyramid;
import java.util.*;
public class DoublyLinkedList 
{
	Node head;
	Node tail;
	class Node
	{
		int data;
		Node next;
		Node prev;
		Node(int data)
		{
			this.data = data;
			next = null;
			prev = null;
		}
	}
	DoublyLinkedList()
	{
		head = null;
		tail = null;
	}
	void Insert(int data, int pos)
	{
		Node temp = head;
		if(pos == 0)
		{
			InsertBegin(data);
			return;
		}
		Node newnode = new Node(data);
		for(int i=1 ; i<pos ; i++)
		{
			temp = temp.next;
			if(temp == null) throw new IndexOutOfBoundsException("Invalid Position");
		}
		newnode.prev = temp;
		newnode.next = temp.next;
		if(temp.next == null)
			tail = newnode;
		else
			newnode.next.prev = newnode;
		temp.next =newnode;
		
	}
	void InsertBegin(int data)
	{
		Node newnode = new Node(data);
		newnode.next = head;
		if(head == null)
			tail = newnode;
		else
			head.prev = newnode;
		head = newnode;
	}
	void Reverse()
	{
		Node temp = tail;
		System.out.print("Null");
		while(temp != null)
		{
			System.out.print("-->"+temp.data);
			temp = temp.prev;
		}
		System.out.println();
	}
	void Print()
	{
		Node temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+"-->");
			temp = temp.next;
		}
		System.out.println("Null");
		System.out.println();
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList li = new DoublyLinkedList();
		while(true)
		{
			System.out.println("0 - Exit");
			System.out.println("1 - Print Elements");
			System.out.println("2 - InsertBegin");
			System.out.println("3 - Reverse");
			System.out.println("4 - Insert at the Position");
			int n=sc.nextInt();
			if(n==0)
				break;
			else if(n==1)
			{
				li.Print();
			}
			else if(n==2)
			{
				int a = sc.nextInt();
				li.InsertBegin(a);
			}
			else if(n==3)
			{
				li.Reverse();
			}
			else if(n==4)
			{
				int a=sc.nextInt();
				int pos=sc.nextInt();
				li.Insert(a, pos);
			}
			
		}
	}
	
}
