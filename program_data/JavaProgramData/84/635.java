package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		int d;
		int i;
		int k;
		int h;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n - 1];
		for (k = 0;k <= n - 1;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[k] = Integer.parseInt(tempVar2);
			}
		}

			for (i = 0;i < n - 1;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
			   sz[i] = e;

				}
			}


			for (i = 0;i < n - 2;i++)
			{
				 if (sz[i] > sz[i + 1])
				 {
					d = sz[i + 1];
					sz[i + 1] = sz[i];
			   sz[i] = d;
				 }
			}
		System.out.printf("%d\n%d\n",sz[n - 1],sz[n - 2]);
		return 0;
	}
}

