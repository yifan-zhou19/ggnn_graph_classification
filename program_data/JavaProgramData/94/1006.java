package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e;
		int n;
		int k;
		int i;
		int t;
		int[] sz = new int[500];
		int[] hz = new int[500];
		t = -1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				hz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (hz[i] % 2 == 1)
			{
				t = t + 1;
				sz[t] = hz[i];
			}
		}
	for (k = 1;k <= t + 1;k++)
	{
		for (i = 0;i < t - k + 1;i++)
		{
				if (sz[i] > sz[i + 1])
				{
						e = sz[i + 1];
						sz[i + 1] = sz[i];
						sz[i] = e;
				}
		}
	}
		for (i = 0;i < t + 1;i++)
		{
			if (i == t)
			{
				System.out.printf("%d",sz[i]);
			}
			else
			{
				System.out.printf("%d,",sz[i]);
			}
		}
		return 0;
	}
}

