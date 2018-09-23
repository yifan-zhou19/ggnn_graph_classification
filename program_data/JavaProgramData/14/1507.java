public class a
{
	public String No = new String(new char[20]);
	public int y;
	public int s;
	public a next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static a creat()
	{
		a p1;
		a p2;
		a head;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (a)malloc(LEN);
		head = null;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.No = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.y = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.s = Integer.parseInt(tempVar4);
			}
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (a)malloc(LEN);
		}
		p2.next = null;
		return (head);
	}

	public static int Main()
	{
		a head;
		a p1;
		a p2;
		a p;
		int i;
		int j;
		int k;
		int m1;
		int m2;
		String r = new String(new char[10]);
		head = creat();
		for (p1 = head,j = 0;p1 != null;p1 = p1.next)
		{
			k = p1.y + p1.s;
			if (k > j)
			{
				p = p1;
				j = k;
				m1 = p1.y;
				m2 = p1.s;
				r = p1.No;
			}
		}
		System.out.printf("%s %d\n",r,j);
		for (p1 = head;p1 != null;)
		{
			p2 = p1;
			p1 = p1.next;
			if (p1 == p)
			{
				p2.next = p1.next;
				break;
			}
			else if (p2 == p)
			{
				head = p1.next;
				break;
			}
		}
		for (p1 = head,j = 0;p1 != null;p1 = p1.next)
		{
			k = p1.y + p1.s;
			if (k > j)
			{
				p = p1;
				j = k;
				m1 = p1.y;
				m2 = p1.s;
				r = p1.No;
			}
		}
		System.out.printf("%s %d\n",r,j);
		for (p1 = head;p1 != null;)
		{
			p2 = p1;
			p1 = p1.next;
			if (p1 == p)
			{
				p2.next = p1.next;
				break;
			}
			else if (p2 == p)
			{
				head = p1.next;
				break;
			}
		}
		for (p1 = head,j = 0;p1 != null;p1 = p1.next)
		{
			k = p1.y + p1.s;
			if (k > j)
			{
				p = p1;
				j = k;
				m1 = p1.y;
				m2 = p1.s;
				r = p1.No;
			}
		}
		System.out.printf("%s %d",r,j);
	}
}

