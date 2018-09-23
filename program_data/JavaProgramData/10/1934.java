package <missing>;

public class GlobalMembers
{
	public static int xxx(int high, int j)
	{
		if (j == n - 1)
		{
			if (high >= x[j])
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		else
		{
			if (high < x[j])
			{
				return xxx(high, j + 1);
			}
			else
			{
				return max(1 + xxx(x[j], j + 1), xxx(high, j + 1));
			}
		}
	}
	public static int max(int b,int c)
	{
		if (b >= c)
		{
			return b;
		}
		else
		{
			return c;
		}
	}
	public static int n;
	public static int[] x = new int[26];
	public static int Main()
	{
		int i;
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] h = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				h[i] = Integer.parseInt(tempVar2);
			}
			x[i] = h[i];
			//printf(" %d",x[i]);
		}
		for (i = n;i < 26;i++)
		{
			x[i] = 999999;
		}
		int fly;
		fly = xxx(999999, 0);
		System.out.printf("%d",fly);

	}
}

