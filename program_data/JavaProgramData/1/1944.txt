package <missing>;

public class GlobalMembers
{
	public static int sep(int a, int b)
	{
		int i;
		int ans = 0;
		if (a == 1)
		{
			ans = 1;
		}
		for (i = b; i <= a; i++)
		{
			if (a % i == 0)
			{
				ans += sep(a / i, i);
			}
		}
		return ans;
	}
	public static int baka(int a)
	{
		int cirno;
		cirno = sep(a, 2);
		return cirno;
	}
	public static int Main()
	{
		int n;
		int pre;
		int i;
		int j;
		int ans;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pre = Integer.parseInt(tempVar2);
			}
			ans = baka(pre);
			System.out.printf("%d\n", ans);
		}
	}
}

