public class st
{
		public String a = new String(new char[20]);
		public int x;
		public st next;
}

package <missing>;

public class GlobalMembers
{
	public static int i;
	public static int j;
	public static int n;
		public static st p1;
		public static st p2;
		public static st p;
		public static st head;
		public static st pre;
	public static void Main()
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	void f(struct st *);
	p1 = p2 = head = new st();
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.x = Integer.parseInt(tempVar3);
			}
			p1 = new st();
			p2.next = p1;
			p2 = p1;
		}
		f(head);
	p = head;
	for (i = 0;i < n;i++)
	{
		System.out.printf("%s\n",p.a);
		p = p.next;
	}
	}
	public static void f(st p)
	{
	for (i = 0;i < n - 1;i++)
	{
			pre = p1 = p2 = head;
			p1 = p1.next;
			for (j = 0;j < n - 1 - i;j++)
			{
				if (p1.x > p2.x && p1.x >= 60)
				{
				if (j == 0)
				{
					p2.next = p1.next;
					p1.next = p2;
					head = pre = p1;
				}
				else
				{
					p2.next = p1.next;
					p1.next = p2;
					pre.next = p1;
				}
				}
				if (j != 0)
				{
					pre = pre.next;
				}
				p2 = pre.next;
				p1 = p2.next;
			}
	}
	}


}

