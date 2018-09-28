package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int k = 1;k <= n;k++)
		{
			for (int i = 0;i < n - k;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					a = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = a;
				}
			}
		}
		for (int i = n - 1;i >= 0;i--)
		{
			if (sz[i] % 2 != 0)
			{
				b = i;
				break;
			}
		}
		for (int i = 0;i < b;i++)
		{
			if (sz[i] % 2 != 0)
			{
				System.out.printf("%d,",sz[i]);
			}
		}
		System.out.printf("%d",sz[b]);
		return 0;
	}

}

