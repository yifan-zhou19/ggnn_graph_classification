package <missing>;

public class GlobalMembers
{
	public static final int maxn = 25;

	public static int n;
	public static int[] a = new int[maxn + 10];

	public static int ans;

	public static void dfs(int h,int maxH,int now)
	{
		int i;
		if (h == n + 1)
		{
		if (now > ans)
		{
			ans = now;
		}
		return;
		}
		dfs(h + 1, maxH, now);
		if (a[h] <= maxH)
		{
			dfs(h + 1, a[h], now + 1);
		}
	}

	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a + i = tempVar2;
		}
		}
		dfs(1, 1 << 30, 0);
		System.out.printf("%ld\n",ans);
		//getchar();getchar();
		return 0;
	}

}

