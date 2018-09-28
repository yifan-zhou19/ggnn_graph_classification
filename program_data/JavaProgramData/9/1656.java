public class ren
{
	public String id = new String(new char[12]);
	public int ye;
	public ren next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String c = new String(new char[12]);
		int y;
		int r;
		ren p1;
		ren p2;
		ren head;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = new ren();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			y = Integer.parseInt(tempVar3);
		}
		head.id = c;
		head.ye = y;
		head.next = null;
		for (i = 2; i <= n; i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				y = Integer.parseInt(tempVar5);
			}
			p1 = new ren();
			p1.id = c;
			p1.ye = y;
			p1.next = null;
			if (y < 60)
			{
				p2 = head;
				while (p2.next != 0)
				{
					p2 = p2.next;
				}
				p2.next = p1;
			}
			else
			{
				p2 = head;
				if (y > p2.ye)
				{
					p1.next = head;
					head = p1;
				}
				else
				{
					r = 0;
					while (p2.next != 0)
					{
						if (p2.ye >= y != 0 && p2.next.ye < y)
						{
							r = 1;
							p1.next = p2.next;
							p2.next = p1;
							break;
						}
						p2 = p2.next;
					}
					if (r == 0)
					{
						p2.next = p1;
					}
				}
			}
		}
		p1 = head;
		do
		{
			System.out.printf("%s\n", p1.id);
			p1 = p1.next;
		} while (p1 != 0);
	}
}

