package <missing>;

public class GlobalMembers
{
	public static int way(int m,int n)
	{
		if (m == 0 || n == 1)
		{
			return 1;
		}
		else if (n > m)
		{
			return way(m, m);
		}
		else
		{
			return way(m, n - 1) + way(m - n, n);
		}
	}
	public static int Main()
	{
		int i;
		int t;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
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
			System.out.printf("%d\n",way(m, n));
		}

	return 0;
	}

}

