package pyramid;
import java.util.*;
class BST
{
	Node root;
	BST()
	{
		root=null;
	}
	
	void PreOrder_Traversal(Node temp)
	{
		if(temp!=null)
		{
			System.out.print(temp.data+" ");
			PreOrder_Traversal(temp.left);
			PreOrder_Traversal(temp.right);
		}
	}
	void InOrder_Traversal(Node temp)
	{
		if(temp!=null)
		{
			InOrder_Traversal(temp.left);
			System.out.print(temp.data+" ");
			InOrder_Traversal(temp.right);
		}
	}
	void PostOrder_Traversal(Node temp)
	{
		if(temp!=null)
		{
			PostOrder_Traversal(temp.left);
			PostOrder_Traversal(temp.right);
			System.out.print(temp.data+" ");
		}
	}
	void Insert(int data)
	{
		root=InsertInto(root,data);
	}
	Node InsertInto(Node root, int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		if(data<root.data)
		{
			root.left=InsertInto(root.left,data);
		}
		else
		{
			root.right=InsertInto(root.right,data);
		}
		return root;
	}
}
class Node
{
	int data;
	Node left;
	Node right;
	Node (int data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
}
public class BinarySearchTree
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
			int n=sc.nextInt();
			BST tree=new BST();
			for(int i=0;i<n;i++)
			{
				int data=sc.nextInt();
				tree.Insert(data);
			}
			tree.PreOrder_Traversal(tree.root);
			System.out.println();
			tree.InOrder_Traversal(tree.root);
			System.out.println();
			tree.PostOrder_Traversal(tree.root);
			System.out.println();
			if(t>0) System.out.println();
		}
	}
}
