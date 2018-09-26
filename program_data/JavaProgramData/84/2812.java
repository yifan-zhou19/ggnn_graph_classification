package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int n;
		int i;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if (b > c)
		{
			e = b;
			b = c;
			c = e;
		}

		for (i = 3;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a = Integer.parseInt(tempVar4);
			}

			if (a > c)
			{
				e = c;
				c = a;
				b = e;
			}
			else if ((a > b) && (a <= c))
			{
				b = a;
			}
			else
			{
				continue;
			}

		}

		System.out.printf("%d\n%d\n",c,b);
		return 0;
	}
}

