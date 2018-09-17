package <missing>;

public class GlobalMembers
{
	public static int aa(int[] high, int n, int k, int lh, int point)
	{
		int remax = 0;
		int a = 0;
		int i;
		if (point == k - 1)
		{
			if (lh >= high[k - 1])
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
			for (i = point;i < k;i++)
			{
				if (high[i] <= lh)
				{
					a = aa(high, n + 1, k, high[i], i + 1) + 1;
					if (a > remax)
					{
						remax = a;
					}
				}
			}
			return remax;
		}
	}

	public static void Main()
	{
		int i;
		int[] high = new int[25];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				high[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.printf("%d",aa(high, 0, k, 32767, 0));
	}

}

