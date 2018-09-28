package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int min = 10000;
		int max = 0;
		int p;
		int q = 0;
		int[] az = new int[50000];
		int[] bz = new int[50000];
		int[] sz = new int[10000];
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
				az[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				bz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int k = 0;k < n;k++)
		{
			if (min > az[k])
			{
			   min = az[k];
			}
			if (max < bz[k])
			{
			   max = bz[k];
			}
		}
		p = max - min;
		for (int m = min;m <= max;m++)
		{
			sz[m] = 0;
		}
		for (int t = 0;t < n;t++)
		{
			for (int x = az[t];x < bz[t];x++)
			{
				sz[x] = 1;
			}
		}
		for (int y = min;y <= max;y++)
		{
			q = q + sz[y];
		}
		if (p == q)
		{
			System.out.printf("%d %d",min,max);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}


}

