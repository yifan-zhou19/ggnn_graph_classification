package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int ans;
		int solve = new int(int n, int m);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		while (!(n == 0 && m == 0))
		{
			ans = solve(n, m);
			if (ans == 0)
			{
				ans = n;
			}
			System.out.printf("%d\n", ans);
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}
	public static int solve(int n, int m)
	{
		int ans;
		if (n == 1)
		{
			return 1;
		}
		ans = (m % n + solve(n - 1, m)) % n;
		if (ans == 0)
		{
			ans = n;
		}
		return ans;
	}

}

