public class person
{
	public String c = new String(new char[10]);
	public int a;
	public person next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		person head;
		person p1;
		person p2;
		person p;
		person p0;
		person p3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 0;
		head = null;
		while (i < n)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (person)malloc(len);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.c = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.a = Integer.parseInt(tempVar3);
			}
			if (i == 0)
			{
				head = p1;
				p2 = p1;
			}
			else
			{
				p2.next = p1;
				p2 = p1;
			}
			i++;
		}
		p2.next = null;
		for (i = 0;i < n;i++)
		{
			p = p0 = head;
			while (p != null)
			{
				if (p.a > p0.a)
				{
					p0 = p;
				}
				p = p.next;
			}
			if (p0.a >= 60)
			{
				System.out.printf("%s\n",p0.c);
				p = head;
				while (p.a != p0.a)
				{
					p3 = p;
					p = p.next;
				}
				if (p == head)
				{
					head = p.next;
				}
				else
				{
					p3.next = p.next;
				}
			}
			else
			{
				System.out.printf("%s\n",head.c);
				head = head.next;
			}
		}
	}

}

