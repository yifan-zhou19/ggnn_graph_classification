package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[30];
	public static int[] f = new int[30];
	public static int ans;

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 1; i <= n; ++i)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int i = 1; i <= n; ++i)
		{
			for (int j = 1; j <= i; ++j)
			{
				if (a[j] >= a[i] != 0 && f[j] > f[i])
				{
					f[i] = f[j];
				}
			}
			f[i]++;
		}
		ans = 0;
		for (int i = 1; i <= n; ++i)
		{
			if (f[i] > ans)
			{
				ans = f[i];
			}
		}
		System.out.printf("%d\n", ans);
	}

}

