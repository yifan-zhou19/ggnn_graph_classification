package <missing>;

public class GlobalMembers
{
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		else
		{
			return b;
		}
	}
	public static int solve(int k, int h, int[] p, int n)
	{
		if (k == n)
		{
			return 0;
		}
		if (p[k] == h)
		{
			return 1 + solve(k + 1, h, p, n);
		}
		if (p[k] > h)
		{
			return solve(k + 1, h, p, n);
		}
		return max(solve(k + 1, h, p, n), 1 + solve(k + 1, p[k], p, n));
	}
	public static int Main()
	{
		int n;
		int[] p = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",solve(0, 100000, p, n));
		return 0;
	}

}

