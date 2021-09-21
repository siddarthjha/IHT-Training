import java.util.Scanner;
import static java.lang.System.*;


class Main
{
	int front = -1, rear = -1;
	int m = 5; // Size
	int queue[] = new int[m];
    
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Main obj = new Main();
		while(true)
		{
			out.println("1. Insert\n2. Delete\n3. Display\n4. EXIT");
			int n = sc.nextInt();
			if(n == 1)
			{
				out.println("Enter value");
				int val = sc.nextInt();
				obj.enqueue(val);
			}
			else if(n == 2)
			{
				obj.dequeue();
			}
			else if(n == 3)
			{
				obj.display();
			}
			else
			{
				out.println("EXIT");
				break;
			}
		}
	}
    
    void enqueue(int data)
	{
		if(front ==0 && rear == m-1 || (rear == (front - 1) % (m - 1)))
		{
			out.println("Overflow"); //Queue is full
			return;
		}
		else if(front == -1 && rear == -1) // Empty Queue
		{
			front = 0;
			rear = 0;
            queue[rear] = data;
		    out.println("Value Inserted");
		}
		else if (rear == m - 1 && front != 0)
		{
			rear = 0;
            
		}
        else
        {
            rear = (rear + 1);
        
            // Adding a new element if
            if(front <= rear)
            {
                queue[rear] = data;
		        out.println("Value Inserted");
            }
        
            // Else updating old value
            else
            {
                queue[rear] = data;
		        out.println("Value Inserted");
            }
            
        }
		
	} 

    void dequeue()
	{
		if(front == -1 || front > rear) // Empty queue
		{
			out.println("Underflow");
		}
        if(front == rear) // Condition for one element
        {
            front = -1;
            rear = -1;
            out.println("Value Deleted");
        }
		else
		{
			front += 1;
			out.println("Value Deleted");
		}
	}

    void display()
	{
		
		if(front == -1)
		{
			out.println("Empty Queue");
			return;
		}
		else
		{
			out.println("Queue Elements displayed");
			for(int i = front; i <= rear; i++)
			{
				out.print(queue[i] + ", ");
			}
			out.println();
		}
	}
	
}
