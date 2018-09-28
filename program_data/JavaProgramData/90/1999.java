package <missing>;

public class GlobalMembers
{
	public static int fang(int m,int n)
	{
		int c;
		if (n == 1)
		{
			c = 1;
		}
		else if (m == 1)
		{
			c = 1;
		}
		else if (m == 0)
		{
			c = 1;
		}

		else if (m >= n)
		{
			c = fang(m, n - 1) + fang(m - n, n);
		}
		else if (m < n)
		{
			c = fang(m, m);
		}
		return (c);
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		int i;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			c = fang(m, n);
			System.out.printf("%d\n",c);
		}
	}
}

