package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[LEN];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		if (n % 2 == 1)
		{
			for (i = 0;i < n / 2 + 1;i++)
			{
				e = sz[i];
				sz[i] = sz[n - i - 1];
				sz[n - i - 1] = e;
			}
			System.out.printf("%d",sz[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",sz[i]);
		}
		}
		else
		{
			for (i = 0;i < n / 2;i++)
			{
				e = sz[i];
				sz[i] = sz[n - i - 1];
				sz[n - i - 1] = e;
			}
			System.out.printf("%d",sz[0]);
		for (i = 1;i < n;i++)
		{
			System.out.printf(" %d",sz[i]);
		}
		}
	return 0;
	}
}

