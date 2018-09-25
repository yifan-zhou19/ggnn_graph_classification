package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] a = new int[15];
	public static double ck(int x)
	{
		if (x >= 90)
		{
			return 4.0;
		}
		if (x >= 85)
		{
			return 3.7;
		}
		if (x >= 82)
		{
			return 3.3;
		}
		if (x >= 78)
		{
			return 3.0;
		}
		if (x >= 75)
		{
			return 2.7;
		}
		if (x >= 72)
		{
			return 2.3;
		}
		if (x >= 68)
		{
			return 2.0;
		}
		if (x >= 64)
		{
			return 1.5;
		}
		if (x >= 60)
		{
			return 1.0;
		}
		return 0;
	}
	public static int Main()
	{
		while (scanf("%d",n) == 1)
		{
			int sum1 = 0;
			double sum2 = 0;
			for (int i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a + i = tempVar;
				}
				sum1 += a[i];
			}
			for (int i = 0;i < n;i++)
			{
				int tmp;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tmp = Integer.parseInt(tempVar2);
				}
				sum2 += ck(tmp) * a[i];
			}

			System.out.printf("%.2f\n",sum2 / sum1);
		}
		return 0;
	}

}

