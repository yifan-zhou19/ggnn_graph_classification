package <missing>;

public class GlobalMembers
{
	public static int[] x = new int[3000];
	public static int[] y = new int[3000];
	public static int n;
	public static int count;
	public static int ans;

	public static void sort(int[] x)
	{
		int i;
		int j;
		int k;
		for (i = 1; i <= n; i++)
		{
			for (j = i + 1; j <= n; j++)
			{
				if (x[i] < x[j])
				{
						k = x[i];
						x[i] = x[j];
						x[j] = k;
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			x[i + n] = x[i];
		}
	}

	public static int Main()
	{
		int i;
		int j;
	while (true)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 0)
		{
			break;
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x + i = tempVar2;
			}
		}
		for (i = 1; i <= n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y + i = tempVar3;
			}
		}
		sort(x);
		sort(y);
		ans = -n * 200;
		for (i = 0; i < n; i++)
		{
			count = 0;
			for (j = 1; j <= n; j++)
			{
				if (x[j] > y[i + j])
				{
					count += 200;
				}
				else
				{
				if (x[j] < y[i + j])
				{
					count -= 200;
				}
				}
			}
			if (count > ans)
			{
				ans = count;
			}
		}
		System.out.printf("%d\n", ans);
	}
	}

}

