package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[600];
		int[] szo = new int[600];
		int k = 0;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (int j = 0;j < n;j++)
		{
			if (sz[j] % 2 != 0)
			{
				szo[k] = sz[j];
				k++;
			}
		}
		for (int p = 1;p < k - 1;p++)
		{
			for (int o = 0;o < k - p;o++)
			{
				if (szo[o] > szo[o + 1])
				{
					a = szo[o + 1];
					szo[o + 1] = szo[o];
					szo[o] = a;
				}
			}
		}
		for (int q = 0;q < k;q++)
		{
			if (q == k - 1)
			{
				System.out.printf("%d",szo[q]);
			}
			else
			{
				System.out.printf("%d,",szo[q]);
			}
		}
		return 0;
	}
}

