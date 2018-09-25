//C++ TO JAVA CONVERTER NOTE: Java has no need of forward class declarations:
//struct Node;
public class Node
{
	public int x;
	public String id = new String(new char[20]);
	public Node next;
}

package <missing>;

public class GlobalMembers
{
	public static Node create() //??head
	{
		Node p;
		p = new Node();
		p.next = null;
		return p;
	}

	public static void sort(Node head, int n) //head???????n???
	{
		Node p = null;
		Node q = null;
		Node s = null;
		int i;
		for (i = 1;i <= n;i++)
		{
		s = new Node();
		s.next = null;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			s.x = Integer.parseInt(tempVar2);
		}
		if (s.x < 60)
		{
			p = head;
			while (p.next != null)
			{
				p = p.next;
			}
			p.next = s;
		}
		else
		{
			q = head;
			p = head.next;
			while (p != null)
			{
				if (p.x < s.x)
				{
					break;
				}
				q = p;
				p = p.next;
			}
			q.next = s;
			s.next = p;
		}
		}
	}

	public static void outputdata(Node p) //??head
	{
		p = p.next;
		while (p.next != null)
		{
		  System.out.printf("%s\n",p.id);
		  p = p.next;
		}
		System.out.printf("%s\n",p.id);
	}


	public static int Main()
	{
		Node head;
		int n;
		head = create();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sort(head, n);
		outputdata(head);

		return 0;
	}

}

