package <missing>;

public class GlobalMembers
{
	public static int n;
//C++ TO JAVA CONVERTER WARNING: The right shift operator was replaced by Java's logical right shift operator since the left operand was originally of an unsigned type, but you should confirm this replacement:
	public static int[] a = {~0>>>1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	public static int[] f = new int[29];
	public static int ans = 0;

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
			for (int j = 0; j < i; ++j)
			{
				if (a[i] <= a[j] != 0 && f[i] < f[j] + 1)
				{
					f[i] = f[j] + 1;
				}
			}

			if (f[i] > ans)
			{
				ans = f[i];
			}
		}

		System.out.printf("%d\n", ans);
		return 0;
	}

}

