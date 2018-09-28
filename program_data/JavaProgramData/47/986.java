package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int e;
		int m;
		int k;
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
					sz[i] = Integer.parseInt(tempVar2);
				}
		}
		m = n - 1;
		k = 0;
		while (k < m)
		{
					e = sz[k];
					sz[k] = sz[m];
					sz[m] = e;
					k += 1;
					m -= 1;
		}
		for (int i = 0;i < n - 1;i++)
		{
				System.out.printf("%d ",sz[i]);
		}
		System.out.printf("%d",sz[n - 1]);

			return 0;
	}

}

