public class data
{
	public int w;
	public String c = new String(new char[20]);
	public int old;
	public data next;
	public data onext;
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
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		data head = new data();
		data p;
		data pp;
		data de;
		pp = head;
		for (i = 0;i < n;i++)
		{
			p = new data();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.c = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.w = Integer.parseInt(tempVar3);
			}
			p.old = 0;
			pp.next = p;
			pp = p;
		}
		data old = new data();
		pp = head.next;
		de = old;
		x = 0;
		for (i = 0;i < n;i++)
		{
			if (pp.w > 59)
			{
				pp.old = 1;
				de.onext = pp;
				de = pp;
				x++;
			}
			pp = pp.next;
		}


		for (i = 0;i < x;i++)
		{
			pp = old.onext;
			max = 0;
			for (j = 0;j < x;j++)
			{
				if (pp.w > max)
				{
					max = pp.w;
					de = pp;
				}
				pp = pp.onext;
			}
			System.out.printf("%s\n",de.c);
			de.w = -1;
		}
		pp = head.next;
		for (i = 0;i < n;i++)
		{
			if (pp.old == 0)
			{
				System.out.printf("%s\n",pp.c);
			}
			pp = pp.next;

		}
	}
}

