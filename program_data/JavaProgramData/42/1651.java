public class num
{
	public int n;
	public num next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		num p1;
		num p2;
		num head;
		num temp;
		int n;
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			p1 = new num();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.n = Integer.parseInt(tempVar2);
			}
			if (i == 0)
			{
				p2 = p1;
				head = p1;
			}
			else
			{
				p2.next = p1;
				p2 = p1;
			}
		}
		p1.next = null;

		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}

		p1 = p2 = head;
		while (p1 != null)
		{
			if (p1.n == k)
			{
				if (p1 == head)
				{
					head = p1.next;
				}
				else
				{
					p2.next = p1.next;
				}
				p1 = p1.next;
			}
			else
			{
				p2 = p1;
				p1 = p1.next;
			}
		}
		System.out.printf("%d",head.n);
		p1 = head.next;
		while (p1 != null)
		{
			System.out.printf(" %d",p1.n);
			p1 = p1.next;
		}
		p1 = head;
		while (p1 != null)
		{
			temp = p1;
			p1 = p1.next;
			temp = null;
		}
		return 0;

	}
}

