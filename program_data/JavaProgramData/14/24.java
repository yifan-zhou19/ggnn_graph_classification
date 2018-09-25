public class stu
{
	public int xh;
	public int yw;
	public int sx;
	public int zh;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu scan()
	{
		int n;
		int num = 0;
		stu head;
		stu p1;
		stu p2;
		p1 = p2 = new stu();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	//	head=0;
		head = p1;
		while (num < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.xh = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.yw = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.sx = Integer.parseInt(tempVar4);
			}
			p1.zh = p1.yw + p1.sx;
			p2 = p1;
			p1 = new stu();
			p2.next = p1;
			p1.next = null;
			num++;
		}
		return (head);
	}
	public static stu del(stu head, int max)
	{
		stu p1;
		stu p2;
		p1 = head;
		while (max != p1.zh && p1.next != 0)
		{
			p2 = p1;
			p1 = p1.next;
		}
		if (max == p1.zh)
		{
			if (p1 == head)
			{
				head = p1.next;
			}
			else
			{
				p2.next = p1.next;
			}
		}
		return (head);
	}
	public static void print(stu head)
	{
		stu p;
		stu p1;
		stu p2;
		stu p3;
		stu w;
		int max = 0;
		int num = 0;
		while (num < 3)
		{
			for (p = head;p != 0;p = p.next)
			{
				if (p.zh > max)
				{
					max = p.zh;
					w = p;
				}
			}
			num++;
			if (num == 1)
			{
				p1 = w;
				head = del(head, max);
				max = 0;
			}
			if (num == 2)
			{
				p2 = w;
				head = del(head, max);
				max = 0;
			}
			if (num == 3)
			{
				p3 = w;
			}
		}
		System.out.printf("%ld %d\n%ld %d\n%ld %d\n",p1.xh,p1.zh,p2.xh,p2.zh,p3.xh,p3.zh);
	}
	public static void Main()
	{
		stu head;
		head = scan();
		print(head);
	}
}

