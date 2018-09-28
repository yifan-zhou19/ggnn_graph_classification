package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int i;
		int n;
		int a;
		int b;
		int k;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n > 1 && n < 100)
		{
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (k = 0;k < n - 1;k++)
		{
			if (sz[k] > sz[k + 1])
			{
				a = sz[k + 1];
				sz[k + 1] = sz[k];
				sz[k] = a;
			}
		}
		for (s = 0;s < n - 2;s++)
		{
			if (sz[s] > sz[s + 1])
			{
				b = sz[s + 1];
				sz[s + 1] = sz[s];
				sz[s] = b;
			}
		}
		}
		System.out.printf("%d\n%d\n",sz[n - 1],sz[n - 2]);
		return 0;
	}

}

