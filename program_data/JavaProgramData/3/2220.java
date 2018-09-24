package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m;
		int e = 0;
		int[] sz = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(sz[n - 1]) = Integer.parseInt(tempVar4);
		}
		for (int j = 0;j < n;j++)
		{
			m = sz[j];
			sz[j] = sz[0];
			sz[0] = m;
			for (int p = 1;p < n;p++)
			{
				if (sz[j] + sz[p] == k)
				{
					e = 1;
				}
			}
		}
		if (e == 0)
		{
			System.out.print("no");
		}
		else if (e == 1)
		{
			System.out.print("yes");
		}
	return 0;
	}

}

