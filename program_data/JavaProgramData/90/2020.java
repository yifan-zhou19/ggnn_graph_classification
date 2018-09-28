package <missing>;

public class GlobalMembers
{
	public static int count(int m,int n)
	{
		int y;
		if (m == 1 || n == 1)
		{
			y = 1;
		}
		else if (m > n)
		{
			y = count(m - n, n) + count(m, n - 1);
		}
		else if (m == n)
		{
			y = 1 + count(m, n - 1);
		}
		else if (m < n)
		{
			y = count(m, m);
		}
		return y;
	}
	public static int Main()
	{
		int m;
		int n;
		int t;
		int i;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",count(m, n));
		}
		return 0;
	}
}

