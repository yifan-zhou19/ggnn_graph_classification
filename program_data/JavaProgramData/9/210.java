public class st
{
	public int age;
	public int he;
	public String num = new String(new char[15]);
	public st next;
}

package <missing>;

public class GlobalMembers
{
	public static st creat(int n)
	{
		st head;
		st p1;
		st p2;
		int i;
		int h = 105;
		p1 = new st();
		p2 = p1;
		head = p1;
		for (i = 1;i <= n;i++)
		{
			p1 = new st();
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.age = Integer.parseInt(tempVar2);
			}
			if (p1.age >= 60)
			{
				p1.he = p1.age * 1000 + h;
			}
			else
			{
				p1.he = h;
			}
			p1.next = null;
			p2.next = p1;
			p2 = p1;
			h--;
		}
		return (head);
	}

	public static void paixu(st head)
	{
		st max;
		st p;
		st p1;
		st p2;
		st p3;
		st p4;
		p1 = head;
		while (p1.next != null)
		{
			p2 = p1.next;
			max = p2;
			p4 = p2;
			p = p2.next;
			while (p != null)
			{
				if (p.he > max.he)
				{
					max = p;
					p3 = p4;
				}
				p = p.next;
				p4 = p4.next;
			}
			if (max > p1.next)
			{
				p3.next = max.next;
				p1.next = max;
				max.next = p2;
			}
			p1 = p1.next;
		}
	}

	public static void Main()
	{
		st creat = new st(int n);
		void paixu(struct st * head);
		st head;
		st p;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		paixu(head);
		p = head.next;
		while (p != null)
		{
			System.out.printf("%s\n",p.num);
			p = p.next;
		}
	}
}

