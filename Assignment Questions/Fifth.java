import java.util.Scanner;
import static java.lang.System.*;

class Node
{
	int data;
	Node next;
	Node(int val)
	{
		data = val;
		next = null;
	}
		
}


class A
{
	Node head;
	//Insert
	void insert(int value)
	{
		Node obj = new Node(value);
		if(head == null)
		{
			head = obj;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}
			n.next = obj;
		}
	}
	// Print
	void show() 
	{
		if(head == null)
		{
			System.out.println("----Empty List---");
		}
		else
		{
			Node n = head;
			System.out.println();
			int c = 0;
			while(n!=null)
			{
				System.out.print(n.data + ", ");
				c++;
				n = n.next;
			}
			System.out.print(".");
			System.out.println();
			System.out.println("Number of elements are: " + c);
		}
	}
	// Search
	void find(int search)
	{
		if(head == null)
		{
			System.out.println("----Empty list to search-----");
		}
		else
		{
			Node n = head;
			int c = 0;
			while(n!=null)
			{
				
				if(n.data == search)
				{
					System.out.println("The search of  "+ n.data+ "is found");
					c++;
					
					break;
				}
				n = n.next;
			}
			if(c == 0)
			{
				System.out.println("The entered element not found in list");
			}
		}
	}
	// Insert At Start
	void insertStart(int value)
	{
		if(head == null)
		{
			Node obj = new Node(value);
			head = obj;
		}
		else
		{
			
			Node obj = new Node(value);
			obj.next = head;
			head = obj;
		}
		System.out.println("Value inserted");
	}
	
	void insertAt(int ind, int value)
	{
		
		if(ind == 0)
		{
			insertStart(value);
		}
		else
		{
			if(head == null)
			{
				out.println("Wrong Input Please check");
				return;
			}
			Node n = head;
			Node obj = new Node(value);
			for(int i = 0; i < ind -1; i++)
			{
				n = n.next;
			}
			obj.next = n.next;
			n.next = obj;
			System.out.println("Value Inserted");
		}
	}
	// Delete
	void del(int ind) 
	{
		
		if(head == null)
		{
			out.println("Empty list");
			return;
		}
		Node n = head;
		if(n.data == ind)
		{
			head = n.next;
			System.out.println("Deleted");
			return;
		}
		while(n.next != null)
		{
			if(n.next.data == ind)
			{
				if(n.next.next == null)
				{
					n.next = null;
					System.out.println("Deleted value");
					return;
				}
				Node temp = n.next.next;
				n.next = temp;
				System.out.println("Value Deleted");
				return;
			}
			n = n.next;
		}
	}
	
	public void reverse()
	{
		Node current = head;
		Node prev = null, next = null;
		if(current == null)
		{
			out.println("Empty List");
			return;
		}
		while(current != null)
		{
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	
    public void sort() // Ascending sort
    {
        Node current = head, index = null;
        int temp;
  
        if (head == null) {
            return;
        }
        else {
            while (current != null) 
            {
                index = current.next;
  
                while (index != null) 
                {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
  
                    index = index.next;
                }
                current = current.next;
            }
        }
    }
	
}

public class Linkedlist
{
	public static void main(String[] args) throws Exception
	{ 
		A obj1 = new A();
		Scanner obj = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Select Option\n1. Insert\n2. Print List\n3. Search\n4. Insert At Start\n5. Insert at given Index\n6. Delete\n7. Sort\n8. Reverse Linked List\n9. Exit");
		 	int n = obj.nextInt();
			if(n == 1)
			{
				System.out.println("How many you want to enter");
				int s = obj.nextInt();
				for(int i = 0; i < s; i++)
				{
					System.out.println("Enter value");
					int value = obj.nextInt();
					obj1.insert(value);
				}
			}
			else if(n == 2)
			{
				obj1.show();
			}
			else if(n == 3)
			{
				System.out.println("Enter the element for search");
				int search = obj.nextInt();
				obj1.find(search);
			}
			else if(n == 4)
			{
				System.out.println("Enter value");
				int value = obj.nextInt();
				obj1.insertStart(value);
			}
			else if(n == 5)
			{
				System.out.println("Enter index");
				int ind, value;
				ind = obj.nextInt();
				System.out.println("Enter value");
				value = obj.nextInt();
				obj1.insertAt(ind, value);
			}
			else if(n == 6)
			{
				out.println("Enter the index to delete");
				int ind = obj.nextInt();
				obj1.del(ind);
			}
            else if(n == 7)
            {
                out.println("Sorting the Linked List");
                obj1.sort();
            }
			else if(n == 8)
			{
				obj1.reverse();
				System.out.println("Reversed");
			}
			else
			{
				System.out.println("******THE END******");
				obj.close();
				break;
			}
		}
		
		
	}
	
}
