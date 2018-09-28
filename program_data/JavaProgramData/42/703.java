public class number
{
	public int num;
	public number next;
}

package <missing>;

public class GlobalMembers
{
	public static number p1;
	public static number p2;
	public static number head;
	public static void Main()
	{
		int n;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = p2 = new number();
		head = null;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
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
			p1 = new number();
		}
		p2.next = null;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		p2 = p1 = head;
		while (p1 != null)
		{
			if (k != p1.num)
			{
				p2 = p1;
				p1 = p1.next;
			}
			else
			{
				if (p1 == head)
				{
					head = p1.next;
					p1 = null;
					p1 = head;
				}
			else
			{
				p2.next = p1.next;
			p1 = null;
			p1 = p2.next;
			}
			}
		}
		for (p1 = head;p1.next != null;p1 = p1.next)
		{
			System.out.printf("%d ",p1.num);
		}
		System.out.printf("%d\n",p1.num);
	}
}

