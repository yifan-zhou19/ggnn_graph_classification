public class info
{
	public int num;
	public String data = new String(new char[10]);
	public info next;
	public int tip;
}

package <missing>;

public class GlobalMembers
{
	public static info create(int n)
	{
		info p1;
		info pre;
		info p2;
		info head;
		info tail;
		int i;
		int t;
		head = new info();
		p1 = new info();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.data = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		head.next = p1;
		p1.next = null;
		tail = p1;
		i = 0;
		while (i < n - 1)
		{
			t = 0;
			p1 = new info();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.data = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			p1.next = null;
			if (p1.num >= 60)
			{
				for (pre = head, p2 = head.next;p2 != null && p2.num >= 60;pre = pre.next, p2 = p2.next)
				{
				if (p2.num < p1.num)
				{
					pre.next = p1;
					p1.next = p2;
					t = 1;
					break;
				}
				}
				if (t == 0)
				{
				pre.next = p1;
				p1.next = p2;
				if (p2 == null)
				{
					tail = p1;
				}
				}
			}
			else
			{
				tail.next = p1;
				tail = p1;
			}
		i++;
		}
		return head;
	}
	public static void print(info head)
	{
		info p;
		p = head.next;
		while (p != null)
		{
			System.out.printf("%s\n",p.data);
			p = p.next;
		}
	}
	public static int Main()
	{
		int n;
		info head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);
		print(head);
	}


}

