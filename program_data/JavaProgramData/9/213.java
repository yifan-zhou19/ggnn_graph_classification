public class student
{
	public String c = new String(new char[20]);
	public int num;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
		int i;
		int r;
		student p;
		student p1;
		student p2;
		student p3;
		student p4;
		p1 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.c = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		p1.next = null;
		p = p1;
		r = 0;
		p2 = p1;
		for (i = 0;i < n - 1;i++)
		{
			p4 = new student();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p4.c = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p4.num = Integer.parseInt(tempVar4);
			}
			if (p4.num >= 60)
			{
			for (p2 = p,p3 = p,r = 0;p2 != null;)
			{
				if (p4.num > p2.num)
				{
					if (p2 == p3)
					{
						p = p4;
						p4.next = p2;
					}
					else
					{
						p3.next = p4;
						p4.next = p2;
					}
					r = 1;
					break;
				}
				if (p4.num <= p2.num)
				{
					p3 = p2;
					p2 = p2.next;
				}
			}
			if (r == 0)
			{
				p3.next = p4;
				p4.next = null;
			}
			}
			else
			{
				p2 = p;
				while (p2 != null)
				{
					p3 = p2;
					p2 = p2.next;
				}
				p3.next = p4;
				p4.next = null;
			}

		}
		return p;
	}
	public static void print(student p)
	{
		student p1;
		p1 = p;
		while (p1 != null)
		{
			System.out.printf("%s\n",p1.c);
			p1 = p1.next;
		}
	}
	public static void Main()
	{
		student p;
		student p1;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = creat(n);
		print(p);
	}

}

