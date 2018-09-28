public class mon
{
	public int i;
	public mon next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static mon creat(int n)
	{
		mon head;
		mon p1;
		mon p2;
		int t;
		p1 = p2 = new mon();
		head = p1;
		for (t = 1;t < n;t++)
		{
			p1.i = t;
			p1 = new mon();
			p2.next = p1;
			p2 = p1;
		}
		p1.i = t;
		p1.next = head;
		return head;
	}
	public static int find(mon head, int m)
	{
		mon p1 = head;
		mon p2 = head;
		int i = 1;
		for (p1 = p2 = head;;i++)
		{
			if (m == 1)
			{
				return n;
			}
			if (i % m != 0)
			{
				p2 = p1;
				p1 = p1.next;
			}
			else if (i % m == 0)
			{
				p2.next = p1.next;
				p1 = p1.next;
			}
			if (p1 == p1.next)
			{
				return p1.i;
			}
		}
	}
	public static void Main()
	{
		mon head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while (n != 0 && m != 0)
		{
			head = creat(n);
			System.out.printf("%d\n",find(head, m));
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		}
	}


}

