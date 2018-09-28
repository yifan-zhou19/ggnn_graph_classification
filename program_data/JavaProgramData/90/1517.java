package <missing>;

public class GlobalMembers
{
	public static int way(int m, int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else if (m == n)
		{
			return way(m, n - 1) + 1;
		}
		else if (m < n)
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
		int N;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < N;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					n = Integer.parseInt(tempVar3);
				}
				System.out.printf("%d\n",way(m, n));
		}
	}

}

