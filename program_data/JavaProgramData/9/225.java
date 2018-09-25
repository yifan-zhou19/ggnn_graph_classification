public class Node
{
	public String ID = new String(new char[11]);
	public int age;
	public Node next;
}

package <missing>;

public class GlobalMembers
{
	public static Node creat(int n)
	{
		Node p1;
		Node p2;
		Node head;
		int i;
		p1 = p2 = new Node();
		head = p1;
		for (i = 0;i < n;i++)
		{
			p2 = p1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.ID = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.age = Integer.parseInt(tempVar2);
			}
			p1 = new Node();
			p2.next = p1;
		}
		p2.next = null;
		return (head);
	}
	public static void sort(int x, tangible.RefObject<String> a, Node head)
	{
		Node pre = head;
		Node p = pre.next;
		Node s;
		s = new Node();
		s.age = x;
		s.ID = a.argValue;
		s.next = null;
		while (p != null && x <= p.age)
		{
			pre = p;
			p = p.next;
		}
		pre.next = s;
		s.next = p;
	}
	public static void print(Node head)
	{
		Node p;
		p = head;
		while (p != null)
		{
			System.out.printf("%s\n",p.ID);
			p = p.next;
		}
	}
	public static void Main()
	{
		int n;
		Node head1;
		Node head2;
		Node p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head1 = creat(n);
		head2 = new Node();
		head2.ID = " ";
		head2.next = null;
		p = head1;
		while (p != null)
		{
			if (p.age >= 60)
			{
			tangible.RefObject<String> tempRef_ID = new tangible.RefObject<String>(p.ID);
				sort(p.age, tempRef_ID, head2);
				p.ID = tempRef_ID.argValue;
			}
			p = p.next;
		}
		head2 = head2.next;
		print(head2);
		p = head1;
		while (p != null)
		{
			if (p.age < 60)
			{
				System.out.printf("%s\n",p.ID);
			}
			p = p.next;
		}
	}

}

