package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int a = 0;
		int b = 0;
		int c = 1;
		int[][] sz = new int[50000][2];
		int[] sz1 = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < 2;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					(sz[j][i]) = Integer.parseInt(tempVar2);
				}
			}
		}
		k = sz[0][0];
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < 2;i++)
			{
				if (k < sz[j][i])
				{
					k = sz[j][i];
				}
			}
		}
		m = sz[0][0];
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < 2;i++)
			{
				if (m > sz[j][i])
				{
					m = sz[j][i];
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			sz1[i] = 0;
		}
		for (j = 0;j < n;j++)
		{
			a = sz[j][0];
			b = sz[j][1];
			for (i = a;i < b;i++)
			{
				sz1[i] = 1;
			}
			if (b == k)
			{
				sz1[k] = 1;
			}
		}
		for (i = m;i < k;i++)
		{
			if (sz1[i] == 0)
			{
				c = 0;
			}
		}
		if (c == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d ",m);
			System.out.printf("%d",k);
		}
		return 0;
	}

}

