package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//


	public static int f(int x,int y)
	{
		int i;
		int a = 1;
		if (x < y)
		{
			return 0;
		}
		if (x == y)
		{
			return 1;
		}
		if (x > y)
		{
			if (y == 1)
			{
				for (i = y + 1;i <= x;i++)
				{
					if (x % i == 0)
					{
						a = a + f(x / i, i);
					}
				}
			}
			else
			{
				for (i = y;i <= x;i++)
				{
					if (x % i == 0)
					{
						a = a + f(x / i, i);
					}
				}
			}
			return a;
		}
	}

	public static int Main()
	{
		int n;
		int j;
		int b = 0;
		int p;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		for (k = 1;k <= p;++k)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		b = f(n, 1);
		System.out.printf("%d\n",b);
		}
		return 0;
	}

}

