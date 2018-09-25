package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int ans;
	public static int[] a = new int[20];

	public static void calc(int dep, int x)
	{
		if (x == 1)
		{
			ans++;
			return;
		}
		for (int i = a[dep - 1]; i <= x; i++)
		{
			if ((x % i) == 0)
			{
				a[dep] = i;
				calc(dep + 1, x / i);
			}
		}
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (a[0] = 2;n != 0; n--)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			ans = 0;
			calc(1, m);
			System.out.printf("%d\n", ans);
		}
		return 0;
	}
}

