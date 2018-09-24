package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int a;
		int b;
		int c;
		int d;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		a = m / 2;
		for (i = 3;i <= a;i++)
		{
			for (b = 2;b < i;b++)
			{
				c = i % b;
				if (c == 0)
				{
					b = i;
				}
			}
			if (c == 0)
			{
				continue;
			}
			else
			{
				d = m - i;
				for (b = 2;b < d;b++)
				{
				c = d % b;
				if (c == 0)
				{
					b = d;
				}
				}
			}
			if (c != 0)
			{
				System.out.printf("%d %d\n",i,d);
			}
		}
			return 0;
	}


}

