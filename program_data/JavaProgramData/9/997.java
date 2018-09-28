public class mouse
{
	public int weight;
	public String color = new String(new char[11]);
	public mouse next;
	public mouse before;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		mouse m;
		mouse head;
		mouse p1;
		mouse p2;
		mouse fin;
		head = p1 = p2 =  new mouse();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.color = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.weight = Integer.parseInt(tempVar3);
		}
		for (i = 1;i <= n - 1;i++)
		{
			p1 =  new mouse();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.color = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.weight = Integer.parseInt(tempVar5);
			}
			p2.next = p1;
			p1.before = p2;
			p2 = p1;
		}
		fin = p1;
		p1.next = null;
		for (i = 1;i <= n - 1;i++)
		{
			max = 0;
			p1 = head;
			for (j = 1;j <= n + 1 - i;j++)
			{
				if (p1.weight > max)
				{
					max = p1.weight;
					m = p1;
				}
				p1 = p1.next;
			}
			if (m.weight < 60)
			{
				break;
			}
			System.out.printf("%s\n",m.color);
			if (m == head)
			{
				head = head.next;
				continue;
			}
			if (m == fin)
			{
				fin = fin.before;
				fin.next = null;
				continue;
			}
			if (m != head && m != fin)
			{
				p1 = m.before;
				p1.next = m.next;
				m = m.next;
				m.before = p1;
			}
		}
		p1 = head;
		System.out.printf("%s\n",head.color);
		for (;p1.next != null;)
		{
			p1 = p1.next;
			System.out.printf("%s\n",p1.color);
		}
	}
}

