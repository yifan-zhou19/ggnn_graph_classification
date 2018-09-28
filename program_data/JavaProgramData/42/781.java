public class number
{
	public int num;
	public number next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int k;
	public static number creat()
	{
		number head;
		number p1;
		number p2;
		int num = 1;
		head = null;
		while (num <= n)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (number)malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = Integer.parseInt(tempVar);
			}
			if (num == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			num++;
		}
		p2.next = null;
		return (head);
	}
	public static void delet(number pt) //??????????????????????
	{
		number p;
		number pre;
		int sum = 0;
		int i;
		for (p = pt;p != null;p = p.next)
		{
			if (p.num == k)
			{
				sum++;
			}
		}
		for (i = 1;i <= sum;i++)
		{
			for (p = pre = pt;p != null;p = p.next)
			{
				if (p.num != k)
				{
					pre = p;
				}
				else
				{
					break;
				}
			}
			if (p == pt)
			{
				pt = p.next;
			}
			else
			{
				pre.next = p.next;
			}
			p = null;
		}
		for (p = pt;p.next != null;p = p.next)
		{
			System.out.printf("%d ",p.num);
		}
		System.out.printf("%d",p.num);
	}

	public static int Main()
	{
		number pt;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		pt = creat();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		delet(pt);
		return 0;
	}
}

