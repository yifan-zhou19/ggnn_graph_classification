package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int p;
		int q;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			c = Integer.parseInt(tempVar4);
		}
		if (a > b && a > c && b > c)
		{
			p = a;
			q = b;
		}
		else if (a > b && a > c && c > b)
		{
			p = a;
			q = c;
		}
		else if (b > a && b > c && a > c)
		{
			p = b;
			q = a;
		}
		else if (b > a && b > c && c > a)
		{
			p = b;
			q = c;
		}
		else if (c > a && c > b && a > b)
		{
			p = c;
			q = a;
		}
		else if (c > a && c > b && b > a)
		{
			p = c;
			q = b;
		}
		i = 4;
		while (i <= n)
		{
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				d = Integer.parseInt(tempVar5);
			}
			if (d > p)
			{
				q = p;
				p = d;
			}
			else if (d < p && d> q)
			{
				q = d;
			}
			i++;
		}
		System.out.printf("%d\n%d\n",p,q);
		return 0;
	}

}

