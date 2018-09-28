public class data
{
	public int num;
	public data next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		data p1;
		data p2;
		data head;
		data temp;
		int i;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			p1 = new data();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
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
		}
		p1.next = null;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		p1 = head;
		p2 = head;
		while (p1 != null)
		{
			if (p1.num == m)
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
		p1 = head;
		System.out.printf("%d",p1.num);
		p1 = p1.next;
		while (p1 != null)
		{
			System.out.printf(" %d",p1.num);
			p1 = p1.next;
		}
		p1 = head;
		while (p1 != null)
		{
			temp = p1;
			p1 = p1.next;
			temp = null;
		}
		head = null;
		return 0;
	}
}

