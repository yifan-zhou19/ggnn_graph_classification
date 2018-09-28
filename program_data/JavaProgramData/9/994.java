public class stu
{
	public int w;
	public String c = new String(new char[10]);
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu creat(int m)
	{
		stu head;
		stu p1;
		stu p2;
		stu p3;
		int i;
		n = 0;
		p1 = p2 = new stu();
		head = p1;
		p1.next = null;
		n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.c = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.w = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m - 1;i++)
		{
			p1 = new stu();
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.c = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.w = Integer.parseInt(tempVar4);
		}
		if (p1.w < 60)
		{
			for (p2 = head;p2.next != null;p2 = p2.next)
			{
				;
			}
			p2.next = p1;
			p1.next = null;
		}
		else
		{
		p2 = head;
		while ((p1.w <= p2.w) && (p2.next != null))
		{
			p3 = p2;
			p2 = p2.next;
		}
		if (p1.w > p2.w)
		{
			if (head == p2)
			{
				head = p1;
			}
			else
			{
				p3.next = p1;
			}
			p1.next = p2;
		}
		else
		{
			p2.next = p1;
			p1.next = null;
		}
		}
		}
		 return (head);

	}
	public static void Main()
	{
		int m;
		int i;
		stu head;
		stu p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		head = creat(m);
		p = head;
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",p.c);

			p = p.next;
		}

	}
}

