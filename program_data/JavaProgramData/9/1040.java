public class bin
{
	public String ID = new String(new char[10]);
	public int age;
	public bin next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		bin head;
		bin p;
		bin p1;
		bin p2;
		bin p3;
		int m;
		int n;
		int i;
		int j;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = new bin();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p.ID = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p.age = Integer.parseInt(tempVar3);
		}
		head = p3 = p;
		p.next = null;
		for (i = 1;i < n;i++)
		{
			p = new bin();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.ID = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p.age = Integer.parseInt(tempVar5);
			}
			if (p.age < 60)
			{
				p3.next = p;
				p.next = null;
				p3 = p;
			}
			else
			{
				if (p.age > head.age)
				{
					p.next = head;
					head = p;
				}
				else if (p.age <= p3.age)
				{
					p3.next = p;
					p.next = null;
					p3 = p;
				}
				else
				{
					p1 = head;
					p2 = p1.next;
					while (p2.age >= p.age)
					{
						p1 = p1.next;
						p2 = p2.next;
					}
					p1.next = p;
					p.next = p2;
				}
			}
		}
		for (;head != 0;head = head.next)
		{
			System.out.printf("%s\n",head.ID);
		}
	}
}

