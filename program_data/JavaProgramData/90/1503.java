package <missing>;

public class GlobalMembers
{
	public static int find(int m, int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else if (m == n)
		{
			return find(m, n - 1) + 1;
		}
		else if (n > m)
		{
			return find(m, m);
		}
		else
		{
			return find(m, n - 1) + find(m - n, n);
		}
	}
	public static int Main()
	{
		int t;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		while (--t >= 0)
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
			System.out.printf("%d\n", find(m, n));
		}
		return 0;
	}
}

