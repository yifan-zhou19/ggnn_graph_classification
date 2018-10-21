package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		int c;
		int d;
		int e;
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
		if (a >= b)
		{
			c = a;
			d = b;
		}
		else
		{
			c = b;
			d = a;
		}
		for (int i = 0;i < n - 2;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				e = Integer.parseInt(tempVar4);
			}
			if (e >= c)
			{
				d = c;
				c = e;
			}
			else if (e < c && e >= d)
			{
				d = e;
			}
		}
		System.out.printf("%d\n%d\n",c,d);
		return 0;
	}

}

